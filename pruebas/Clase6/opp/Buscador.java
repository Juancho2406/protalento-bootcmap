package Clase6.opp;

public class Buscador {
	
	// Atributos
	//modificadores
	private String claveBusqueda;
	private Articulo[] resultados;
	
	
	Buscador(){
		
	}
	
	void Buscar() {
		System.out.println("Buscando..."+this.claveBusqueda);
		//como mi buscador necesita buscar un objeto de la clase DB
		//debe instasnciar un objeto de dicha clase
		
		DB db=new DB();
		db.consultar(claveBusqueda);
		
		Articulo[] resultadoQueHayEnDB=db.consultar(claveBusqueda);
	}
	/*
	void definirClaveBusqueda(String clave) {
		claveBusqueda=clave;
	}
	*/
	
	//alt+shit+s
	
	
	void mostrarResultados() {
		if(this.resultados.length>0) {
			for(Articulo aux:this.resultados) {
				aux.detalleArticulo;
			}
		}
	}
	
	public Articulo[] getResultados() {
		return resultados;
	}

	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
}
