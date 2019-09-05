package com.lic.generator.controller;

import com.lic.generator.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lic
 * @data: 2019/9/5
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("t01")
    public String t01() {
        return testService.t01().toString();
    }
}
