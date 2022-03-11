package Clase4;

public class VectorObject {

	public static void main(String[] args) {
		
		//La base de todos los tipos de datos en java
		
		Object edad=10;
		Object nombres="Carlos";
		Object flag=true;
		Object letra='a';
		
		// No se puede utilizar otro  tipo de dato para este vector porque genera error
		//La unica forma de que se puedan meter distintos tiipos de datos es en un vector de tipo Object
		Object[] datos  =new Object[] {edad,nombres,flag,letra};
		
		//determinar que datos son de tipo boolean ??
		
		for(Object dato: datos) {
			if(dato instanceof Boolean) {
				
					boolean aux=(Boolean)dato;
					System.out.println("Encontre:"+ aux);
					//Imprime si encontro un tipo de dato booleano instanceado
					
					//Si se quiere buscar el valor de la variable eso se llama reflection
					
					
				//tipos de datos primitivos 
				//short 
				//byte < short<int < long<float<double
				
				//wrapper clase que envuevle el valor primitivo
				//Bytes, short, Integer, Long, Float, Double
				
				int a= 25;
				Integer a1=25;
				
				//Autoboxing
				a1=a;//25=25
				a=a1;//
				
				String valor ="15";
				
				a1=Integer.parseInt(valor);
				
				
			}
		}
		
		
	}

}
