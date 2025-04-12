
package com.example.lab2_20204205.controller;

import com.example.lab2_20204205.entity.seguro;
import com.example.lab2_20204205.repository.SeguroRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Optional;

@Controller
@RequestMapping("/seguro")
public class SeguroController {

    final SeguroRepository seguroRepository;

    public SeguroController(SeguroRepository seguroRepository) {
        this.seguroRepository = seguroRepository;
    }

    @GetMapping(value = {"", "/"})
    public String listaSeguros(Model model) {
        model.addAttribute("listaSeguros", seguroRepository.findAll());
        return "segurolist";
    }


}



