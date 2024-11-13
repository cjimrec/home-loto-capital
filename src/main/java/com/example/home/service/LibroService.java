package com.example.home.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.home.entity.Genero;
import com.example.home.entity.Libro;

@Service
public class LibroService implements ILibroService{
	private List<Libro>listadoLibro;
	
	{listadoLibro = generarListadoLibro();}
	
	@Override
	public List<Libro> generarListadoLibro() {
        List<Libro> listaLibro = new ArrayList<>();
        
        listaLibro.add(new Libro("It", "Stephen King", 30, Genero.TER));
        listaLibro.add(new Libro("La llamada de Cthulhu", "H. P. Lovecraft", 15, Genero.TER));
        listaLibro.add(new Libro("El cuervo", "Edgar Allan Poe", 20, Genero.TER));
        listaLibro.add(new Libro("Frankenstein", "Mary Shelley", 18, Genero.TER));
        listaLibro.add(new Libro("Drácula", "Bram Stoker", 25, Genero.TER));
        listaLibro.add(new Libro("Veinte mil leguas de viaje submarino", "Jules Verne", 50, Genero.AVE));
        listaLibro.add(new Libro("Colmillo blanco", "Jack London", 35, Genero.AVE));
        listaLibro.add(new Libro("Robinson Crusoe", "Daniel Defoe", 40, Genero.AVE));
        listaLibro.add(new Libro("La isla del tesoro", "Robert Louis Stevenson", 45, Genero.AVE));
        listaLibro.add(new Libro("El conde de Montecristo", "Alexandre Dumas", 28, Genero.AVE));
        listaLibro.add(new Libro("Asesinato en el Orient Express", "Agatha Christie", 100, Genero.NEG));
        listaLibro.add(new Libro("El sueño eterno", "Raymond Chandler", 60, Genero.NEG));
        listaLibro.add(new Libro("Estudio en escarlata", "Arthur Conan Doyle", 85, Genero.NEG));
        listaLibro.add(new Libro("El halcón maltés", "Dashiell Hammett", 55, Genero.NEG));
        listaLibro.add(new Libro("El talento de Mr. Ripley", "Patricia Highsmith", 42, Genero.NEG));
        listaLibro.add(new Libro("Los pilares de la tierra", "Ken Follett", 75, Genero.HIS));
        listaLibro.add(new Libro("El nombre de la rosa", "Umberto Eco", 58, Genero.HIS));
        listaLibro.add(new Libro("Wolf Hall", "Hilary Mantel", 33, Genero.HIS));
        listaLibro.add(new Libro("Yo, Claudio", "Robert Graves", 27, Genero.HIS));
        listaLibro.add(new Libro("Memorias de Cleopatra", "Margaret George", 31, Genero.HIS));
        listaLibro.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", 90, Genero.NEG));
        listaLibro.add(new Libro("Los hombres que no amaban a las mujeres", "Stieg Larsson", 70, Genero.NEG));
        listaLibro.add(new Libro("Nos vemos allá arriba", "Pierre Lemaitre", 52, Genero.NEG));
        listaLibro.add(new Libro("El último reino", "Bernard Cornwell", 60, Genero.HIS));
        listaLibro.add(new Libro("La catedral del mar", "Ildefonso Falcones", 45, Genero.HIS));
        return listaLibro;
    }
	
	@Override
	public List<Libro> listaDeLibro(){
		return listadoLibro;
	}
	
	@Override
	public Libro obtenerLibroPorTitulo(String titulo) {
        return listadoLibro.stream()
            .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
            .findFirst()
            .orElse(null);
	}
}
