package com.example.home.service;

import java.util.List;

import com.example.home.entity.Libro;

public interface ILibroService {
	List<Libro> generarListadoLibro();
	List<Libro> listaDeLibro();
	Libro obtenerLibroPorTitulo(String titulo); 
	
}
