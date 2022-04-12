package practica_adicional_semana9.Modelo;

import java.util.List;

public class Alumno {
	/////ATRIBUTOS       /////////////
	private Integer id;
	private int matricula;
	private String nombre;
	private String apellido;
	private List<Integer> materias;
	
	
	//////// GETTERS Y SETTERS  /////////

	

	public List<Integer> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Integer> materias) {
		this.materias = materias;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//CONSTRUCTORES   /////////////////////////
	public Alumno(int id,int matricula, String nombre, String apellido) {
		this.id=id;
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Alumno() {
		
	}
}
///////////////////////////////////////////////////////