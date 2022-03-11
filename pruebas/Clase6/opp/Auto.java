package Clase6.opp;

public class Auto {
	String marca;
	String modelo;
	float velocidad;
	float velocidadMaxima;
	boolean encendido;
	
	//Constructor por defecto
	Auto(){
		
	}
	//Constructor parametrizado
	Auto(String marca,String modelo,float velocidadMaxima){
		//this hace referenica a las variables y metodos propios de la clase
		this.marca=marca;
		this.modelo=modelo;
		this.velocidadMaxima=velocidadMaxima;
	}
	//metodos
	void encender() {
		if(encendido==false) {
			encendido=true;
			System.out.println("se ha encendido el auto");
		}else {
			System.out.println("Ya esta encendido el vehiculo");
		}
		
	}
	
	void apagar() {
		if(encendido==true) {
			encendido=false;
			velocidad=0;
			System.out.println("se ha apagado el auto");
		}else {
			System.out.println("Ya esta apagado el auto");
		}
		
	}
	
	void acelerar() {
		if(encendido==true) {
			if(velocidad<velocidadMaxima) {
				velocidad++;
			}else {
				System.out.println("Velocidad maxima, no es posible acelerar mas");
			}
		}else {
				System.out.println("Primero debe encender el auto");
		}
	}
	
	void frenar() {
		if(encendido==true) {
			if(velocidad>0) {
				velocidad--;
			}else {
				System.out.println("Velocidad es 0");
			}
		}else {
			System.out.println("Primero debe encender el auto");
		}
	}
	
	float obtenerVelocidad() {
		return velocidad;
	}
	
	String obtenerMarca() {
		return marca;
	}
	
	public void detalleAuto() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Encendido: "+this.encendido);
		System.out.println("Velocidad: "+this.velocidad);
		System.out.println();
	}
}

