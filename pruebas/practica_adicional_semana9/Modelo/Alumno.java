package practica_adicional_semana9.Modelo;
public class Alumno {
	/////ATRIBUTOS       /////////////
	private Integer id;
	private int matricula;
	private String nombre;
	private String apellido;
	private int[] materias=new int[10];
	
	
	//////// GETTERS Y SETTERS  /////////
	public Integer getId() {
		return id;
	}
	public int[] getMaterias() {
		return materias;
	}
	public void setMaterias(int[] materias) {
		this.materias = materias;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Alumno(int id,int matricula, String nombre, String apellido,int[] materias) {
		
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.materias= materias;
	}
	public Alumno() {
		
	}
}
