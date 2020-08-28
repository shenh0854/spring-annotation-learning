package com.myspring.config;

import com.myspring.bean.Cat;
import com.myspring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Steve Shen
 * @version 1.0.0
 * @date 2020/8/27 14:44
 */

@Configuration
public class MainConfig2 {

    @Scope("singleton")
    @Bean("person")
    public Person person02() {
        System.out.println("ÈÝÆ÷×°Åäperson¡£¡£¡£");
        return new Person("baker",12);
    }

    @Scope("prototype")
    @Bean("cat")
    public Cat cat01() {
        System.out.println("ÈÝÆ÷×°Åäcat¡£¡£¡£");
        return new Cat("sad", 3);
    }
}
