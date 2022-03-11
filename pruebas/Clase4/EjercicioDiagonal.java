package Clase4;

import java.util.Scanner;

public class EjercicioDiagonal {

	public static void main(String[] args) {
		
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("ingrese la cantidad de filas");
		int cantFilas= teclado.nextInt();
		
		System.out.println("Ingrese la cantidad de columnas");
		int cantColumnas=teclado.nextInt();
		
		if(cantFilas ==cantColumnas) {
			Integer[][] matriz= new Integer[cantFilas][cantColumnas];
			
			
			System.out.println("Ingrese valores");
			
			for(int f=0;f<cantFilas;f++) {
				for(int c=0;c<cantColumnas;c++) {
					System.out.println("Ingrese ("+f+","+c+")");
					int aux= teclado.nextInt();
					matriz[f][c]=aux;
				}
			}
			
			boolean todosUno=true;
			for(int f=0;f<cantFilas;f++) {
				for(int c=0;c<cantColumnas;c++) {
					if(f==c) {
						if(matriz[f][c]!=1) {
							todosUno=false;
							break;
						}
					}
				}
			}
			//todosUno==true
			if(todosUno) {
				System.out.println("matriz con diagonal en 1");
				
			}else {
				System.out.println("matriz sin diagonal en 1");
			}
		
		}

	}

}
