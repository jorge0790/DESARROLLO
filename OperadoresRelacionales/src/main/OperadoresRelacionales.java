package main;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		/* operadores relacionales, son los simbolos que utilizamos para comparar
		 * dos valores*/
		
		
		int variable1=300, variable2=200;
		boolean resultado;
		
       resultado=variable1 > variable2;
       System.out.println(resultado);
       
       resultado=variable1 >= variable2;
       System.out.println(resultado);
       
       resultado=variable1 <= variable2;
       System.out.println(resultado);
       
       resultado=variable1 == variable2;
       System.out.println(resultado);
      
       resultado=variable1 != variable2;
       System.out.println(resultado);
	}

}
