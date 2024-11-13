package com.example.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.home.entity.Libro;
import com.example.home.service.ILibroService;

@Controller
@RequestMapping("/libro")
public class LibroController {
	
	@Autowired
	private ILibroService libroService;
	
	@GetMapping("/menu")
	public String menuLibro(Model model) {
		model.addAttribute("libros", libroService.listaDeLibro());
		return "menu-libro";
	}
	
	 @GetMapping("/info/{titulo}")
	    public String infoLibro(@PathVariable String titulo, Model model) {	      
	        Libro libro = libroService.obtenerLibroPorTitulo(titulo);   
	        model.addAttribute("libro", libro);
	        return "libro-info";
	    }

}
