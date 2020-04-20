package died.guia06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CursoTest {
	// Tengo que probar si puedo inscribir un alumno
	@Test
	void testInscribirCreditos() {
		// Creditos necesarios
		List<Alumno> inscriptos = null;
		Curso curso1 = new Curso(54321,"DIED",2020,50,inscriptos,10,50);
		Curso curso2 = new Curso(54322,"Analisis Matematico 2",2019,50,inscriptos,50,50);
		
		List<Curso> cursandoAux = null;
		cursandoAux.add(curso1);
		
		List<Curso> aprobados = null;
		aprobados.add(curso2);
		
		List<Curso> cursando = null;
	
		
		Alumno alumno1 = new Alumno("Santiago Conelli", 12345, cursando,aprobados);
		curso1.inscribir(alumno1);
		
		assertTrue(alumno1.getCursando().equals(cursandoAux));
	}
	
	
	@Test
	void testInscribirCupo() {	
		// Cupo disponible
		List<Curso> aprobados = null;		
		List<Curso> cursando = null;
		
		Alumno alumno2 = new Alumno("Gino Perillo", 12346, cursando,aprobados);
		
		List<Alumno> inscriptos = null;
		inscriptos.add(alumno2);
		
		Curso curso1 = new Curso(54321,"DIED",2020,1,inscriptos,10,0);
		Curso curso2 = new Curso(54322,"Analisis Matematico 2",2019,1,inscriptos,10,0);
	
		Alumno alumno1 = new Alumno("Santiago Conelli", 12345, cursando,aprobados);
		curso1.inscribir(alumno1);

		assertTrue(alumno1.getCursando().size() == 0);
	}
	
	
	@Test
	void testInscribirMenorTresCursos() {	
		// Un alumno puede estar cursando solo 3 cursos
		
		List<Curso> aprobados = null;
		
		List<Curso> cursando = null;
		
		List<Alumno> inscriptos1 = null;
		List<Alumno> inscriptos2 = null;
		
		Curso curso1 = new Curso(54321,"DIED",2020,50,inscriptos1,10,0);
		Curso curso2 = new Curso(54322,"Analisis Matematico 2",2019,50,inscriptos1,50,0);
		Curso curso3 = new Curso(54323,"Fisica 2",2019,50,inscriptos1,50,0);
		Curso curso4 = new Curso(54324,"Matematica Discreta",2018,50,inscriptos2,50,0);
		
		cursando.add(curso1);
		cursando.add(curso2);
		cursando.add(curso3);
	
		Alumno alumno1 = new Alumno("Santiago Conelli", 12345, cursando,aprobados);
		curso4.inscribir(alumno1);

		assertTrue(alumno1.getCursando().size() == 3);
	}
}
