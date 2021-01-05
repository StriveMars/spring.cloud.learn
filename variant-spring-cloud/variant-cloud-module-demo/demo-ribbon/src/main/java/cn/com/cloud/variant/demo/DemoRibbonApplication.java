package cn.com.cloud.variant.demo;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 测试样例Ribbon启动类
 *
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/5
 */
@EnableEurekaClient
@SpringBootApplication
public class DemoRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRibbonApplication.class, args);
    }


    @Bean
    //提供负载均衡的功能
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule ribbonRule() {
        return new RoundRobinRule();//这里配置策略，和配置文件对应
    }

}
