package main;

public class main {

	public static void main(String[] args) {
		//break lo usamos cuando necesitamos terminar con una secunecia de instrucciones
		//o cuando necesitamos salir de un ciclo
		
		int i=0;
	for (; i < 10;) {
		System.out.println(i);
		i+=1;
		if (i==5) {
			break;
			
		}
	}
	
	
	
	System.out.println("se finalizo");
		
  int x=3;
	switch (x) {
	case 1:
		System.out.println("el caso es 1");
		break;
	case 2:
		System.out.println("el caso es 2");
	case 3:
		System.out.println("el caso es 3");
		break;
     
	default:   System.out.println("invalido");
		break;
	}
	
	
	//break solo finaliza el ciclo donde es llamado no ciclos de mas alto nivel
	
	
	for (int j = 0; j < 10; j++) {
		if (j==5) {
			break;
			}
		System.out.println(j);
		
	}
	System.out.println("fuera del break");
	
	
	//en este ejemplo vemos que break solo afecta al ciclo donde esta operando
	for (int j = 0; j < 3; j++) {   //for de alto nivel
		System.out.print("entrada: ");
		for (int j2 = 0; j2 < 10; j2++) {   //for de menor nivel (aqui afecta el break. pero no afecra al for de mas nivel)
			if (j2==3) {
				break;
				
			}
			System.out.print(j2);
		}
		System.out.println();
	}
	
	
	
	
	//continue lo usamos en ciclos, continue nos permitira saltar a la siguiente iteracion
	//la palabra continue nos permite saltar a la siguiente iteracion, sin que se ejecute ese bloque de codigo
	System.out.println("haciendo uso de countinue");
	for (int j = 0; j < 10; j++) {
		if (j==5) {
			
			continue;
			
		}System.out.println(j);
	}
	
	
	
	
	//cuando nuestros ciclos son de una linea no es necesario que usemos llaves.//cuando solo se jecute una sola lina de condigo
	for (int j = 0; j < 5; j++) System.out.println("sentencia en una sola linea se muesra 5 veces");
	
	
	
	
	}
	
	
	
	
	
	
	

	


}
