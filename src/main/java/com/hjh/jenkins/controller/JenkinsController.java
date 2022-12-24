package com.hjh.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Hjh
 * @Date 2022/12/23 13:29
 * 认真写代码，细节决定成败
 * Dignity is only above the sword
 */

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    @GetMapping("/test")
    public String getTest() {
        return "hot deployment";
    }

}
