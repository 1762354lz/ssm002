package com.bsg.controller;

import com.bsg.domain.Book;
import com.bsg.exception.AppointException;
import com.bsg.returnOne.Execution;
import com.bsg.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


import java.util.List;
@Controller
@RequestMapping("/book")
public class BookController {
@Resource
    private BookService bookService;
    @RequestMapping("/list")
        public ModelAndView searchall()
        {
        List<Book> book =bookService.searchAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("book",book);
        modelAndView.setViewName("list");
        return modelAndView;
        }
    @RequestMapping("/{bookKey}/detail")
    public ModelAndView searchOne(@PathVariable("bookKey")int id)
    {
       Book book =bookService.searchOne(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("book",book);
        modelAndView.setViewName("list");
        return modelAndView;
    }
    @RequestMapping("/{bookKey}/appoint")
    @ResponseBody
    public Execution appoint(@PathVariable("bookKey")int bookId,int personId)
    {


        Execution execution =bookService.appoint(bookId,personId);
        return  execution;
    }
}
