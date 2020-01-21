package main;

public class OperadorTernario {

	public static void main(String[] args) {
		/*operador especial utilizado en casos donde 
		 * se usa mediante el signo de interrogacion
		 * expresion1 ? expresion 2 : expresion3
		 * la expresion 1 debe evaluar y dar como resultado un booleano
		 * si expresion1 es true entonces expresion 2
		 * si expresion1 es false entonces expresion 3
		 * 
		 * la expresion 2 y la expresion 3 deben ser del mismo tipo que de la variable*/
		
		String mensaje = 10 > 90? "es mayor" : "es menor";
		System.out.println(mensaje);
		int enteros = true? 1:0;
		System.out.println(enteros);
	}

}
