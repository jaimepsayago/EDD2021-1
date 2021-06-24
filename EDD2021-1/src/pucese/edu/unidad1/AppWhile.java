package pucese.edu.unidad1;

public class AppWhile {

	public static void main(String[] args) {
		// un bucle repetitivo para conocer si es un numero par o impar y sumarlos
		
		//variables
		int contarPares =0;
		int aculumadorPares =0;
		int contadorImpares = 0;
		int acumuladorImpares =0;
		
		int i = 1; //contador
		
		while (i<50) { //condicion
			//ejecuta el bloque de instruccion
			//conocer si es par o impar a traves del comando mod = sobrante de la division
			if (i%2 == 0) {
				contarPares++; //contando un por uno
				aculumadorPares+=i; // sumando el valor de i a la variable
			}
			else {
				contadorImpares++;
				acumuladorImpares+=i;
				//imprimir
			}
			//aumentar el contador del while
		i++; 
		}
		//imrpmir las variables 
		
		System.out.println("Se han procesado "+contarPares+" números pares, "
				+ "y su suma es "+aculumadorPares);
		System.out.println("Se han procesado "+contadorImpares+" números impares, "
				+ "y su suma es "+acumuladorImpares); 

	}

}
