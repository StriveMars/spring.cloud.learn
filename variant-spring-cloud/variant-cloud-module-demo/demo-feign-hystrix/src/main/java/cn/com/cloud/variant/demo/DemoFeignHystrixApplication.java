package cn.com.cloud.variant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 测试样例Ribbon启动类
 *
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/5
 */
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class DemoFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFeignHystrixApplication.class, args);
    }

}
