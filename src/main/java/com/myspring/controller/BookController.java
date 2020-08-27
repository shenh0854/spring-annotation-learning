package com.myspring.controller;

/**
 * @author Steve Shen
 * @version 1.0.0
 * @date 2020/8/27 14:28
 */

import com.myspring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public BookController() {
    }
}
