package main;

public class main {

	public static void main(String[] args) {
		// vamos a crear un objeto de tipo Perro
		Palomas helly=new Palomas();
	     
		helly.establecerParametros("helly", "negro", 4, 500);
		System.out.println(helly.nombre);
		System.out.println(helly.color);
		System.out.println(helly.edad);
		System.out.println(helly.peso);
		System.out.println();
		System.out.println("el nombre de la paloma es: "+helly.nombre+" el color es: "+helly.color);
		
	}

}
