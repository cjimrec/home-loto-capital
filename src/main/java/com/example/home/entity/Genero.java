package com.example.home.entity;

public enum Genero {
	TER("terror"), AVE("aventura"), NEG("novela negra"), HIS("novela historica");
	
	private String genero;

	private Genero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}
	
	
	
	
}
