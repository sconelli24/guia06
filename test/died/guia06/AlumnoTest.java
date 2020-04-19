package died.guia06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class AlumnoTest {
	
	@Test
	void testCreditosObtenidos() {
		
		Curso clase1 = new Curso();
		Curso clase2 = new Curso();
		clase1.setCreditos(20);
		clase2.setCreditos(30);
		List<Curso> cursando = null;
		List<Curso> aprobadas = null;
		
		aprobadas.add(clase1);
		aprobadas.add(clase2);
		
		Alumno alumno1 = new Alumno("Santiago Conelli", 12345,cursando,aprobadas);
		assertEquals(alumno1.creditosObtenidos(),50);
	}

	@Test
	void testAprobar() {
		Curso clase1 = new Curso();
		Curso clase2 = new Curso();
		List<Curso> cursando = null;
		List<Curso> aprobadas = null;
		
		cursando.add(clase1);
		cursando.add(clase2);
		
		Alumno alumno1 = new Alumno("Santiago Conelli", 12345,cursando,aprobadas);
		
		aprobadas.add(clase1);
		cursando.remove(clase1);
		
		alumno1.aprobar(clase1);
		
		assertEquals(alumno1.getAprobados(),aprobadas);
		assertEquals(alumno1.getCursando(),cursando);
		
	}

	@Test
	void testInscripcionAceptada() {		
		Curso clase1 = new Curso();
		List<Curso> cursando = null;
		List<Curso> aprobadas = null;
		List<Curso> cursandoAux = null;
		
		Alumno alumno1 = new Alumno("Santiago Conelli", 12345,cursandoAux,aprobadas);
		
		alumno1.inscripcionAceptada(clase1);
		cursando.add(clase1);		
		
		assertEquals(alumno1.getCursando(),cursando);
		
	}

}
