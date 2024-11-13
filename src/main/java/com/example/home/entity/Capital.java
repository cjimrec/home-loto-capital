package com.example.home.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Capital {
	@Getter @Setter private String nombre;
	@Getter @Setter private String url;
	
	public Capital(String nombre, String url) {
		this.nombre = nombre;
		this.url = url;
	}
}
