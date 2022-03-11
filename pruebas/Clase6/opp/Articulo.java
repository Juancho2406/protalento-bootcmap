package Clase6.opp;

public class Articulo {
	String titulo;
	float precio;
	String imagen;
	boolean favorito;
	boolean envioGratis;
	boolean tieneDescuento;
	boolean tieneCuotas;
	int cantidad;
	
	Articulo(String titulo, float precio, String imagen,boolean favorito, int cantidad, boolean tieneCuotas, boolean tieneDescuento){
		if(precio>20000) {
			this.envioGratis=true;
		}
		
		this.favorito=favorito;
		this.titulo=titulo;
		this.imagen=imagen;
	
	}
	
	public void agregarAFavorito() {
		this.favorito=!this.favorito;
	}
	
	void detalleArticulo() {
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Precio: "+this.precio);
		System.out.println("Imagen: "+this.imagen);
		System.out.println("Favorito: "+this.favorito);
		System.out.println("Envio gratis: "+this.envioGratis);
		System.out.println("Tiene Descuento: "+this.tieneDescuento);
		System.out.println("Tiene Cuotas: "+this.tieneCuotas);
		System.out.println("Cantidad: "+this.cantidad);
	}
}