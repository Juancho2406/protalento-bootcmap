package Clase8;

public class Empleado extends Persona{
	
	//Atributo propio del empleado
	private Integer id=1;
	public Empleado(String nombre,
			String apellido,
			String colorPelo,
			Integer id) {
		//antes de nacer el empleado nace la persona
		
		super(nombre,apellido,colorPelo);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	//cambiar el comportamiento del padre (reutilizar lo del padre+ lo propio)
	
	public void detalle() {
		//al padre!! hace lo que sabes hacer
		super.detalle();
		//muestre la propio
		System.out.println("id: "+this.getId());
		
	}
}
