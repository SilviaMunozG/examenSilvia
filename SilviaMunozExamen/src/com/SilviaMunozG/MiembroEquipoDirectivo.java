package com.SilviaMunozG;

public class MiembroEquipoDirectivo extends Person implements Worker {

	// Atributos (variables)

	String seccionEnLaQueTrabaja;

	// métodos (funciones)

	public void asisteAReunion() {
		System.out.println("El miembro del equipo directivo" + this.Nombre + " asiste a una reunión");
	}

	public void apruebaUnaMedida () {
		System.out.println("El miembro del equipo directivo" + this.Nombre + " aprueba una medida");
	}
	
	@Override
	public void getPayment() {
		System.out.println("El membre del equip directiu cobra 3.500€");

	}
}
