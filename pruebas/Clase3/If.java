package Clase3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner (System.in);
		
		// Ingrese una contraseņa
		// Si contraseņa ="1234" y usuario = admin=>  'ok" 
		// Ingrese un dato  y si es > 18 imprimir "mayor de edad" 
		
		String usuario;
		String contraseņa;
		
		usuario="jose";
		contraseņa="12345";
		
		// primer forma
		if(usuario== "jose" && contraseņa=="1234") {
			System.out.println("ok");
		} else {
			System.out.println("fail");
		}
		
		
		//Forma anidada
		if(usuario=="admin") {
			if(contraseņa=="1234") {
				System.out.println("ok");
			} else {
				System.out.println("fail");
			}
		}else {
			System.out.println("fail");
		}
		
		System.out.println("Ingrese edad");
		
		int edad= teclado.nextInt();
		
		//boolean true
		if(edad > 18) {
			System.out.println("Mayor de edad");
			
		}else {
			System.out.println("Es menor de edad");
		}
		
		teclado.close();
	}

}
