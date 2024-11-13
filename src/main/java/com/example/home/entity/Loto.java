package com.example.home.entity;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

public class Loto {
	@Getter @Setter private List<Integer>numeros;
	@Getter @Setter private String pais;
	
	public Loto(List<Integer> numeros, String pais) {
		this.numeros = numeros;
		this.pais = pais;
	}
}
