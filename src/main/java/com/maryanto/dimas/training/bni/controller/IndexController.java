package com.maryanto.dimas.training.bni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/app/index.php")
    public String index(
            @RequestParam("namaLengkap") String namaLengkap,
            Model model) {
        model.addAttribute("namaLengkap", namaLengkap);
        return "index";
    }

    @GetMapping("/app/index.java")
    public String index2() {
        return "index";
    }
}
