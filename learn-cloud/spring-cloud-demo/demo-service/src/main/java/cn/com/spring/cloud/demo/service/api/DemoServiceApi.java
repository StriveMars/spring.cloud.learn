package cn.com.spring.cloud.demo.service.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  服务提供者 API
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@RestController
@RequestMapping(value = "/demo/service")
public class DemoServiceApi {

    private static final String ERROR_STR = "error" ;

    @Value("${server.port}")
    private String port;

    @PostMapping("/str")
    public String testStr(@RequestBody  String str) {
        System.out.println("服务提供者获取到前端参数为：" + str);

        //测试 服务提供者异常后 服务消费者 Hystrix
        if(ERROR_STR.equals(str)){
            throw new RuntimeException();
        }

        return "Service provider port :" + port + " & String Param is :" + str + "--- Success";
    }



}
