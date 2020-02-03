package main;

public class main {

	public static void main(String[] args) {
		// TODO #starting  program from main metod
	Perros perro1=new Perros("firulais",  "labrador" , 24);
  System.out.println(perro1.peso);
  System.out.println(perro1.raza);
  System.out.println(perro1.getNombre());
         
	}

}



 class Perros{
	 //definimos los atributos de la clase
	private  String  nombre;
	 String  raza;
	 int peso;
	 //definimos el constructor de la clase
	 Perros(String nombre,String  raza,int  peso){
		 this.nombre=nombre;
		 this.raza=raza;
		 this.peso=peso;
		 }
	//aqui etendresmos los metodos getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}