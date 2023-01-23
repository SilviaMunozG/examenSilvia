package com.SilviaMunozG;

public class Profesor extends Person implements Worker {

	// Atributos (variables)

	String AsiganturaQueImparte;

	// métodos (funciones)

	public void PasisteAClase() {
		System.out.println("El profesor " + this.Nombre + " asiste a clase");
	}

	public void imparteUnaLeccion() {
		System.out.println("El profesor " + this.Nombre + " imparte una lección");
	}

	public void PoneExamen() {
		System.out.println("El profesor " + this.Nombre + " pone un examen");
	}
		@Override
		public void getPayment() {
			System.out.println("El profesor cobra 2.500€");
			
	}
}
