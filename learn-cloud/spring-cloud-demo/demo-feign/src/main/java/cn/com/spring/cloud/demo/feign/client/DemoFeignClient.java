package cn.com.spring.cloud.demo.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *  Feign Client
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@FeignClient(value = "demo-service")
public interface DemoFeignClient {

    /**
     * String 服务调用
     * @param str
     * @return
     */
    @PostMapping("/demo/service/str")
    String testStr(@RequestBody String str);

}


