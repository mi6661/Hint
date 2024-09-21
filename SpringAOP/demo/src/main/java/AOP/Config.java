package AOP;
/**
 * 配置类
 * */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AOP")
@EnableAspectJAutoProxy//开启@AspectJ的支持

public class Config {


    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }
}
