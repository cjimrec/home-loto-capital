package com.example.home.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.home.entity.Capital;

@Service
public class CapitalService implements ICapitalService{

	 private List<Capital> capitales;
	 
	 {capitales = rellenarCapitales();}
	 
	 
	 private List<Capital> rellenarCapitales(){
		 List<Capital>listCapitales = new ArrayList<>();
		 listCapitales.add(new Capital("paris", "/img/paris.jpg"));
		 listCapitales.add(new Capital("londres", "/img/londres.jpg"));
		 listCapitales.add(new Capital("sevilla", "/img/apitalEspania.jpg"));
		 listCapitales.add(new Capital("tokio", "/img/tokio.jpg"));
		 listCapitales.add(new Capital("washington", "/img/washington.jpg"));
		 listCapitales.add(new Capital("roma", "/img/roma.jpg"));
		 listCapitales.add(new Capital("rio de janeiro", "/img/RioDeJaneiro.jpg"));
		 listCapitales.add(new Capital("budapest", "/img/budapest.jpg"));
		 listCapitales.add(new Capital("moscú", "/img/moscu.jpg"));
		 listCapitales.add(new Capital("lima", "/img/lima.jpg"));
		 return listCapitales;
	 }
	 
	
	 	@Override
	    public Capital obtenerCapitalAleatoria() {
	       return capitales.get((int) (Math.random()*capitales.size()));
	    }
	 	
	 	@Override
	    public List<Capital> obtenerOpciones(Capital capitalCorrecta) {
	    	List<Capital> opciones = capitales.stream()
	                .filter(c -> !c.getNombre().equals(capitalCorrecta.getNombre()))
	                .sorted((c1, c2) -> Math.random() > 0.5 ? 1 : -1)
	                .limit(3) 
	                .collect(Collectors.toList());

	        
	        opciones.add(capitalCorrecta);
	        Collections.shuffle(opciones);

	        return opciones;
	    }
	}