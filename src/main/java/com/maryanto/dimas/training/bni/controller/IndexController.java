package com.maryanto.dimas.training.bni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/app/index")
    public String index() {
        return "index";
    }
}
