package com.springboot.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mohammed Amr
 * @created 03/01/2021 - 22:10
 * @project spring-boot-exception
 */

@Controller
public class RoleController {

    @RequestMapping(path = "/roleadd")
    public String add() {
        int num = 10 / 0;
        return "add";
    }
}
