package practica_adicional_Semana_4;

public class Avion extends Voladores implements Aterrizable{
	
	
	

	public Avion(String nombre) {
		this.nombre=nombre;
	}
	
	
	
	public void aterrizar() {
		System.out.println("El  avion " +getNombre()+" aterriza");
		
	}

}
