package com.myspring.service;

/**
 * @author Steve Shen
 * @version 1.0.0
 * @date 2020/8/27 14:27
 */

import com.myspring.dao.BookDao;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Inject
    private BookDao bookDao;

    public BookService() {
    }

    public void print() {
        System.out.println(this.bookDao);
    }

    public String toString() {
        return "BookService [bookDao=" + this.bookDao + "]";
    }
}
