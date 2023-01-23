package com.SilviaMunozG;

public class Alumno extends Person {

	// Atributos (variables)
	String Matricula;
	int calificaciones;

	// métodos (funciones)

	public void asisteAClase() {
		System.out.println("El alumno asiste a clase");
	}

	public void aprueba() {
		System.out.println("El alumno " + this.Nombre + " aprueba");
	}
	
	public void suspende() {
		System.out.println("El alumno " + this.Nombre + " suspende");
	}

}
