package main;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		// llenar una matriz y depues recorrerla
		
		//se llena la matriz
		int matriz[][]=new int[2][3];
		System.out.println("llenado de la matriz");
		matriz[0][0]=0;
		matriz[0][1]=1;
		matriz[0][2]=2;
		
		matriz[1][0]=3;
		matriz[1][1]=4;
		matriz[1][2]=5;
		System.out.println("se imprime la matriz previamente llenada");
		//se imprimen los valores de la matriz uno a uno
		System.out.println(matriz[0][0]);
		System.out.println(matriz[0][1]);
		System.out.println(matriz[0][2]);
		
		System.out.println(matriz[1][0]);
		System.out.println(matriz[1][1]);
		System.out.println(matriz[1][2]);
		
		
		//aqui vamos a recorrer el arreglo con un ciclo for
		//para imprimir los valores de la matriz
		System.out.println("recorrido de la matriz");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.println(matriz[i][j]);
				
			}
			
		}
		
	//recorido de la matriz con for each	
	for (int[] fila : matriz) {
		for (int celda : fila) {
			System.out.println(celda);
			
		}
		
	}
		
	
	
	//recorrer la matriz con un for each
	
	System.out.println("imprimir la matriz con for each");
	
	
	for (int[] fila : matriz) {
		for (int celda : fila) {
			System.out.println(celda);
			
		}
		
	}
		

	}

}
