package main;

public class Palomas {
	//establecerparametros
	void establecerParametros(String nombre, String color, int edad, int peso) {
		this.nombre=nombre;
		this.color=color;
		this.edad=edad;
		this.peso=peso;
		}
	//definimos los atributos de la clase
	String nombre;
	int edad;
	String color;
	int peso;
	//definimos los metodos de la clase
	void comer(){System.out.println("accion comer");}
	void dormir() {System.out.println("accion dormir");}
}
