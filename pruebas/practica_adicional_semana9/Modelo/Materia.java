package practica_adicional_semana9.Modelo;

import java.util.List;

public class Materia {
	/////ATRIBUTOS
	private Integer id;
	private String curso;
	private String turno;
	private String nombre;
	private List<Integer> Alumnos;
///// GETTERS Y SETTERS ////////// ////////
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	
	public List<Integer> getAlumnos() {
		return Alumnos;
	}
	public void setAlumnos(List<Integer> alumnos) {
		Alumnos = alumnos;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String string) {
		this.curso = string;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	////////CONSTRUCTORES           ////////////////////////////
	public Materia(Integer id,String nombre, String curso, String turno) {
		this.id=id;
		this.nombre= nombre;
		this.curso = curso;
		this.turno = turno;
	}

	public Materia() {

	}

///////////////////////////////////////////////////////////////
}
