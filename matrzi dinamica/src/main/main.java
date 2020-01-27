package main;
 public class main {
     public static void main(String[] args) {
		// matriz dinamica, un arreglo que almacene arreglos de diferentes longitudes
	   //un areglo de 2 filas donde cada fila puede poseer una longitud diferente		
		int calificaciones[][]=new int[2][];
         
		calificaciones[0]=new int[2];
		calificaciones[1]=new int[4];
		
		calificaciones[0][0]=10;
		calificaciones[0][1]=9;
		
		calificaciones[1][0]=10;
		calificaciones[1][1]=10;
		calificaciones[1][2]=10;
		calificaciones[1][3]=10;
		//recorremos el aregloc con for each
		for (int fila[]:calificaciones) {
			for (int celda : fila) {
				System.out.print(celda+" ");
				}
			System.out.println();
			
		}
		
		
		
	}

}
