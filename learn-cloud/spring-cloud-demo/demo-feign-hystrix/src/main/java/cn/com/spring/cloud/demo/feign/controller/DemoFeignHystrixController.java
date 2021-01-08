package cn.com.spring.cloud.demo.feign.controller;

import cn.com.spring.cloud.demo.feign.client.DemoFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Feign Controller
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@RestController
public class DemoFeignHystrixController {

    @Autowired
    DemoFeignHystrixClient client;

    @PostMapping("/web/feign")
    public String ribbonTest(String str) {
        System.out.println("服消费者获取到前端参数为：" + str);
        String string = client.testStr(str);
        return "Feign Client：" + string;
    }

}
