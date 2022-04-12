package practica_adicional_semana9.Database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import practica_adicional_semana9.Modelo.Alumno;
import practica_adicional_semana9.Modelo.Materia;

public class DatosDBMemoria {

	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private ArrayList<Materia> materias = new ArrayList<Materia>();
	private Scanner sc = new Scanner(System.in);
	int i = 0;

	Alumno alumno;
	Materia materia;
	String continuar;
	private List<Integer> alumnosMateria;

	public DatosDBMemoria() {
		CargarArrayAlumno();
		CargarArrayMateria();
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}
	
	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}
	
	//////////////////////////
	public void insertarAlumnoAMateria() {
		
		System.out.println("\n Digite el id de la materia ");
		Integer idMateria=sc.nextInt();
		System.out.println("\n Digite el id del alumno ");
		Integer idAlumno=sc.nextInt();
		
		Materia materia=materias.get(idMateria-1);
		
		alumnosMateria = new ArrayList<Integer>();
		alumnosMateria=(List<Integer>) materia.getAlumnos();
		if(alumnosMateria==null) {
			alumnosMateria=new ArrayList<Integer>();
			alumnosMateria.add(0, idAlumno);
		}else {
			alumnosMateria.add(idAlumno);
		}
		
		materia.setAlumnos(alumnosMateria);
		materias.add(idMateria-1, materia);
		insertarMateriaAAlumno(idAlumno, idMateria);
	}
	//////////////////////////////////////////
	
//////////////////////////
	public void insertarMateriaAAlumno(Integer idAlumno, Integer idMateria) {

		
		Alumno alumno=alumnos.get(idAlumno);
		
		List<Integer> materiasAlumno=alumno.getMaterias();
		if(materiasAlumno==null) {
			materiasAlumno=new ArrayList<Integer>();
			materiasAlumno.add(idMateria);
		}else {
		materiasAlumno.add(idMateria);
		}
		alumno.setMaterias(materiasAlumno);
		alumnos.add(idMateria, alumno);
	}
//////////////////////////////////////////
	public void CargarArrayAlumno() {

		Alumno A1 = new Alumno(1, 20201031, "Pedro", "Torres");
		Alumno A2 = new Alumno(2, 20201032, "Andres", "Paez");
		Alumno A3 = new Alumno(3, 20201033, "Maria", "Reyes");
		Alumno A4 = new Alumno(4, 20201034, "Samuel", "Roca");
		Alumno A5 = new Alumno(5, 20201035, "Daniel", "Morales");
		Alumno A6 = new Alumno(6, 20201036, "Roberto", "Pastrana");

		alumnos.add(A1);
		alumnos.add(A2);
		alumnos.add(A3);
		alumnos.add(A4);
		alumnos.add(A5);
		alumnos.add(A6);

	}

///////////////////////////////////////////////////////////////////////
	public void CargarArrayMateria() {

		Materia M1 = new Materia(1, "Calculo", "201", "Diurno");
		Materia M2 = new Materia(2, "Fisica 1", "301", "Diurno");
		Materia M3 = new Materia(3, "Catedra", "401", "Nocturno");
		Materia M4 = new Materia(4, "Electronica", "501", "Nocturno");
		Materia M5 = new Materia(5, "Estructuras", "701", "Diurno");
		Materia M6 = new Materia(6, "Innovacion", "302", "Nocturno");

		materias.add(M1);
		materias.add(M2);
		materias.add(M3);
		materias.add(M4);
		materias.add(M5);
		materias.add(M6);

	}
///////////////////////
//////////////////////////////////////////////////////////////////////
	public void Insertar(int item) {
		Materia materia = new Materia();
		Alumno alumno = new Alumno();
		listar(item);
		if (item == 1) {

			System.out.println("\nDigite la matricula del alumno");
			alumno.setMatricula(sc.nextInt());

			System.out.println("\nDigite el nombre del alumno");
			alumno.setNombre(sc.next());

			System.out.println("\nDigite el apellido del alumno");
			alumno.setApellido(sc.next());

			alumno.setId(alumnos.size() + 1);

			System.out.println("\n \n Ha ingresado el alumno: " + "\n Id: " + alumno.getId() + "," + "\n Matricula"
					+ alumno.getMatricula() + "," + "\n Nombre: " + alumno.getNombre() + "," + "\n Apellido: "
					+ alumno.getApellido() + "," + "\n Materias: ");
			alumnos.add(alumno);
		}
		if (item == 2) {

			listar(item);
			materia.setId(materias.size() + 1);
			System.out.println("Digite el nombre de la materia\n");
			materia.setNombre(sc.next());
			System.out.println("Digite el curso de la materia\n");
			materia.setCurso(sc.next());
			System.out.println("Digite el turno de la materia\n");
			materia.setTurno(sc.next());

			System.out.println(" Ha ingresado la siguiente materia" + "\n Id: " + materia.getId() + "\n Nombre: "
					+ materia.getNombre() + "\n Curso: " + materia.getCurso() + "\n Turno:" + materia.getTurno());
			materias.add(materia);

		}
		listar(item);

		System.out.println("Insertad@ con exito");
	}

///////////////////////////////////////////////////////////////////////////
	public void Eliminar(int item) {
		int id;
		System.out.println("digite el id a eliminar");
		id = sc.nextInt();

		if (item == 1) {
			alumno = alumnos.get(id - 1);
			alumno.setNombre("");
			alumno.setApellido("");
			alumno.setMatricula(0);
			alumnos.add(id - 1, alumno);
		}
		if (item == 2) {

			materia = materias.get(id - 1);
			materia.setNombre("");
			materia.setTurno("");
			materia.setCurso("");
			materias.add(id - 1, materia);

		}
		listar(item);
		System.out.println("Eliminad@ con exito");

	}
//////////////////
///////////////////////////////////////////////////////////////////////////
	public void Actualizar(int item) {

		listar(item);
		System.out.println("Digite el id que desea actualizar");
		int id;
		id = sc.nextInt();

		if (item == 1) {
			alumno = alumnos.get(id - 1);
			System.out.println("Digite la Matricula del alumno \n");
			alumno.setMatricula(sc.nextInt());
			System.out.println("Digite el Nombre del alumno \n");
			alumno.setNombre(sc.next());
			System.out.println("Digite el Apellido del alumno \n");
			alumno.setApellido(sc.next());

			alumnos.add(id - 1, alumno);

		}

		if (item == 2) {

			
			  //materia=materias.get(id-1);
			  System.out.println("Digite el nombre de la materia\n");
			  materia.setNombre(sc.next());
			  System.out.println("Digite el curso de la materia\n");
			  materia.setCurso(sc.next());
			  System.out.println("Digite el turno de la materia\n");
			  materia.setTurno(sc.next());
			  
			  
			  System.out.println("Digite el nombre de la materia\n"); String
			  nombreMateria=sc.next();
			  System.out.println("Digite el curso de la materia\n"); String
			  cursoMateria=sc.next();
			  System.out.println("Digite el turno de la materia\n"); String
			  turnoMateria=sc.next(); Materia materia=new
			  Materia(id,nombreMateria,cursoMateria,turnoMateria);
			 
			materias.add(id - 1, materia);

		}
		listar(item);
		System.out.println("Actualizad@ con exito");
	}

////////////////////////////////////////////////////////////////////////////////
	public void BuscarPorId(int item) {

		System.out.println("Digite el id que desea buscar");
		int id;
		id = sc.nextInt();
		if(id==0) {
			System.out.println(" El id no corresponde a ningun dato ");
		}else {
			if (item == 1) {
				alumno = alumnos.get(id);
				listarAlumnoPorId(alumno);
			}

			if (item == 2) {
				materia = materias.get(id);
				listarMateriaPorId(materia);
			}
		}
		
		System.out.println("Buscad@ con exito");
	}

////////////////////////////////////////////////////////////////////////////////////////////
	public void listar(int item) {

		if (item == 1) {
			System.out.println("a continuacion se mostrara la lista ALUMNOS ");
			System.out.println("ID             MATRICULA            NOMBRE             APELLIDO  ");
			System.out.println("___________________________ _____________________________________________________");
			for (Alumno Alum : alumnos) {
				System.out.println(Alum.getId() + "      " + Alum.getMatricula() + "    " + Alum.getNombre()
						+ "        " + Alum.getApellido());

			}
		}
		if (item == 2) {
			System.out.println("a continuacion se mostrara la lista MATERIA ");
			System.out.println("ID             NOMBRE            CURSO             TURNO  ");
			System.out.println("___________________________ _____________________________________________________");
			for (Materia Mater : materias) {
				System.out.println(Mater.getId() + "             " + Mater.getNombre() + "            "
						+ Mater.getCurso() + "             " + Mater.getTurno());

			}
		}

	}

	///////////////////////////////////////////////////////////////////////////////////
	//En este metodo se lista el alumno con la materias inscritas a partir del id
	
	
	public void listarAlumnoPorId(Alumno alumno) {
		
		int id=alumno.getId();
		if(id==0) {	
			System.out.println("\n Alumno no encontrado porque el id no es correcto");
		}else {
			System.out.println(" ALUMNO ENCONTRADO");
			System.out.println("Matricula: " + alumno.getMatricula() + "\n Nombre: " + alumno.getNombre()
					+ "\n Apellido: " + alumno.getApellido() + "\n ");
		}
		
		System.out.println("MATERIAS DEL ALUMNO: \n");
		List<Integer> materiasDelAlumno=alumno.getMaterias();
		if(materiasDelAlumno.size()==0) {	
			System.out.println("La materia no tiene alumnos inscritos");
		}else {
			for(Integer IdMeterias:materiasDelAlumno) {				
				materia=materias.get(IdMeterias);
				System.out.println("-------------------------------------------");
				System.out.println(" \n Materia del alumno: "+(i+1)+"\n");
				System.out.println("\n Id de la materia: "+materia.getId());
				System.out.println("\n Nombre de la materia: "+materia.getNombre());
				System.out.println("\n Curso de la mateira: "+materia.getCurso());
				System.out.println("\n Turno de la materia: "+materia.getTurno());
				System.out.println("-------------------------------------------");
				
			}
			System.out.println("\nEl alumno no tiene mas  materias \n");
	}
}
	//////////////////////////////////////////////////////////////////////////////////
// En este metodo se lista los alumnos de una materia a partir del id	
	
	public void listarMateriaPorId(Materia materia) {
		
		int id=materia.getId();
		if(id==0) {
			System.out.println(" Materia no encontrada porque el id es incorrecto");
		}else {
			System.out.println(" MATERIA ENCONTRADA");
			System.out.println("Id: " + materia.getId() + "\n Nombre: " + materia.getNombre() + "\n Curso: "
					+ materia.getCurso() + "\n Turno: " + materia.getTurno());
			
		}
		System.out.println("MATERIAS DEL ALUMNO: \n");
		List<Integer>alumnosDeLaMateria=materia.getAlumnos();
		if(alumnosDeLaMateria.size()==0) {	
			System.out.println("El alumno no tiene materias inscritas");
		}else {
			
			for(Integer IdAlumnos:alumnosDeLaMateria) {
			alumno=alumnos.get(IdAlumnos);
			System.out.println("--------------------------------------------");
			System.out.println(" \n Alumno de la materia: "+(i+1)+"\n");
			System.out.println("\n Id del  alumno: "+alumno.getId());
			System.out.println("\n Matricula del alumno: "+alumno.getMatricula());
			System.out.println("\n Nombre del alumno: "+alumno.getNombre());
			System.out.println("\n Apellido del alumno: "+alumno.getApellido());
			System.out.println("-----------------------------------------------");
			
		}
		System.out.println("\nLa materia no tiene mas alumnos registrados \n");
	}

	}
//////////////////////////////////////////////////////////////////////////////////////////////

}
