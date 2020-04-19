package died.guia06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import died.guia06.util.Registro;

/**
 * Clase que representa un curso. Un curso se identifica por su ID y por su nombre y ciclo lectivo.
 * Un curso guarda una lista de los inscriptos actuales que tienen.
 * Un curso, al aprobarlo, otorga una cantidad de creditos definidas en el curso.
 * Un curso requiere que para inscribirnos tengamos al menos la cantidad de creditos requeridas, y que haya cupo disponible
 * @author marti
 *
 */
public class Curso {

	private Integer id;
	private String nombre;
	private Integer cicloLectivo;
	private Integer cupo; 
	private List<Alumno> inscriptos;
	private Integer creditos;
	private Integer creditosRequeridos;
	
	private Registro log;
	
	public Curso() {
		super();
		this.inscriptos = new ArrayList<Alumno>();
		this.log = new Registro();
	}

	/**
	 * Este método, verifica si el alumno se puede inscribir y si es así lo agrega al curso,
	 * agrega el curso a la lista de cursos en los que está inscripto el alumno y retorna verdadero.
	 * Caso contrario retorna falso y no agrega el alumno a la lista de inscriptos ni el curso a la lista
	 * de cursos en los que el alumno está inscripto.
	 * 
	 * Para poder inscribirse un alumno debe
	 * 		a) tener como minimo los creditos necesarios
	 *      b) tener cupo disponibles
	 *      c) puede estar inscripto en simultáneo a no más de 3 cursos del mismo ciclo lectivo.
	 * @param a
	 * @return
	 */
	public void inscribir1(Alumno a) throws MinimoCreditosNecesarios,CupoDisponible,CantCursosInscripto,IOException {
		if(a.creditosObtenidos()<this.creditosRequeridos)
			throw new MinimoCreditosNecesarios();
		else if(this.cupo <= this.inscriptos.size())
			throw new CupoDisponible();
		else if(a.getCursando().size()>=3)
			throw new CantCursosInscripto();
		
		log.registrar(this, "inscribir ",a.toString());
		
		a.inscripcionAceptada(this);
	}
	
	public void inscribir(Alumno a) {
		try {
			inscribir1(a);
		}catch(MinimoCreditosNecesarios e1){
			System.out.println("Minimo de creditos necesarios no alcanzado");
			e1.toString();
		}catch(CupoDisponible e2){
			System.out.println("El curso no tiene cupo disponible");
		}catch(CantCursosInscripto e3){
			System.out.println("La cantidad de cursos inscriptos no debe superar a 3");
		}catch(IOException e4) {
			e4.printStackTrace();
		}
	}
	/**
	 * imprime los inscriptos en orden alfabetico
	 */
	public void imprimirInscriptos() {
		try {
			log.registrar(this, "imprimir listado",this.inscriptos.size()+ " registros ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Integer getCreditos() {
		return this.creditos;
	}
	
	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

}
