package Clase4;

public class Cuentas {

	public static void main(String[] args) {
		
		// viene de afuera
		String[] archivo=new String[]{
				"1000;juan lopez;1500;ca",
				"2000:jose Guzman;11500;ca",
				"3000;juan Martinez;=1000;cc",
				"4000; Matias perez;1000000;cc",
				"5000;elsa moyano;21000;cc"};
	
		Object[][] resultado= new Object[5][2];
		
		//separar por ;
		
		
		// Obtener las cuentas con slado negativo con apyn
		// Obtener las cuentas cin ssaldo> 10000 apyn 
		
		for(for int i =0;i<archivo.length;i++) {
			String registro=archivo[i];
			String[] cuenta=registro.split(";");
			Integer numCuenta= Integer.parseInt(cuenta[0]);
			String apyn= cuenta[1];
			Double saldo= Double.parseDouble(cuenta[2]);
			String tipo= cuenta[3];
			
			System.out.println("cuenta"+cuenta);
			System.out.println("Numero"+numCuenta);
			System.out.println("Apellido y nombre"+apyn);
			System.out.println("Saldo"+saldo);
			System.out.println("Tipo de cuenta"+tipo);
			
			System.out.println("----------------");
			
			if(saldo<0) {
				resultado[i][0]=saldo;
				resultado[i][1]=apyn;
						
			}
		}
	}
}
