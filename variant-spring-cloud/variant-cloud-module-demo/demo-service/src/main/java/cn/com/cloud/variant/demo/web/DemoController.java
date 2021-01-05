package cn.com.cloud.variant.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/5
 */
@RestController
@RequestMapping
public class DemoController {

    @Value("${server.port}")
    private String port;

    @PostMapping("/demo/service")
    public String demoServiceTest(String str) {
        System.out.println(str);
        return "服务端口号:" + port + "成功";
    }

}
