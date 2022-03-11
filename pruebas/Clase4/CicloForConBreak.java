package Clase4;

public class CicloForConBreak {

	public static void main(String[] args) {
		
		int datos[]=new int [] {10,015};
		
		//break/continue
		
		for(int dato: datos) {
			if(dato==0) {
				break;//Sale del ciclo
			}
			System.out.println("dato"+dato);
		}
		
	
		for(int dato:datos) {
			if(dato==0) {
				continue;//Continua el ciclo
			}
			System.out.println("fin");
		}
		
		
	}

}
