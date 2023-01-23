package com.SilviaMunozG;

public class Subject {

	// Atributos (variables)
		String nombreSubject;
		int calificacionMedia;
		int horasDeFormacion;

		// métodos (funciones)

		public void seMatricula() {
			System.out.println("Un alumno se matricula en " + this.nombreSubject);
		}

		public void aprueba() {
			System.out.println("Un alumno aprueba " + this.nombreSubject);
		}
		
		public void suspende() {
			System.out.println("Un alumno suspende " + this.nombreSubject);
		}
}
