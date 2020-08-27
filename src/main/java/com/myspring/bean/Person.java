package com.myspring.bean;

/**
 * @author Steve Shen
 * @version 1.0.0
 * @date 2020/8/27 14:28
 */

import org.springframework.beans.factory.annotation.Value;

public class Person {
    @Value("����")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String toString() {
        return "Person [name=" + this.name + ", age=" + this.age + ", nickName=" + this.nickName + "]";
    }
}
