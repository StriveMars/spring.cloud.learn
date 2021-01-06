package cn.com.cloud.variant.demo.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/5
 */
@Service
public class DemoRibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorMethod")
    public String ribbonTest(String str) {
        return restTemplate.postForObject("http://module-demo-service" + "/demo/service", str, String.class);
    }

    public String errorMethod(String str){
        return "Error Method Execution : Data is " + str + ",sorry,error!";
    }

}
