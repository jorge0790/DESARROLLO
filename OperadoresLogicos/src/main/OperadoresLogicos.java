package main;

public class OperadoresLogicos {

	public static void main(String[] args) {
		/*al igual que con los operadores relaciones con, al comparar dos valores
		 * obtendremos un valor booleano, verdadero o falso, los operadores relacionales
		 * y los logicos pueden usarse en una misma expresion*/

		
		
		boolean resultado;
		resultado= 5<=5 && true;
		System.out.println(resultado);
		
		resultado= 5>=5 && true && 10>9;
		System.out.println(resultado);
		
		resultado = false || false || false || true;
		System.out.println(resultado);
		
		System.out.println(!false);
	}

}
