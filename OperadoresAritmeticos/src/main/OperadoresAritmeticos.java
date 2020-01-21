package main;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		
		
		/*estos son los operadores aritmeticos
		que podemos utilzar en java esto solo lo podemos utilizar con datos de tipo numero
		pero no se puede usar con datos de tipo booleano, no se puede usar tampo con char ya que char*/
		
		
		
		int variablex=50, variabley=10;
		int resultado;
		
		
		resultado= variablex+variabley;
		System.out.println(resultado);
		
		//multiplicar
		
		resultado=variablex*variabley;
		System.out.println(resultado);
		
		//division
		
		resultado=variablex/variabley;
		System.out.println(resultado);
		
		variablex=variablex+1;
		System.out.println(variablex);
		//incrementa en 1
		variablex++;
		System.out.println(variablex);
		
		
		//decrementa en 1
		variablex--;
		System.out.println(variablex);

		
		// incrementar el valor en n
		
		variablex+=100;
		
		System.out.println(variablex);
		// decrementar el valor en n
		
		variablex -=100;
		System.out.println(variablex);
		
		variablex*=3;
		System.out.println(variablex);
		
		variablex/=3;
		System.out.println(variablex);
		
		
		

	}

}
