package com.yanzige.prometheusresearch.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("test")
public class TestController {

    @GetMapping("/user")
    public String getInfo(@RequestParam String userId) {
        log.info("userId:{}", userId);
        return "123";
    }

    @GetMapping("/app")
    public String getAppInfo(@RequestParam String appId) {
        log.info("appId:{}", appId);
        return "123456";
    }

    @GetMapping("/user/app")
    public String getUserAppInfo(@RequestParam String appId, @RequestParam String userId) {
        log.info("appId:{}", appId);
        log.info("userId:{}", userId);
        return "abc";
    }
}
