package main;

public class main {

	public static void main(String[] args) {
		// strings como cadenas en java
		//aqui podemos obtener la longitud de la cadena
   String mensaje="hola mundo";
   System.out.println(mensaje.length());
   //obtener el primer caracter de la cadena
   System.out.println(mensaje.charAt(0));
   //cuando queremos conocer la posicion de algun caracter
   System.out.println(mensaje.indexOf("m"));
   //substring, retorna el substring del caracter a donde estamos apuntando
   String substring=mensaje.substring(6);
   System.out.println(substring);
   
   
   
	}

}
