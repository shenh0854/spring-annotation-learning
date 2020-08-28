package com.myspring.test;

import com.myspring.bean.Cat;
import com.myspring.bean.Person;
import com.myspring.config.MainConfig;
import com.myspring.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author Steve Shen
 * @version 1.0.0
 * @date 2020/8/27 14:42
 */


public class IoCTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(new Class[]{MainConfig2.class});

    public IoCTest () {

    }

    @Test
    public void test01() {
        System.out.println("IoCÈÝÆ÷Æô¶¯");
        Cat c1 = applicationContext.getBean(Cat.class);
        Cat c2 = applicationContext.getBean(Cat.class);

        //Map<String, Cat> cats = this.applicationContext.getBeansOfType(Cat.class);
        //System.out.println(cats);
        System.out.println(c1 == c2);
    }
}
