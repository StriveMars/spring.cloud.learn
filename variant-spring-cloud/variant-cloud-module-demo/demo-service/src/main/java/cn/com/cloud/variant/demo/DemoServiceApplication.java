package cn.com.cloud.variant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 测试样例Service启动类
 *
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/5
 */
@EnableEurekaClient
@SpringBootApplication
public class DemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

}
