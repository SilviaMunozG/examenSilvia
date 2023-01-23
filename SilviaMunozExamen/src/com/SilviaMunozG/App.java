package com.SilviaMunozG;

public class App {
	public static void main(String[] args) {
		{
			Alumno alumno1;
			alumno1 = new Alumno();
			alumno1.calificaciones = 7;
//			alumno1.Matricula = "correcta";
//			alumno1.Nombre = "Tomás Muñoz";
//
//			alumno1.aprueba();
//			alumno1.asisteAClase();
//			alumno1.aprueba();
//			alumno1.acabaJornada();
//			alumno1.entraAlInstituto();

			Profesor profesor1;
			profesor1 = new Profesor();
//			profesor1.dni = ("12345678A");
//			profesor1.Nombre = ("Alberto Aparici");
//			profesor1.AsiganturaQueImparte = ("Geografia");
//
//			profesor1.PasisteAClase();
//			profesor1.PoneExamen();
//			profesor1.imparteUnaLeccion();
//			profesor1.acabaJornada();
//			profesor1.entraAlInstituto();

			MiembroEquipoDirectivo miembro1;
			miembro1 = new MiembroEquipoDirectivo();
//			miembro1.dni = ("87654321B");
//			miembro1.Nombre = ("Pedro Pascal");
//			miembro1.seccionEnLaQueTrabaja = ("Jefe departamento Bachillerato");
//
//			miembro1.asisteAReunion();
//			miembro1.apruebaUnaMedida();
//			miembro1.entraAlInstituto();
//			miembro1.acabaJornada();

			PersonalAdministracion personal1;
			personal1 = new PersonalAdministracion();
//			personal1.dni = ("12345678B");
//			personal1.HorarioDeTrabajo = ("8 a 14:30");
//			personal1.Nombre = ("Francesc Rodriguez");
//
//			personal1.gestiona();
//			personal1.acabaJornada();
//			personal1.imprime();
//			personal1.entraAlInstituto();
//			
			Person[] personas = new Person[] {alumno1, profesor1, miembro1, personal1 };

			for (Person v : personas) {
				if (v instanceof Alumno)
					v.entraAlInstituto();
				else
					v.acabaJornada();

			}

			Worker[] trabajadores = new Worker[] { profesor1, miembro1, personal1 };

			for (Worker trabajador : trabajadores) {
				trabajador.clockIn();
				trabajador.getPayment();
			}
		}
	}
}