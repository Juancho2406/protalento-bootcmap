package practica_adicional_semana9.Modelo;

public class Materia {
	/////ATRIBUTOS
	private Integer id;
	private String curso;
	private String turno;
	private String nombre;
	private int [] alumnos=new int[40];
///// GETTERS Y SETTERS ////////// 
	public int[] getAlumnos() {
		for(int i=0;i<40;i++) {
			alumnos[i]=-1;
		}
		return alumnos;
	}
	public void setAlumnos(int[] alumnos) {
		this.alumnos = alumnos;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
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
	public Materia(Integer id,String nombre, String curso, String turno, int[] alumnos) {
		super();
		this.nombre= nombre;
		this.curso = curso;
		this.turno = turno;
		this.alumnos=alumnos;
	}

	public Materia() {

	}

///////////////////////////////////////////////////////////////
}
