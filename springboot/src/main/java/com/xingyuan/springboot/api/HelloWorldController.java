package com.xingyuan.springboot.api;

import com.xingyuan.springboot.core.annotation.Permission;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World
 *
 * @author chenqiang
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    /**
     * Hello string.
     *
     * @return the string
     */
    @RequestMapping("")
    @Permission
    public String hello() {
        return "Hello World";
    }

    /**
     * Add int.
     *
     * @param x the x
     * @param y the y
     * @return the int
     */
    @GetMapping("add")
    public int add(int x, int y) {

        return (x + y);
    }

}
