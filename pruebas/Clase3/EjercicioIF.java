package Clase3;


public class EjercicioIF {
	public static void main(String[] args) {
		int n1, n2,n3;
		n1 = 20;
		n2 = 16;
		n3 = 19;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1);
		}
		if(n2 > n1 && n2 > n3) {
			System.out.println(n2);
		}
		if(n3 > n1 && n3 > n2) {
			System.out.println(n3);
		}
		
		// n1 y n2 < n3
		// n1 y n3 < n2
		// n3 y n2 < n1
		if(n1 == n2 && n1 > n3) {
			System.out.println(n1);
		}else {
			if(n3 > n2) {
				System.out.println(n3);
			}
		}
		if(n1 == n3 && n1 > n2) {
			System.out.println(n1);
		}else {
			if(n2 > n1) {
				System.out.println(n2);
			}
		}
		if(n2 == n3 && n2 > n1) {
			System.out.println(n2);
		}else {
			if(n1 > n2) {
				System.out.println(n1);
			}
		}
		
		// n1 == n2 == n3
		if(n1 == n2 && n2 == n3 ) {
			System.out.println("iguales");
		}
	}
}