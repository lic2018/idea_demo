package com.lic.generator.controller;

import com.lic.generator.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: lic
 * @data: 2019/9/5
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation(value = "测试接口", notes = "hh")
    @RequestMapping(value = "t01",method = RequestMethod.GET)
    public String t01(@RequestBody Map map) {
//        return testService.t01().toString();
        return null;
    }
}
