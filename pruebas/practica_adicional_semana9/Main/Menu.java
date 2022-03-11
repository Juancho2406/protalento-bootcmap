package practica_adicional_semana9.Main;

public class Menu {
	
	public Menu() {
		
	}
	
	
	public static void MostrarMenu() {
		
		
		System.out.println("----------------------------");
		System.out.println("BIENVENIDO AL PROGRAMA PARA ADMINISTRAR ALUMNOS Y MATERIAS");
		System.out.println("1.Alumnos");
		System.out.println("2.Materias");
		
		
		System.out.println("Elige uno de los dos items, escribe el numero segun corresponda,"
				+ " \n Si es Alumno presiona (1) \n Si es una Materia presiona (2)");

	}
	
	public  void  MostrarCrud(int item) {
		String NombreItem="";
			if(item ==1) {
				NombreItem="Alumnos";	
			}
			
			if(item ==2) {
				NombreItem="Materias";
			}			
			
			System.out.println("Elegiste la opcion para administrar "+NombreItem+" ,"
					+ "\n A continuacion selecciona la accion,"
					+ "que deseas hacer \n Puedes:,"
					+ "\n 1.Agregar "+NombreItem+","
					+ "\n 2.Eliminar "+NombreItem+","
					+ "\n 3.Actualizar "+NombreItem+","
					+ "\n 4.Buscar por id "+NombreItem+","
					+ "\n 5. Listar tabla "+NombreItem+","
					+ "\n 6. Agregar materias a un alumno");
	}	
	
	public void MostrarInsertar(){
		
		
		System.out.println("\nDigite la matricula del alumno");
		
		
		System.out.println("\nDigite el nombre del alumno");
		
		
		System.out.println("\nDigite el apellido del alumno");
		
		
		///////////////////////////////////
		
	}
}
