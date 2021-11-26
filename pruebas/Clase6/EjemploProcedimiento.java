package Clase6;

public class EjemploProcedimiento {

	public static void main(String[] args) {
		
		
		saludar("Como estas");
		
		responder("bien, gracias!!");
		
		int a=10;
		int b=20;
	//	int c=a+b;
		
		int c=sumar(a,b);
	}
	
	static int sumar(int a,int b) {
		//int res=a+b;
		//return res;	
		return a+b;
	
	}
	static void responder(String saludo) {
		System.out.println(saludo);
		
	}
		//UN PROCEDIMIENTO
	static void saludar(String saludo) {
			System.out.println("Hola"+saludo);
			
	}
	
	
		
		

	}


