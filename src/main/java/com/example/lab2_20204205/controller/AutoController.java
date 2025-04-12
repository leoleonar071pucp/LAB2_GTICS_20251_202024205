package com.example.lab2_20204205.controller;

import com.example.lab2_20204205.entity.auto;
import com.example.lab2_20204205.repository.AutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Optional;

@Controller
@RequestMapping("/auto")
public class AutoController {

    final AutoRepository autoRepository;

    public AutoController(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    @GetMapping(value = {"", "/"})
    public String listaAutos(Model model) {
        model.addAttribute("listaAutos", autoRepository.findAll());
        return "autolist";
    }


}



