package Clase3;

import java.util.Scanner;

public class EjercicioIF2 {
	public static void main(String[] args) {
		// Determinar dado 3 numero, cual es el mayor 
		
		Scanner teclado=new Scanner(System.in);
		//Declarando variables
		
		int a,b,c;
		/*
		a=teclado.nextInt();
		b=teclado.nextInt();
		c=teclado.nextInt();
		
		*/
		
		a=11;
		b=15;
		c=10;
				
		//a > b y a>b caso 1
		//b > a y b>c caso 2
		//c > a y c>b caso 3
		
		if(a> b && a>c) {
			System.out.println(a+" Es mayor");
		}
		if(b>a && b>c) {
			System.out.println(b+" Es mayor");
		}
		if(c>a && c>b) {
			System.out.println(c+" Es mayor");
		}
		if(a==b && a==c) {
			System.out.println("Son iguales");
		}
		teclado.close();
	}
}
