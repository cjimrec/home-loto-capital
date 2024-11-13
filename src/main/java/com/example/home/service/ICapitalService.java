package com.example.home.service;

import java.util.List;

import com.example.home.entity.Capital;

public interface ICapitalService {
	Capital obtenerCapitalAleatoria();
	List<Capital> obtenerOpciones(Capital capitalCorrecta);
}
