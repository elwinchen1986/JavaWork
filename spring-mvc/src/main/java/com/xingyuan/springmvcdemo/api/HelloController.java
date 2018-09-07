package com.xingyuan.springmvcdemo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * HelloController
 *
 * @author chenqiang
 * @date 2018/8/28 17:50
 */
@Controller
public class HelloController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {

        System.out.println("-----------------------------------------");

        return "hello";
    }


}
