package com.example.home.service;

import java.util.List;

import com.example.home.entity.Loto;


public interface ILotoService {
	List<Integer> generarCombinacion(int maxNumero, int cantidadNumeros);
}
