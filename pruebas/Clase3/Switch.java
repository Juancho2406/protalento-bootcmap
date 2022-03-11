package Clase3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		//Ingresar una opcion
		// si es 1  =>alta
		// si es 2 => baja
		//si es 3=> modi
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese una opcion:"
				+ "1 - alta"
				+ "2 - baja"
				+ "3 - modif");
		int opcion=teclado.nextInt();
				/*
		if(opcion==1) {
			System.out.println("alta");
		}else if(opcion==2) {
			System.out.println("baja");
		}else if(opcion==3) {
			System.out.println("modif");
		}
		*/
		switch (opcion) {
		case 1:
			System.out.println("alta");
			System.out.println("Ingrese nombre");
			String nombre=teclado.next();
			System.out.println("Ha ingresado:"+nombre);
			break;
		case 2:
			System.out.println("baja");
			break;
		case 3:
			System.out.println("modifi");
			break;
		default:
			System.out.println("Ninguna en case");
			break;
		}
		
		
		teclado.close();
		
	}

}
