package cn.com.cloud.variant.demo.hystrix;

import cn.com.cloud.variant.demo.client.DemoFeignService;
import org.springframework.stereotype.Component;

/**
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/5
 */
@Component
public class DemoFeginHystrix implements DemoFeignService {

    @Override
    public String ribbonTest(String str) {
        System.out.println(" ----------- Hystrix -----------");
        return str;
    }
}
