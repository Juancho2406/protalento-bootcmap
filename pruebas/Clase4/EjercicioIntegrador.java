package Clase4;

import java.util.Scanner;

public class EjercicioIntegrador {

	public static void main(String[] args) {
		
		
		//ingrese 10 datos
		//maximo
		//minimo
		//posMax
		//posMin
		//suma Total
		//cuantas veces se repite el maximo
		//cuantas veces se repite el minimo
		
		float[]datos=new float[10];
		float maximo;
		float minimo;
		byte pMaximo;
		byte pMinimo;
		float sumaTotal=0;
		int canRepMax=0;
		int canRepMin=0;
		
		
		
		Scanner teclado=new Scanner(System.in);
		
		
		for(int i=0;i<datos.length;i++){
			System.out.println("Ingrese un valor");
			datos[i]=teclado.nextInt();
		}
		maximo=datos[0];
		minimo=datos[0];
		pMaximo=0;
		pMinimo=0;
		
		
		for(int i=1;i<datos.length;i++) {
			if(datos[i]>maximo) {
				maximo=datos[i];
				pMaximo=(byte)i;//Casting/casteo
				if(datos[i]==maximo) 
				canRepMax++;
				else
					canRepMax=0;
			
			}
			if(datos[i]<minimo) {
				minimo=datos[i];
				pMinimo=(byte)i;//Casting/casteo
				if(datos[i]==maximo) 
					canRepMin++;
					else
					canRepMin=0;
			}
		}
		
		System.out.println("maximo:"+maximo);
		System.out.println("p maximo:"+pMaximo);
		System.out.println("minimo:"+minimo);
		System.out.println("pMinimo:"+pMinimo);
		System.out.println("cantidad repeticion maximo:"+canRepMax);
		System.out.println("cnatidad repeticion minimo"+canRepMin);
		System.out.println("Suma Total:"+sumaTotal);
		teclado.close();
	}

}
