package Clase6.opp;

public class ProgramaAuto {

	public static void main(String[] args) {
		
		//Instanciar un objeto de la clase auto
		Auto miClio= new Auto("clio","mio",178);//Constructor//ctrl+shift+i -> Ejecuta una linea exclusivamente
		
		Auto miClio1=null;
		
		miClio.encender();
		//Auto miClio=new Auto("clio","mio",178);
		miClio.detalleAuto();
		miClio.acelerar();//f5->adentranos en el metodo
		miClio.detalleAuto();
		miClio.apagar();//f6 -> siguiente linea
		miClio.detalleAuto();
		
		
		
	}

}
