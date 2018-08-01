package com.xingyuan.springboot.core.aop;

import com.alibaba.fastjson.JSON;
import com.xingyuan.springboot.core.annotation.Permission;
import com.xingyuan.springboot.entity.bo.ResponseResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * PermissionAspect
 *
 * @author chenqiang
 * @date 2018/3/27 16:19
 */
@Aspect
@Component
public class PermissionAspect {

    /**
     * log日志
     */
    private static final Logger logger = LoggerFactory.getLogger(PermissionAspect.class);


    /**
     * 权限验证url .net 接口
     */
    @Value("${permission.check-is-login-url}")
    private String checkIsLoggerUrl;


    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;


    /**
     * 定义拦截规则：拦截controller包下面的所有类中，有@Permission。&& @annotation(com.xingyuan.krhctappapi.core.annotation.Permission)
     */
    @Pointcut("execution(public * com.xingyuan.springboot.api..*(..)) && @annotation(com.xingyuan.springboot.core.annotation.Permission)")
    public void controllerMethodPointcut() {
    }


    /**
     * 拦截器具体实现
     *
     * @param pjp
     * @return JsonResult（被拦截方法的执行结果，或需要登录的错误提示。）
     */
    @Around("controllerMethodPointcut()")
    public Object Interceptor(ProceedingJoinPoint pjp) {

        MethodSignature signature = (MethodSignature) pjp.getSignature();

        //获取被拦截的方法
        Method method = signature.getMethod();

        Object result = null;


        try {

            if (isLoginRequired(method)) {

                if (!checkTokenValid(request)) {


                    response.setStatus(HttpStatus.UNAUTHORIZED.value());

                    String data = "登录已失效！";

                    //获取OutputStream输出流
                    OutputStream outputStream = response.getOutputStream();
                    outputStream.write(data.getBytes("UTF-8"));

                } else {
                    result = pjp.proceed();
                }
            }

        } catch (Throwable e) {
            logger.error("exception: ", e);

            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

            //获取OutputStream输出流
            OutputStream outputStream = null;
            try {
                outputStream = response.getOutputStream();
                outputStream.write(e.getMessage().getBytes("UTF-8"));
            } catch (IOException e1) {
            }
        }

        return result;
    }

    /**
     * 判断一个方法是否需要登录
     *
     * @param method
     * @return 是否需要登录 true是 false 否
     */
    private boolean isLoginRequired(Method method) {

        boolean result = true;
        if (method.isAnnotationPresent(Permission.class)) {
            result = method.getAnnotation(Permission.class).loginRequired();
        }

        return result;
    }


    /**
     * 判断是否已经登录
     *
     * @param request 请求参数
     * @return 是否登录 true：登录 false:未登录
     */
    private boolean checkTokenValid(HttpServletRequest request) {

        //  从请求中获取 token ，调用.net 接口，查看是都登录成功 ，暂时方案，后续用户体系上来后，采用jwt与OAuth2 实现

        String token = request.getHeader("token");

        // 如果token 不为空
        if (token != null && !token.isEmpty()) {

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("token", token);

            HttpEntity<Map<String, String>> requestEntity = new HttpEntity<Map<String, String>>(headers);

            ResponseEntity<String> result = restTemplate.exchange(checkIsLoggerUrl, HttpMethod.GET, requestEntity, String.class);

            if (result.getStatusCode().equals(HttpStatus.OK)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
