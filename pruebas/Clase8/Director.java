package Clase8;

public final class Director extends Persona{
	private Integer empACargo;

	public Director(String nombre, String apellido, String colorPelo, Integer empACargo) {
		super(nombre, apellido, colorPelo);
		this.empACargo = empACargo;
	}

	public Integer getEmpACargo() {
		return empACargo;
	}

	public void setEmpACargo(Integer empACargo) {
		this.empACargo = empACargo;
	}
	
	public void detalle() {
		super.detalle();
		
		System.out.println("Empleado a cargo:"+this.empACargo);
	}
}
