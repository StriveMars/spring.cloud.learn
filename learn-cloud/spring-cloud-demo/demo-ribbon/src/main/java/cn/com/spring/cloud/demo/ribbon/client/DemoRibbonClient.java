package cn.com.spring.cloud.demo.ribbon.client;

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

    public String testStr(String str) {
        return restTemplate.postForObject(BASIC_URL + "/demo/service/str", str, String.class);
    }


}
