package figuras;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		/*
		 * ejercicio
		 * bucle exterior 5 veces
		 * bucle interno imprimir 10 numeros de esas 5 veces
		 * para un total de 50 numeros impresos
		 */
		
		//bucle exterior de 5
	/*	for (int i = 1; i<=5; i++) {
			for (int j=1; j<=10; j++) {
				System.out.print((i * j)+ " " );
			}
			System.out.println(); //salto de linea
			
		}
	*/
		/*
	//dibujar un cuadrado
		for (int i = 1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				//System.out.print(i + " * " + j);
				System.out.print(" * ");
		}
		System.out.println(); //salto de linea
		}
*/
		/*
//dibujar la mitar de un triangulo
		for (int i = 1; i<=6; i++) {
			//System.out.println("i:-"+i  );
			for (int j=1; j<=i; j++) {
				//System.out.print(" * ");
				System.out.print(i);
			}
			System.out.println(); //salto de linea
		}
	*/
		/*
		 * Cuál es el Código necesario para generar esta salida?

1, 1
2, 1
3, 1
1, 2
2, 2
3, 2

		
		for (int i = 1; i<=6; i++) {
			//System.out.println("i:-"+i  );
			for (int j=1; j<=i; j++) {
				//System.out.print(" * ");
				System.out.println(j + " , " + i);
			}
			//System.out.println(); //salto de linea
		}
		 */
		
	//bucle con un algoritmo de decremento / incremento
	/*	
		
		for (int i = 1; i<=5; i++) { //for externo
			//System.out.println("i:-"+i  );
			for (int j=1; j<=(-1 * i + 5); j++) { //for interno
				System.out.print("."); //imprimir bucle interno
			}
			System.out.print(i); //imprimir bucle externo
			
			for (int j=1; j<=(i-1); j++) { //for interno
				System.out.print("."); //imprimir bucle interno
			}
			System.out.println();
			
			
		}
		*/
		//un cuadrado con n elementos desde consola
		Scanner input = new Scanner(System.in);
		int n; 
		int fila, col;
		System.out.print ("Lado del cuadrado: ");
		n = input.nextInt();;
		for (fila=1; fila<=n; fila++)
		{
		for (col=1; col<=n; col++)
		System.out.print ("* ");
		System.out.println ("");
		}
		
//TAREA EN CLASE
		//triangulo
		
		//rectangulo
				
		//un cuadrado solo los bordes
				
		// un triangulo solo los bordes
				
		// un rectangulo solo los bordes
		
		
		
//fin clase
	}

}
