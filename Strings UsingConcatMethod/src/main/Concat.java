package main;

public class Concat {

	public static void main(String[] args) {
		/*we use the concat method when we needs merge two strings
		 * when we needs merge more strings than two so is necessary
		 * use more than once time the method*/
		
		//define the strings to be concated
		String cadena1="hola";
		String cadena2=" jorge";
		//the concat method returns a string,  this string can be assigned to a variable
		
	String result=cadena1.concat(cadena2);
	//and then we can show it with a print method, something like this
	System.out.println(result);
	
	
	
	String mensaje="hola bienvenido".concat(cadena2);
	System.out.println(mensaje);
	
	//onother way to concat
	
	String palabra1="hola";
	String palabra2="a";
	String palabra3="todos";
	String concated=palabra1+" "+palabra2+" "+palabra3.concat(mensaje);
	System.out.println(concated);

	}

}