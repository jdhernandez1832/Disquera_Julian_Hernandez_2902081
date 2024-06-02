package com.example.Disquera.controllers;

import com.example.Disquera.model.Disquera;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/disquera")
public class DisqueraController {

    private List<Disquera> disqueras = new ArrayList<>();

    public DisqueraController() {
        disqueras.add(new Disquera(1, "12345", "Disquera 1", "555-1234", "Calle 1", true));
        disqueras.add(new Disquera(2, "67890", "Disquera 2", "555-5678", "Calle 2", true));
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("disqueras", disqueras);
        return "disquera/listar";
    }

    @GetMapping("/ver/{id}")
    public String ver(@PathVariable int id, Model model) {
        Disquera disquera = disqueras.stream()
                .filter(d -> d.getIdDisquera() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("disquera", disquera);
        return "disquera/ver";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("disquera", new Disquera());
        return "disquera/form";
    }

    @PostMapping("/add")
    public String add(Disquera disquera, Model model) {
        disqueras.add(disquera);
        model.addAttribute("disquera", disquera);
        return "disquera/ver";
    }
}