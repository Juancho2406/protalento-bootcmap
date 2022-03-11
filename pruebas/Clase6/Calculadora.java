package Clase6;

public class Calculadora {
	static double sumar(double a, double b) {
		return a+b;
	}
	
	static double restar(double a, double b) {
		return a-b;
	}
	
	static double multiplicar(double a, double b) {
		return a*b;
	}
	
	static double dividir(double a, double b) {
		if(b!=0) {
			return a/b;
		}else {
			System.out.println("No se puede dividir entre 0");
			return 0;
		}
		
	}
}
