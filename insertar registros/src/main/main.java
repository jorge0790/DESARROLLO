package main;

public class main {

	public static void main(String[] args) {
		// insertar valores
       int valores[]=new  int [10];
       
       for (int indice=0; indice<valores.length; indice++) {
    	   valores[indice]=indice;
    	    }
     //hacemos el uso del for each
       for (int valor: valores) {
    	   System.out.println(valor);
	}
    	   }

}
