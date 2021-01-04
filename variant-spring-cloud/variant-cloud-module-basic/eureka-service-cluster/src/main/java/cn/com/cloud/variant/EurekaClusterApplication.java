package cn.com.cloud.variant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 单机Eureka Service 启动类
 *
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/4
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterApplication.class);
    }

}
