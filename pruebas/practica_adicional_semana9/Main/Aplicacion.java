package practica_adicional_semana9.Main;

import java.util.Scanner;

import practica_adicional_semana9.Database.DatosDBMemoria;

public class Aplicacion {

	public static void main(String[] args) {
		
		/*
		 * Relacion r=new Relacion();
		 * 
		 * r.cargarMateriasAlumno();
		 * 
		 * 
		 * 
		 */
		 

		Scanner teclado = new Scanner(System.in);

		int categoria=0;
		int opcionCrud=0;
		int continuar;
		Menu menu = new Menu();
		DatosDBMemoria DB = new DatosDBMemoria();
		
		do {
			do {
				Menu.MostrarMenu();
				categoria = teclado.nextInt();
			} while (categoria < 1 || categoria > 2);

			do {
				menu.MostrarCrud(categoria);
				opcionCrud = teclado.nextInt();
			} while (opcionCrud < 0 || opcionCrud > 6);

			if (opcionCrud == 1) {
				DB.Insertar(categoria);
			}
			if (opcionCrud == 2) {
				
				DB.Eliminar(categoria);
			}
			if (opcionCrud == 3) {
				DB.Actualizar(categoria);
			}
			if (opcionCrud == 4) {
				DB.BuscarPorId(categoria);
			}
			if (opcionCrud == 5) {
				DB.listar(categoria);
			}
			if(opcionCrud==6) {
				DB.insertarAlumnoAMateria();
			}

			System.out.println("Desea seguir utilizando el programa?,"
					+ " PRESIONE 1 para continuar, o PRESIONA 2 para salir");
			continuar = teclado.nextInt();			
		} while (continuar == 1);

		teclado.close();
		System.out.println("El programa ha finalizado");

	}/////////////////////////////////////

}
