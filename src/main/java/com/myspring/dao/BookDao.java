package com.myspring.dao;

/**
 * @author Steve Shen
 * @version 1.0.0
 * @date 2020/8/27 14:27
 */

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    private String lable = "1";

    public BookDao() {
    }

    public String getLable() {
        return this.lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String toString() {
        return "BookDao [lable=" + this.lable + "]";
    }
}