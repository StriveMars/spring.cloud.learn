package cn.com.spring.cloud.demo.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *  
 *  
 *  @author ：Strive Mars
 *  @since  ：2021/1/8
 */
@Data
@Component
@ConfigurationProperties(prefix = "demo.persion")
public class ConfigProperties {

    private String age;

    private String name;

    private String sex;

}

