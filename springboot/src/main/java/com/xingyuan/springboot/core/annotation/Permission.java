package com.xingyuan.springboot.core.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 权限验证声明
 *
 * @author chenqiang
 * @date 2018/3/27 11:47
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Permission {

    /**
     * 是否需要登录，缺省为需要
     *
     * @return
     */
    boolean loginRequired() default true;
}
