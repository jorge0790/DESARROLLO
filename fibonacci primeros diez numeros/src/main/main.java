package main;

public class main {

	public static void main(String[] args) {
		//imprimir los primeros diez numeros de la serie de fibonacci
	    //0,1,1,2,3,5,8,13,21
		int n1=0,n2=1,x;
		for (int i = 0; i < 10; i++) {			
			x=n2;
			n2=n2+n1;
			System.out.println(n1);
		    n1=x;
			}
}
}
