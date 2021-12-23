package practica_adicional_Semana_4;

public class Helicoptero extends Voladores implements Aterrizable{
	public Helicoptero(String nombre) {
		this.nombre=nombre;
	}
	public void aterrizar() {
		System.out.println("El helicoptero  "+getNombre()+"   aterrizando...");
		
	}

}
