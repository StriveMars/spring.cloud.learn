package cn.com.spring.cloud.demo.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  单机版 Eureka 启动类
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaSingletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSingletonApplication.class, args);
    }

}
