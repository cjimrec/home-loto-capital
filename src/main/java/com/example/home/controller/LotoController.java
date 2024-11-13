package com.example.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.home.service.ILotoService;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/loto")
public class LotoController {
	

    private ILotoService lotoService;

    @Autowired
    public LotoController(ILotoService lotoService) {
        this.lotoService = lotoService;
    }

    
    @GetMapping("/menu")
    public String menuLoto() {
        return "loto-menu"; 
    }

    @GetMapping("/genera/49/6/spain")
    public String generaLotoEspana(Model model) {
        model.addAttribute("combinacion", lotoService.generarCombinacion(49, 6));
        model.addAttribute("pais", "España");
        return "loto"; 
    }


    @GetMapping("/genera/49/6/germany")
    public String generaLotoAlemania(Model model) {
        model.addAttribute("combinacion", lotoService.generarCombinacion(49, 6));
        model.addAttribute("pais", "Alemania");
        return "loto";
    }

    @GetMapping("/genera/90/6/france")
    public String generaLotoFrancia(Model model) {
        model.addAttribute("combinacion", lotoService.generarCombinacion(90, 6));
        model.addAttribute("pais", "Francia");
        return "loto";
    }

    
    @GetMapping("/genera/59/5/italy")
    public String generaLotoItalia(Model model) {
        model.addAttribute("combinacion", lotoService.generarCombinacion(59, 5));
        model.addAttribute("pais", "Italia");
        return "loto";
    }
}
