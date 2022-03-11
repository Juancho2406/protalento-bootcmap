package Clase8;

public class abstract Persona {
	//atributos
	
	private String nombre;
	protected String apellido;
	public String colorPelo;
	public final int cantidadOrejas=2;
	
	public Persona(String nombre, String apellido, String colorPelo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.colorPelo = colorPelo;
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
	public String getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
	public void detalle() {
		System.out.println(this.toString());
		detallar();
	}
	//metodo es del Object, pero Persona le cammmmbia el comportamiento
	public String toString() {
		return "persona[Nombre:"+nombre+" Apellido:"+apellido+" ColorPelo: "+colorPelo+"]";
	}
	
	public abstract void detallar() {
		System.out.println("Id:"+this.getId());
	}//No esta implementado> el/los hijos deben implementar
	public final int getCantidadOjos() {
		return 2;
	}
}
