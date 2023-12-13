package com.maryanto.dimas.training.bni.controller;

import com.maryanto.dimas.training.bni.model.Nasabah;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/nasabah")
@Slf4j
public class NasabahController {

    @GetMapping("/input")
    public String formInput(Model model) {
        model.addAttribute("nasabah", new Nasabah());
        return "input_nasabah";
    }

    @PostMapping("/save")
    public String handlerInput(@ModelAttribute Nasabah nasabah){
        log.info("input form: {}", nasabah);
        return "redirect:/app/nasabah/input";
    }
}
