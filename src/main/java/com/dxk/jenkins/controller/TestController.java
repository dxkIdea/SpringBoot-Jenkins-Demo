package com.dxk.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description:
 * @Date: 2020/9/21 23:03
 * @Author: dingxingkai
 * @Version: 1.0
 */
@RestController
public class TestController {

    @GetMapping(value = "test")
    public String test(){
        return "Hello World";
    }
}
