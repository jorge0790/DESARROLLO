package main;

public class main {

	public static void main(String[] args) {
		// saber el numero de digitos de un numero

		
		int count=0;
		int numero=123456789;
		//hacer esto mientras numero sea mayor a cero
		//es bueno aplicar while cuando el numero de iteraciones no lo conocemos
		
		
		while(numero>0)
		{
			
			numero=numero/10;
			count+=1;
		}
		System.out.println("el numero tiene: "+count+" digitos");
		      
	}

}
