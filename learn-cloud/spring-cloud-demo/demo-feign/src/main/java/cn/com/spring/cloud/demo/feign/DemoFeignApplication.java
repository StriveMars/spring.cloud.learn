package cn.com.spring.cloud.demo.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  Feign 启动类
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class DemoFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFeignApplication.class, args);
    }

}
