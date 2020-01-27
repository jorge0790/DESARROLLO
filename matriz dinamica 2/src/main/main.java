package main;
public class main {
    public static void main(String[] args) {
		// definimos un areglo dinamico
		
		int [][]matriz=new int[2][];
		matriz[0]=new int[2];
		matriz[1]=new int[4];
		//procedemos a guardar los datos
		matriz[0][0]=0;
		matriz[0][1]=1;
		
		matriz[1][0]=2;
		matriz[1][1]=3;
		matriz[1][2]=4;
		matriz[1][3]=5;
		
		System.out.println(matriz[0][0]);
		System.out.println(matriz[0][1]);
		
		System.out.println(matriz[1][0]);
		System.out.println(matriz[1][1]);
		System.out.println(matriz[1][2]);
		System.out.println(matriz[1][3]);
		//aqui los vamos a recorrer con un for each
		for (int[] calificaciones : matriz) {
			for (int calificacion : calificaciones) {
				System.out.print(calificacion+" ");
				
			}
			System.out.println();
		}

	}

}
