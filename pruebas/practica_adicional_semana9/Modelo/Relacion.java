package practica_adicional_semana9.Modelo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JList;

import practica_adicional_semana9.Database.DatosDBMemoria;

public class Relacion {
	
	ArrayList <Alumno> alumnos=new ArrayList<Alumno>();
	ArrayList <Materia> materias=new ArrayList<Materia>();
	Scanner teclado=new Scanner(System.in);
	Alumno alumno = new Alumno();
	Materia materia=new Materia();
	

	public void relacionar() {
		
	}

	
	/////////////////////////////////////////////////////////////////////////////
//	Este metodo carga el id de las materias en el atributo materias de la clase alumno
	public ArrayList<Alumno>  cargarMateriasAAlumno(ArrayList<Alumno> alumnos) {

		
		int id;
		
		System.out.println(" Digite el id del alumno a ingresar materias");
		int[] idMaterias=new int[10];
		id=teclado.nextInt();
		int i=0;
		int continuar= 1;
		while(continuar==1) {
			System.out.println("Digite el id de la materia "+(i+1));
			id=teclado.nextInt();
			idMaterias[i]=id;
			i++;
			System.out.println("Desea incluir otra materia? \n");
			System.out.println("\n Presione 1 si desea incluir otra materia, presiona 0 si desea salir \n");
			continuar=teclado.nextInt();
		}
		
		alumno=alumnos.get(id-1);
		alumno.setMaterias(idMaterias);
		alumnos.add(id,alumno);		
	
		return alumnos;
	}
	
	/////////////////////////////////////////////////////////////////////////
	// Este metodo carga el id de los alumnos en el atributo alumnos de la clase materia
	public ArrayList<Materia> cargarAlumnosAMateria(ArrayList<Materia> materias, ArrayList<Alumno> alumnos) {
		
		
		int id = 0,posicion=0;
		int [] idAlumnos=new int[40];
		int[] idMaterias=new int[10];
		for(Alumno alumno1:alumnos) {
			idMaterias=alumno1.getMaterias();
			
			for(int i=0;i<10;i++) {
				id=idMaterias[i];
				if(id>0) {
					materia=materias.get(id);
					idAlumnos=materia.getAlumnos();	
				}
				if(idAlumnos[i]>0) {
					posicion=i;
				}
				//System.out.println(" \n Error al cargar materias  \n");
				}
				
				idAlumnos[posicion]=alumno1.getId()	;
				
				materia.setAlumnos(idAlumnos);
				materias.add(id,materia);	
			}		
	
		return materias;
	}

}

