package main;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		// llenado de una matriz bidimensional

		int matriz[][]=new int[4][3];
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;

		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;
		
		matriz[3][0]=10;
		matriz[3][1]=11;
		matriz[3][2]=12;
		//matriz.length=4
		//matriz[j]=3
		System.out.println("matriz.lenth"+matriz.length);
		
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[j].length; j++) {
	//	System.out.println("el valor de i="+i+" el valor de j="+j);
		System.out.println(matriz[i][j]);
		}
	}
		
	}

}
