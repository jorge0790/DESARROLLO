package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*cuando queremos validar que dos cadenas sean iguales
esto lo podemos hacer con los metodos equals*/
		String cadena1="HOLA";
		String cadena2="hola";
		//equals nos devuelve un valor booleano
		boolean resultado= cadena1.equals(cadena2);
		System.out.println(resultado);
		//estandarizamos las cadenas
		String nuevaCadena1=cadena1.toLowerCase();
		String nuevaCadena2=cadena2.toLowerCase();
		 resultado=nuevaCadena1.equals(nuevaCadena2);
		 System.out.println(resultado);
		 //ahora lo hacemos concatenando metodos
		 boolean resultado2=cadena1.toLowerCase().equals(cadena2.toLowerCase());
		 System.out.println(resultado2);
		 
		 //en los casos donde nosotros solo queramos validar texto y que solo queramos validar contenido
		 //usamos el metodo equals ignore case
		 
		boolean resultado3= cadena1.equalsIgnoreCase(cadena2);
		System.out.println(resultado3);
		
		Scanner entrada=new Scanner(System.in);
       System.out.println("introduce tu nombre de usuario");
     String  usuario=entrada.nextLine();
     System.out.println("tu usuario es: "+usuario);
       
	     
		 
		 

	}

}
