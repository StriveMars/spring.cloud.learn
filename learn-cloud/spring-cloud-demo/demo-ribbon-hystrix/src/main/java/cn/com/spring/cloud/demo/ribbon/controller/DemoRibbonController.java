package cn.com.spring.cloud.demo.ribbon.controller;

import cn.com.spring.cloud.demo.ribbon.client.DemoRibbonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Ribbon Controller
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@RestController
public class DemoRibbonController {

    @Autowired
    DemoRibbonClient client;

    @PostMapping("/web/ribbon")
    public String ribbonTest(String str) {
        System.out.println("服消费者获取到前端参数为：" + str);
        return client.testStr(str);
    }

}
