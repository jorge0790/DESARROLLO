package main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Perro perro1=new Perro("popi", "labrador", 5);
System.out.println(perro1.nombre+" "+perro1.raza);
perro1.comer();
System.out.println("el poso del perro es: "+perro1.peso());
System.out.println(perro1.getNombrePrivado());
perro1.setNombrePrivado("nombre cambiado");
System.out.println(perro1.getNombrePrivado());

	}

}

class Perro{
	//aqui definimos los atributos
	String nombre;
	String raza;
	int peso;
private	String nombrePrivado="nombre original";
	//metodo constructor de la clase
	Perro(String nombre, String raza,int peso ){
		        this.nombre=nombre;
				this.raza=raza;
				this.peso=peso;
				}
	
	//aqui pasamos a colocar lo metodos de la clase
	void comer() {System.out.println("comiendo");}
	void dormir() {System.out.println("durmiendo");}
	int peso() {
		int elPeso=this.peso;
		return elPeso;
	}
	//aqui definimos un metodo privado, los metodos getter se utilizan para acceder a las variable privadas
	public String getNombrePrivado() { 
		return this.nombrePrivado;}
	//metodo set para setear valores privados dentro de la clase
	public void setNombrePrivado(String nombre) {
		this.nombrePrivado=nombre;
		}
	
}
