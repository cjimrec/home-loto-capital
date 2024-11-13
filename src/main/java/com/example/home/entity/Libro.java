package com.example.home.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Libro {
	@Getter @Setter private String titulo;
	@Getter @Setter private String autor;
	@Getter @Setter private int cantidadEjemplares;
	@Getter @Setter private Genero genero;

	public Libro(String titulo, String autor, int cantidadEjemplares, Genero genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.cantidadEjemplares = cantidadEjemplares;
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return String.format("Libro: %s, autor: %s, cantidad: %d, genero: %s\n", titulo, autor, cantidadEjemplares, genero.getGenero());
	}
	
}
