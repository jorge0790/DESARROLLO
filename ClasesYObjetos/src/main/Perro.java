package main;

public class Perro {
//definimos los atrbutos
	String  nombre;
	String raza;
	int edad;
	
//definimos los metodos
	void establecerParametros(String nombrePerro, String razaPerro, int edadPerro ) {
	this.edad=edadPerro;
	this.raza=razaPerro;
	this.nombre=nombrePerro;
		
	}
	
	void comer() {  //esta es la estructura para declarar un metodo
		System.out.println("comiendo");
	}
	
	void ladrar() {
		System.out.println("ladrar");
	}
	
}
