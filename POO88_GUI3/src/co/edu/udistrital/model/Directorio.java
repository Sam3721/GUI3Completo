package co.edu.udistrital.model;

import java.util.ArrayList;

public class Directorio {
	
	private ArrayList<Persona> directorio;
	
	public Directorio() {
		directorio= new ArrayList<Persona>();
		cargarDatosIniciales();
	}
	
	public void cargarDatosIniciales() {
		
		Persona x;
		
		x= new Persona("Ana", "Femenino", "Medellin", "3205170227", "ana@gmail.com", "m1");
		directorio.add(x);
		
		x= new Persona("Hugo", "Masculino", "Bogota", "3134895001", "hugo@gmail.com", "h1");
		directorio.add(x);
		
		x= new Persona("Maria", "Femenino", "Bogota", "3144012334", "maria@gmail.com", "m2");
		directorio.add(x);
		
		x= new Persona("Paco", "Masculino", "Cali", "3729127822", "paco@gmail.com", "h2");
		directorio.add(x);
		
		x= new Persona("Luz", "Femenino", "Cali", "3729127822", "luz@gmail.com", "m3");
		directorio.add(x);
		
		x= new Persona("Luis", "Masculino", "Medellin", "3729127822", "luis@gmail.com", "h3");
		directorio.add(x);
	}
	
	public int obtenerTamanioDirectorio() {
		return directorio.size();
	}

	public ArrayList<Persona> getDirectorio() {
		return directorio;
	}

	public void setDirectorio(ArrayList<Persona> directorio) {
		this.directorio = directorio;
	}
}
