package com.example.lab2_20204205.controller;

import com.example.lab2_20204205.entity.auto;
import com.example.lab2_20204205.entity.sede;
import com.example.lab2_20204205.repository.SedeRepository;
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
    final SedeRepository sedeRepository;

    public AutoController(AutoRepository autoRepository,SedeRepository sedeRepository) {
        this.autoRepository = autoRepository;
        this.sedeRepository= sedeRepository;
    }

    @GetMapping(value = {"", "/"})
    public String listaAutos(Model model) {
        model.addAttribute("listaAutos", autoRepository.findAll());
        return "autolist";
    }

    @GetMapping("/new")
    public String nuevoAutoFrm(Model model) {
        model.addAttribute("listaSedes",sedeRepository.findAll());
        return "productnewFrm";
    }


}



