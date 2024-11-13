package com.example.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.home.entity.Capital;
import com.example.home.service.ICapitalService;

@Controller
@RequestMapping("/imagenes")
public class ImagenController {
	
	@Autowired
	private ICapitalService iCapitalService;

	 @GetMapping("/preguntas")
	    public String mostrarAcertijo(Model model) {
	        Capital capitalAleatoria = iCapitalService.obtenerCapitalAleatoria();
	        List<Capital> opciones = iCapitalService.obtenerOpciones(capitalAleatoria);

	      
	        model.addAttribute("capitalaleatoria", capitalAleatoria);
	        model.addAttribute("opciones", opciones);

	        return "menu";
	    }

	 @GetMapping("/respuesta")
	    public String verificarRespuesta(
	            @RequestParam String respuesta,
	            @RequestParam String correcta,
	            @RequestParam(required = false) String imagen,
	            Model model) {

	        boolean acertado = respuesta.equals(correcta);
	        String mensaje = acertado ? "Has acertado, Enhorabuena Javi" + correcta : "Sevilla capital del Mundo " + correcta;

	        model.addAttribute("mensaje", mensaje);
	        model.addAttribute("acertado", acertado);
	        model.addAttribute("imagen", imagen );

	        return "respuesta";
	    }
	}

