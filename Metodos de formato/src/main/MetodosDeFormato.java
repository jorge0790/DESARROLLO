package main;

public class MetodosDeFormato {

	public static void main(String[] args) {
		// hacer 
		
		
		
		String mensaje= "    Hola, soy una cadena   ";
		//este metodo regresa el string con todas sus letras mayusculas
		System.out.println(mensaje.toUpperCase());

		//este metodo retorna el string con todas sus letras en minusculas
		System.out.println(mensaje.toLowerCase());
       //metodo trim regresa el string pero no posee espacios ni al inicio ni al final
		System.out.println(mensaje.trim());
		
		//estos metodos retornan un objeto String por esta razon podemos concatenar metodos
		System.out.println(mensaje.toUpperCase().trim());
		System.out.println(mensaje.toLowerCase().trim());
		System.out.println(mensaje.charAt(5));
	}
}