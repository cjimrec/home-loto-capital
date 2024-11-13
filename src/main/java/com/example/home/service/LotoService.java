package com.example.home.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class LotoService implements ILotoService{

	@Override
	public List<Integer> generarCombinacion(int maxNumero, int cantidadNumeros) {
        List<Integer> numeros = new ArrayList<>();       
        for (int i = 1; i <= maxNumero; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros, new Random());
        return numeros.subList(0, cantidadNumeros);
    }

}
