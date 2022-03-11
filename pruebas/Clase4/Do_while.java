package Clase4;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		
		//leer un vlaor
		// > 0 && <=10
		// acumular la suma de dichos valores
		
		Scanner teclado=new Scanner(System.in);
		
		int valor;
		int suma=0;
		do {
			System.out.println("Ingrese valor");
			valor= teclado.nextInt();
			suma+=valor;
			valor++;
			
		}while(valor>0 && valor <=10);
		

	}

}
