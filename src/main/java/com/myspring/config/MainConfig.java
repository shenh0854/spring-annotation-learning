package com.myspring.config;

/**
 * @author Steve Shen
 * @version 1.0.0
 * @date 2020/8/27 14:28
 */

import com.myspring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

@Configuration
@ComponentScans({@ComponentScan(
        value = {"com.myspring"},
        includeFilters = {@Filter(
                type = FilterType.CUSTOM,
                classes = {MyTypeFilter.class} //CUSTOM 自定义扫描，在容器中注册组件
        )},
        useDefaultFilters = false
)})

public class MainConfig {
    public MainConfig() {
    }

    @Bean({"person"})
    public Person person01() {
        return new Person("lisi", 20);
    }
}
