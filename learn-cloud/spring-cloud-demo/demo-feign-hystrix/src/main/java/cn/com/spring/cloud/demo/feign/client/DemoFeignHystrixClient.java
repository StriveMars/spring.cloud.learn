package cn.com.spring.cloud.demo.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *  Feign Hystrix Client
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@FeignClient(value = "demo-service",fallback = DemoFeignHystrixClientHystrix.class)
public interface DemoFeignHystrixClient {

    /**
     * Feign 调用服务
     *
     * @param str
     * @return
     */
    @PostMapping("/demo/service/str")
    String testStr(@RequestBody String str);

}

@Component
class DemoFeignHystrixClientHystrix implements DemoFeignHystrixClient {

    @Override
    public String testStr(String str) {
        return "Error Method Execution sorry,error!";
    }
}


