package Clase6;

public class CalculadoraMain {

	public static void main(String[] args) {
		
		//variable primitiva
		
		int a=10;
		int b=30;
		
		
		//Creando un objeto, de la clase calculadora
		Calculadora miCalculadora= new Calculadora();
		
		// Ahora ejecuto cualquiera de sus funciones
		double suma =miCalculadora.sumar(a, b);
		
		System.out.println("La suma de "+a+" y "+ b+" es "+ suma);
	}

}
