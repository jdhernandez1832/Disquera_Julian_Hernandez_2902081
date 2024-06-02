package com.example.Disquera.controllers;

import com.example.Disquera.model.Genero;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/genero")
public class GeneroController {

    private List<Genero> generos = new ArrayList<>();

    public GeneroController() {
        generos.add(new Genero(1, "Rock", true));
        generos.add(new Genero(2, "Pop", true));
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("generos", generos);
        return "genero/listar";
    }

    @GetMapping("/ver/{id}")
    public String ver(@PathVariable int id, Model model) {
        Genero genero = generos.stream()
                .filter(g -> g.getIdGenero() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("genero", genero);
        return "genero/ver";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("genero", new Genero());
        return "genero/form";
    }

    @PostMapping("/add")
    public String add(Genero genero, Model model) {
        generos.add(genero);
        model.addAttribute("genero", genero);
        return "genero/ver";
    }
}