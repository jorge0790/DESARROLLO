package main;

public class main {

	public static void main(String[] args) {
		// aqui se instancia el objeto
    Perro firulais=new Perro();
    
    firulais.establecerParametros("firulais", "labrador", 2);
    System.out.println(firulais.nombre);
    System.out.println(firulais.edad);
    System.out.println(firulais.raza);
    
    System.out.println("aplicamos el metodo comer");
    firulais.comer();
    firulais.ladrar();
	}

}
