
package com.example.lab2_20204205.controller;

import com.example.lab2_20204205.entity.sede;
import com.example.lab2_20204205.repository.SedeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Optional;

@Controller
@RequestMapping("/sede")
public class SedeController {

    final SedeRepository sedeRepository;

    public SedeController(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }

    @GetMapping(value = {"", "/"})
    public String listaSedes(Model model) {
        model.addAttribute("listaSedes", sedeRepository.findAll());
        return "sedelist";
    }

    @GetMapping("/new")
    public String nuevoSedeFrm() {

        return "sedenewFrm";
    }


}



