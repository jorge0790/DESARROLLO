package main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String coloLuz="rosa";
		
		switch(coloLuz) {
		//no podemos tener casos repetidos en un mismo switch, los casos se evaluan de forma desente
		//todos los casos deberan ser del mismo tipo que  nuestra expresion dentro de switch
		//dentro de las llaves colocamos los casos con los que xevaluamos la expresion
		
		case "verde":
			//las lineas de codigo que se ejecutar cuando el caso sea verde, no usamos llaves, usamos   ":"
			// veamos que caso no esta acotado por {} lo que implica que no es un bloque de codigo.
			System.out.println("el color es verde");
		    //al finalizar el caso, finalizamos el swtich
			break;
			
		case "rojo":
			System.out.println("el color es rojo");
			break;
			
		case "rosa":
			System.out.println("el color es rosa");
			break;
			//dafault se ejecuta cuando ninguno de los casos se cumple
			default: 
			System.out.println("el caso no existe");
			
		}
		
		
		
		
		

	}

}
