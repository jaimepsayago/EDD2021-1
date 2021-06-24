package pucese.edu.unidad1;

public class AppFor {

	public static void main(String[] args) {
		/*
		 * for ( inicio; comprobacion; actualizacion)
		 * sentencias
		 * siguiente sentencia
		 * *****for mejorado
		 * for (tipo de variable objeto : coleccion / matriz /  obj)
		 * sentencias
		 */
		
		for (int i=1; i<100; i++) {
			System.out.println(i);
		}
		
		//bucles aninados
		
		//bucles repetitivos que estan ejecutador uno dentro de otro
		
		//tabla de multiplicar
		for (int i = 1; i <= 10 ; i++) 
		{ 
			System.out.println("TABLA DEL : "+i); 
			//aninados otro for
			for (int j = 1; j <= 10 ; j++) {
				System.out.print(i+ " x " + j + " = " + (i*j) + " ");
			}
			System.out.println(" ");
		}
	}

}
