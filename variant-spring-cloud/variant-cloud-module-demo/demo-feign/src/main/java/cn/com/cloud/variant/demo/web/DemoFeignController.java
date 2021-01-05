package cn.com.cloud.variant.demo.web;

import cn.com.cloud.variant.demo.client.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/5
 */
@RestController
@RequestMapping
public class DemoFeignController {

    @Autowired
    DemoFeignService service;

    @PostMapping("/web/ribbon")
    public String ribbonTest(String str) {

        System.out.println(str);
        return service.ribbonTest(str);
    }

}
