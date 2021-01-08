package cn.com.spring.cloud.demo.config.controller;

import cn.com.spring.cloud.demo.config.properties.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@RestController
public class DemoConfigController {

    @Autowired
    private ConfigProperties properties;

    @GetMapping(value = "/get/config")
    public ConfigProperties getProperties(){
        return properties;
    }
}
