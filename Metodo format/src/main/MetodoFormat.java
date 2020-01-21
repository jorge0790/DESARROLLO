package main;

public class MetodoFormat {

	public static void main(String[] args) {
		//format retorna un nuevo string y asi mismo a este string le podemos aplicar mas metodos
		
     // format es un metodo interesante que posee la clase string, format: este
	//metodo nos permite generar nuevos strings a partir de diferentes dipos de datos
    //al ser un metodo de clase lo que hacemos es colocar la clase string
    String mensaje="";
    String curso="java"; //una variable curso que es igual a java
    //%s es remplazado por Java
   mensaje = String.format("Bienvenido al curso %s", "Java");
   System.out.println(mensaje);
   //asi tambien podemos darle formato a variables 
   float  valor= 10.3268368236f;
   String  valorConFormato=String.format("%.5f %s", valor, "MX");
   System.out.println(valorConFormato);
   //si queremos trabajar con variables de tipo entero usamos %d
   
   valorConFormato=String.format("el valor de %d articulos es: %.5f %s", 3, valor,"MX");
   System.out.println(valorConFormato);
   valorConFormato.toUpperCase();
   System.out.println(valorConFormato);
   
   
   //si vamos a usar dicho tipo de metodos solo para imprimir strings es mas recomendable
   //usar printf el cual recibe como primer argumento un formato, y como segundo argumento
   //los valores con los que se ava a generar el string
   
   System.out.printf("el valor de %d articulos es: %.5f %s",3,valor,"MX");
   System.out.println("");
   
   //con Strings
   String nombreYapellido=String.format("%s %s", "jorge", "padilla");
   System.out.println(nombreYapellido);
   
   
   //Con Numero Enteros
   String resultado=String.format("%d %d %d",1,2,3);
   System.out.println(resultado);
   
   //BOOLEAN
   int numero =10;
   
   boolean numeroEsMayor= numero>5;
   String result=String.format("%s", numeroEsMayor);
   System.out.println(result);
   
   
   }

}
