package Clase4;

import java.io.Serializable;

public class Ejercicio {

	public static void main(String[] args) {
		//==
		
		//int edad =10;//primitivo
	//	int edad1=10;
		
		String edad="10";
		String edad1="10";
		if(edad==edad1){
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
		}
		
		Object a="10";
		Serializable s="10";
		
		if(s instanceof String) {
			
		}
		
		if (s.getClass().isAssignableFrom(null)) {
			
		}
	}

}
