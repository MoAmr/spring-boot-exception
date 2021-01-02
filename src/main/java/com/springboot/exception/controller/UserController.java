package com.springboot.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "error";
    }
}
