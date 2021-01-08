package cn.com.spring.cloud.demo.ribbon.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *  Ribbon Client
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@Service
public class DemoRibbonClient {

    @Autowired
    RestTemplate restTemplate;

    private static String BASIC_URL ="http://demo-service";

    @HystrixCommand(fallbackMethod = "errorMethod")
    public String testStr(String str) {
        return restTemplate.postForObject(BASIC_URL + "/demo/service/str", str, String.class);
    }

    public String errorMethod(String str){
        return "Error Method Execution : Data is " + str + ",sorry error!";
    }


}
