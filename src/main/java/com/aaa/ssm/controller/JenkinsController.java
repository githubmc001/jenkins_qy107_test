package com.aaa.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * fileName:TestJenkinsController
 * description:
 * author:zz
 * createTime:2020/1/8 16:24
 * version:1.0.0
 */
@RestController
@RequestMapping("testJenkins")
public class JenkinsController {

    /**
     * 打印信息
     * @return
     */
    @RequestMapping("print")
    public Object printInfo(){
        Map map =new HashMap();
        map.put("code",200);
        map.put("message","success1111");
        map.put("jenkins","CI SoftWare");
        return map;
    }
}

