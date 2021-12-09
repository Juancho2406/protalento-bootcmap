package practica_adicional_Semana_3;

//Alumno Juan David Saavedra Reyes
//Pro Talento Bootcamp
import java.util.Scanner;

public class PracticaAdicionalSemana3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		String nombre;
		String apellido;
		float notaAlumno;
		int cantidadEstudiantes;//
		int cantidadExamenes;//
		float suma=0;
		
		
		System.out.println("PROGRAMA CONTROL DE NOTAS DE LA ESCUELA PRIMARIA XYZ");
		
		System.out.println("Digite el numero de estudiantes");
		cantidadEstudiantes=scanner.nextInt();
		
		
		System.out.println("Digite la cantidad de examenes por alumno");
		cantidadExamenes=scanner.nextInt();
		
		
		//Cargando el arreglo con todos los estudiantes y promediando todas sus notas para guardar la nota final
		Object Estudiantes[][]=new Object[cantidadEstudiantes][3];
		for (int i = 0; i < cantidadEstudiantes; i++) {
			
				System.out.println("Digite el nombre del alumno numero: " + (i + 1));
				nombre = scanner.next();
				Estudiantes[i][0] = nombre;

				System.out.println("Digite el apellido del alumno: " + (i + 1));
				apellido = scanner.next();
				Estudiantes[i][1] = apellido;
			
			
			for(int j=0;j<cantidadExamenes;j++) {
				do {
				System.out.println("Digite la nota " + (j+1) + " : La nota debe ser entre 1 a 10 ");
				notaAlumno = scanner.nextInt();
				}while(notaAlumno>10);
				suma = suma + notaAlumno;
				notaAlumno = suma / cantidadExamenes;
				Estudiantes[i][2] = notaAlumno;
				
			}	
			suma=0;
			
		}	
		//aqui vamos a imprimir todos los estudiantes ingresados con su nota promedio
		
		System.out.println("\n ESTUDIANTES INGRESADOS");
		System.out.println("Nombre  Apellido  Nota");
		for(int i=0;i<Estudiantes.length;i++) {
			
			System.out.println(Estudiantes[i][0]+" "+Estudiantes[i][1]+" "+Estudiantes[i][2]);
			
		}
		
		//Estos contadores determinan el tamaño del arreglo de estudiantes aprobados y reprobados
		int contadorAprobados=0;
		int contadorReprobados=0;
	
		Float nota;
		//Este ciclo extrae la cantidad de aprobados y reprobados 
		for (int i = 0; i < Estudiantes.length; i++) {

				nota=(Float) Estudiantes[i][2];
				
				if(nota>=7) {
					contadorAprobados++;
				}else{				
					contadorReprobados++;
				}			
		}
		
		//Si, existen estudiantes aprobados se crea un array y se imprime, por el contrario imprime mensaje
		int j=0;
		if(contadorAprobados!=0) {
			Object EstudiantesAprobados[][]=new Object[contadorAprobados][3];
			//Cargando arreglo los estudiantes aprobados
			
			for(int i=0;i<Estudiantes.length;i++) {
				
					nota=(Float) Estudiantes[i][2];
					if(nota>=7) {
					EstudiantesAprobados[j][0]=Estudiantes[i][0];
					EstudiantesAprobados[j][1]=Estudiantes[i][1];
					EstudiantesAprobados[j][2]=nota;
					j++;
					}
			}
			j=0;
			//Imprimiendo los estudiantes aprobados
			System.out.println("\n ESTUDIANTES APROBADOS");
			System.out.println("Nombre  Apellido  Nota");
			for(int i=0;i<contadorAprobados;i++) {
				
				System.out.println(EstudiantesAprobados[i][0]+" "+EstudiantesAprobados[i][1]+" "+EstudiantesAprobados[i][2]);
				
			}

		}else {
			System.out.println("NO HAY ESTUDIANTES APROBADOS");
		}
		//Si existen reprobados crea el array, lo carga y luego lo imprime
		if(contadorReprobados!=0) {
			Object EstudiantesReprobados[][]=new Object[contadorReprobados][3];
			//Cargando arreglo de estudiantes Aprobados y Reprobados
			for(int i=0;i<cantidadEstudiantes;i++) {
	
						nota=(Float) Estudiantes[i][2] ;
						if(nota<7) {
							EstudiantesReprobados[j][0]=Estudiantes[i][0];
							EstudiantesReprobados[j][1]=Estudiantes[i][1];
							EstudiantesReprobados[j][2]=Estudiantes[i][2];
							j++;
						}
					
				}

			//Imprimiendo los estudiantes Reprobados
			System.out.println("\n ESTUDIANTES REPROBADOS");
			System.out.println("Nombre  Apellido Nota");
			for(int i=0;i<contadorReprobados;i++) {

				System.out.println(EstudiantesReprobados[i][0]+" "+EstudiantesReprobados[i][1]+" "+EstudiantesReprobados[i][2]);
			}
		}else {
			System.out.println("NO HAY ESTUDIANTES REPROBADOS");
		}
		
		
		float mayor,menor;
		mayor=menor=(Float)Estudiantes[0][2];
		int indiceDelMayor=0,indiceDelMenor=0;
		//Aqui el ciclo extrae el indice del mayor y el menor de cada arreglo y luego se imprime toda la informacion del estudiante
		
		for(int i=1;i<Estudiantes.length;i++) {
			nota=(Float)Estudiantes[i][2];
			if(nota>mayor) {
				mayor=nota;
				indiceDelMayor=i;
			}
			
			if(nota<menor) {
				menor=nota;
				indiceDelMenor=i;
			}
		}
		
		System.out.println("ESTUDIANTE CON LA MAYOR CALIFICACION");
		System.out.println(Estudiantes[indiceDelMayor][0]+" "+Estudiantes[indiceDelMayor][1]+" "+Estudiantes[indiceDelMayor][2]);
		
		System.out.println("ESTUDIANTE CON LA MENOR CALIFICACION");
		System.out.println(Estudiantes[indiceDelMenor][0]+" "+Estudiantes[indiceDelMenor][1]+" "+Estudiantes[indiceDelMenor][2]);
		
	
		}

	}
		



