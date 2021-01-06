package cn.com.cloud.variant.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/5
 */
@FeignClient(value = "module-demo-service")
public interface DemoFeignService {

    /**
     * Feign 调用服务
     *
     * @param str
     * @return
     */
    @PostMapping("/demo/service")
    String ribbonTest(String str);

}


