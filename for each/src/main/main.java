package main;
public class main {
       public static void main(String[] args) {
		// for each se usa cuando necesitamos recorrer un arreglo y obtener los valores
    	   //que este posee
		int calificaciones[]= {2,2,3,4,5};
		int suma=0;
		//   recorrido de cada casilla, estructura que vamos a recorrer
		for (int valorPorIndice : calificaciones) {
			suma=suma+valorPorIndice;
			}
		float	promedio=suma/calificaciones.length;
		System.out.printf("el promedio es: %.2f",promedio);
		
	}

}
