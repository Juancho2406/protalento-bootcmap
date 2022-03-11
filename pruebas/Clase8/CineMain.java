package Clase8;

public class CineMain {

	public static void main(String[] args) {
		
		
		Persona persona= new Persona("persona1","apellido1","negro");
		Persona empleado= new Empleado("empleado1","apellidoEmp1","Rojo",1);
		Persona efectivo= new Efectivo("efectivo1","Apellidoefectivo1","rubio",1);
		Persona contratado= new Contratado("nombre","apellido contratado","azul",1,6);
		
		Director director=new Director("nombre director","apellido director","negro",10);
		
		Persona[] personas=new Persona[5];
		personas[0]=persona;
		personas[1]=empleado;
		personas[2]=efectivo;
		personas[3]=contratado;
		personas[4]=director;

		//recorrer las personas que entran al cine y quiero saber si son un director
		// con aux tengo acceso a todos los metodos public de persona
		
		
		 for(Persona aux:personas) {
			 aux.detalle();
			 //?? Extraer la clase a la que pertenece getClass instanceof
			 // (Clase)objeto> castear=casting
			 if(aux instanceof Director) {
				 Director d=(Director)aux;//Casteo
				aux.getApellido();
				d.getApellido();
				 
				 
				 System.out.println("Director"+d.getEmpACargo()+"va a una silla especial!!!!");
			 }
		 }
	}

}
