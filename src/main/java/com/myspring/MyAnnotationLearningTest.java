package com.myspring;

/**
 * @author Steve Shen
 * @version 1.0.0
 * @date 2020/8/27 14:27
 */

import com.myspring.bean.Person;
import com.myspring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAnnotationLearningTest {
    public MyAnnotationLearningTest() {
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(new Class[]{MainConfig.class});
        Person bean = (Person)applicationContext.getBean(Person.class);
        System.out.println(bean);
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        String[] var7 = namesForType;
        int var6 = namesForType.length;

        for(int var5 = 0; var5 < var6; ++var5) {
            String name = var7[var5];
            System.out.println(name);
        }

    }
}