package died.guia06;

import java.util.List;

public class App {

	public static void main(String[] args){
		
		List<Curso> listaVaciaCurso = null;
		
		Alumno alumno1 = new Alumno("Santiago Conelli", 12345, listaVaciaCurso,listaVaciaCurso);
		Alumno alumno2 = new Alumno("Gino Perillo", 12346,listaVaciaCurso,listaVaciaCurso);
		Alumno alumno3 = new Alumno("Alfonso Fasana", 12347,listaVaciaCurso,listaVaciaCurso);
		Alumno alumno4 = new Alumno("Elias Figun", 12348,listaVaciaCurso,listaVaciaCurso);
		Alumno alumno5 = new Alumno("Cecilia Larrosa", 12348,listaVaciaCurso,listaVaciaCurso);
		
		
		List<Alumno> listaVaciaInscriptos = null;
		
		Curso curso1 = new Curso(00001,"Analisis Matematico 1", 2018, 50, listaVaciaInscriptos,25,0);
		Curso curso2 = new Curso(00001,"Fisica 1", 2018, 50, listaVaciaInscriptos,25,0);
		Curso curso3 = new Curso(00001,"Algoritmos y Estructura de Datos", 2018, 50, listaVaciaInscriptos,25,0);
		Curso curso4 = new Curso(00001,"Analisis Matematico 1", 2018, 50, listaVaciaInscriptos,25,0);
		Curso curso5 = new Curso(00001,"Analisis Matematico 2", 2019, 3, listaVaciaInscriptos,25,50);
		Curso curso6 = new Curso(00001,"Fisica 2", 2019, 50, listaVaciaInscriptos,25,50);
		Curso curso7 = new Curso(00001,"DIED", 2020, 50, listaVaciaInscriptos,25,100);
		Curso curso8 = new Curso(00001,"Matematica Superior", 2020, 50, listaVaciaInscriptos,25,100);
		Curso curso9 = new Curso(00001,"Comunicaciones", 2020, 50, listaVaciaInscriptos,25,100);
		
		curso1.inscribir(alumno1);
		curso1.inscribir(alumno2);
		curso1.inscribir(alumno3);
		curso1.inscribir(alumno4);
		curso1.inscribir(alumno5);
		
		curso2.inscribir(alumno1);
		curso2.inscribir(alumno2);
		curso2.inscribir(alumno3);
		curso2.inscribir(alumno4);
		curso2.inscribir(alumno5);
		
		curso3.inscribir(alumno1);
		curso3.inscribir(alumno2);
		curso3.inscribir(alumno3);
		curso3.inscribir(alumno4);
		curso3.inscribir(alumno5);
		// Deberia saltar exepcion en la siguiente linea
		curso4.inscribir(alumno5);
		//
		alumno1.aprobar(curso1);
		alumno2.aprobar(curso1);
		alumno3.aprobar(curso1);
		alumno4.aprobar(curso1);
		// Deberia saltar exepcion en la siguiente linea
		curso5.inscribir(alumno1);
		//
		alumno1.aprobar(curso2);
		alumno2.aprobar(curso2);
		alumno3.aprobar(curso2);
		alumno4.aprobar(curso2);
		
		alumno1.aprobar(curso3);
		alumno2.aprobar(curso3);
		alumno3.aprobar(curso3);
		alumno4.aprobar(curso3);
		
		
		curso4.inscribir(alumno1);
		curso4.inscribir(alumno2);
		curso4.inscribir(alumno3);
		curso4.inscribir(alumno4);

		curso5.inscribir(alumno1);
		curso5.inscribir(alumno2);
		curso5.inscribir(alumno3);
		curso5.inscribir(alumno4);
		// Deberia haber saltado exepcion en la linea anterior
		
		curso4.imprimirInscriptos();
		
	}
}
