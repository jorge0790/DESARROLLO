package main;

public class Cadenas {

	public static void main(String[] args) {
		// formas de declarar un String, String no es tipo de dato primitivo, es una clase.
		/*cuando se declara una variable de tipo String se le asigna un valor
		 *que puede ser una cadena, String no es un tipo de dato primitivo es una clase.
		 *  el String no es un tipo primitivo es una clase*/
		String mensaje;
		mensaje="hola este es un string";
	    System.out.println(mensaje);
	    //otra forma de declarar una variable string
	    String mensaje2=new String("este es el texto");
	    System.out.println(mensaje2);
    
	/*al generar variables de tispo S	string lo que estamos haciendo es generar un nuevo objeto
	 * un metodo es una accion que puede realizar una clase, en este caso la clase String 
	 */
	    //el metodo length retorna un entero
	   int  cantidad=mensaje.length();
	   System.out.println(cantidad);
	   //ver si nuestro mensaje posee una cadena dentro de
	   //el valor booleano es true o false ya que el metodo contains regresa un booleano  
	   boolean contiene=mensaje.contains("hola");
	   System.out.println(contiene);
	   
	   //para saber si comienza con un String
	   boolean comienza=mensaje.startsWith("hola");
	   System.out.println(comienza);
	   //para saber ssi finaliza con una cadena
	   boolean finalizaCon=mensaje.endsWith("string");
	   System.out.println(finalizaCon);
	   //concatenar un string con el metodo concat, regresa un string
	   //el cual concatena el contenido de mensaje con la cadena que coloque como arumento del metodo
	   String concatenado=mensaje.concat("hola a todos aqui");
	   System.out.println(concatenado);
	   
	}

}
