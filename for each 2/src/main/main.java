package main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//recorrer el arreglo con  iteracion tradicional
		
		int  [][]calificaciones =new int[2][3];
		 calificaciones[0][0]=1;
		 calificaciones[0][1]=2;
		 calificaciones[0][2]=3;
		 
		 calificaciones[1][0]=4;
		 calificaciones[1][1]=5;
		 calificaciones[1][2]=6;
		
		System.out.println("con for tradicional"); 
		for (int i = 0; i < calificaciones.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(calificaciones[i][j]);
			}
			
		}
		
		//recorriendo el arreglo con for each
		System.out.println("recorrido con for each");
		for (int[] fila : calificaciones) {
			for (int celda : fila) {
				System.out.println(celda);
				
			}
		}
		
		//aqui vamos a declarar una matriz dinamica
		
		int [][]puntajes=new int[2][];
		 puntajes[0]=new int[2];
		 puntajes[1]=new int[3];
		 
		puntajes[0][0]=1;
		puntajes[0][1]=2;
		
		puntajes[1][0]=2;
		puntajes[1][1]=3;
		puntajes[1][2]=4;
		System.out.println("recorrido de matriz dinamica con for each");
		for (int []fila : puntajes) {
			for (int celda  : fila) {
				System.out.println(celda);
				
			}
			
		}
	
			
		}
		
		}



