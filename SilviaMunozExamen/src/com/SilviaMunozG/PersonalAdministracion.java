package com.SilviaMunozG;

public class PersonalAdministracion extends Person implements Worker {

	// Atributos (variables)

	String NombreAdministrativo;
	String HorarioDeTrabajo;

	// métodos (funciones)

	public void imprime() {
		System.out.println("El administrativo " + this.Nombre + " imprime un documento");
	}

	public void gestiona() {
		System.out.println("El administrativo " + this.Nombre + " gestiona unos tràmites");
	}

	@Override
	public void getPayment() {
		System.out.println("El personal administratiu cobra 2.000€");

	}
}
