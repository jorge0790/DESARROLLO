package main;

public class main {

	public static void main(String[] args) {
		// obtener numero pares
		
		
		for (int numero= 1; numero<101;numero++) {
			if (numero%2==0) {
				//se evaluara el modulo de numero/2, cada vez que el modulo (residuo)
				//sea cero entonces implica que ese numero es par, entonces imprimelo
				System.out.println(numero);
				
			}
			
			
		}

	}

}
