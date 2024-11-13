package com.example.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.home.service.IProverbioService;
import com.example.home.service.ProverbioService;

@Controller
public class HomeController {
	private IProverbioService proverbio;
	
	@Autowired
	public HomeController(IProverbioService proverbio) {
		this.proverbio = proverbio;
	}
	
	@GetMapping("/inicio")
	public String home1(Model model) {
		String proverbioAleatorio = proverbio.obtenerProverbio();
		model.addAttribute("proverbio",proverbioAleatorio);
		return "inicio";
	}
	
}
