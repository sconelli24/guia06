package died.guia06;

import java.util.List;


public class Alumno {

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;

	public int creditosObtenidos() {
		int total=0;
		aprobados.forEach(z->{
			total += z.getCreditos();
		});
		return total;
	}

	public void aprobar(Curso c) {
		this.cursando.remove(c);
		this.aprobados.add(c);
	}

	public void inscripcionAceptada(Curso c) {
		this.cursando.add(c);
	}

	public List<Curso> getCursando() {
		return cursando;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Alumno() {}
	public Alumno(String nombre, Integer nroLibreta, List<Curso> cursando, List<Curso> aprobados) {
		super();
		this.nombre=nombre;
		this.nroLibreta=nroLibreta;
		this.cursando=cursando;
		this.aprobados=aprobados;	
	}
	
	public boolean equals(Object a) {
		return (a instanceof Alumno && (this.nroLibreta == ((Alumno)a).nroLibreta));
	}
	
	public int compareTo(Alumno o) {
		return (int) (this.nombre - o.nombre);
	}	
}

