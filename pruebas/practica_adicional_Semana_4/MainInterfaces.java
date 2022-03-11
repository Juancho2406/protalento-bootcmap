package practica_adicional_Semana_4;

public class MainInterfaces {

	public static void main(String[] args) {
		Avion a=new Avion("Alfa");
		Helicoptero h=new Helicoptero("H11");
		Superman s = new Superman("Clark");
		Ovni o=new Ovni("ET");
		
		Voladores[] voladores=new Voladores[] {a,h,s,o};
		
		for(Voladores v:voladores) {
			if(v instanceof Aterrizable) {
				
				Aterrizable atr=(Aterrizable)v;
				
				atr.aterrizar();
			}else {
				System.out.println(v+" ///El Volador "+v.getNombre()+"de la clase:  "+v.getClass()+"- No puede aterrizar, no cumple contrato");
			}
			
		}

	}

}
