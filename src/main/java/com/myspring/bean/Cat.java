package com.myspring.bean;

/**
 * @author Steve Shen
 * @version 1.0.0
 * @date 2020/8/27 15:53
 */

public class Cat {
    private String name;

    private Integer age;

    private String owner;

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

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Cat() {

    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Cat [name=" + this.name + ", age=" + this.age + ", owner=" + this.owner + "]";
    }
}
