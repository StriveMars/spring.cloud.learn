package cn.com.cloud.variant.demo.client;

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

    private static String BASIC_URL ="http://module-demo-service";

    public String ribbonTest(String str) {
        return restTemplate.postForObject(BASIC_URL+"/demo/service", str, String.class);
    }

}
