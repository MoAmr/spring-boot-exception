package com.springboot.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Mohammed Amr
 * @created 02/01/2021 - 17:21
 * @project spring-boot-exception
 */

@Controller
public class UserController {

    @RequestMapping(path = "/add")
    public String add() {
        int num = 10 / 0;
        return "add";
    }

    @RequestMapping(path = "/update")
    public String update() {
        String name = null;
        name = name.toLowerCase(); // this should cause null pointer exception
        return "update";
    }

//    @ExceptionHandler(value = {ArithmeticException.class})
//    public ModelAndView handlerArithmeticException(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("mathError");
//        return modelAndView;
//    }
//
//    @ExceptionHandler(value = {NullPointerException.class})
//    public ModelAndView handlerNullPointerException(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("nullPointerError");
//        return modelAndView;
//    }

}
