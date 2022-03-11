package Clase4;

public class Matriz {

	public static void main(String[] args) {
		
		
		int cantFilas =2;
				
		int cantCols=2;
		
		String[][] matriz =new String [cantFilas][cantCols];
		
		
		System.out.println(matriz.length);//Cantidad de filas 
		System.out.println(matriz[0].length);// Cantidad de columnas
		
		for(int fila=0;fila<cantFilas;fila++) {
			for(int columna=0; columna<cantCols;columna++) {
				System.out.println( fila+"-"+columna+"="+matriz[fila][columna]);
			}
		}
	}

}
