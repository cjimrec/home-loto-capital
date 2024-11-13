package com.example.home.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ProverbioService implements IProverbioService{
	private final String[] proverbios = { "El mejor momento para plantar un árbol fue hace 20 años. El segundo mejor momento es ahora.",
            "No temas ir despacio, teme solo detenerte.",
            "El agua, si no fluye, se estanca.",
            "Un viaje de mil millas comienza con un solo paso.",
            "No puedes guiar el viento, pero puedes ajustar las velas.",
            "Los grandes logros requieren tiempo y paciencia.",
            "No hay un atajo hacia la felicidad.",
            "La paciencia es un árbol de raíz amarga pero de frutos muy dulces.",
            "El hombre que mueve una montaña comienza cargando pequeñas piedras.",
            "El que pregunta es un tonto por un minuto, el que no pregunta es un tonto para siempre."};

	@Override
	public String obtenerProverbio() {
		Random rand = new Random();
		int indice = rand.nextInt(proverbios.length);
		return proverbios[indice];
	}
	
}
