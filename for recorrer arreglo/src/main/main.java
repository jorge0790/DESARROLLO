package main;
    public class main {
     public static void main(String[] args) {
		// recorrer un arreglo con estructura for
		//declaramos el arreglo
		
		int  numeros[]= {1,4,3,4,5,6,7,8,9};
float suma=0;
		for (int i = 0; i < numeros.length; i++) {
	    suma=numeros[i]+suma;
		}System.out.printf("el promedio de las calificaciones es: %.2f ",suma/numeros.length);
     }

}