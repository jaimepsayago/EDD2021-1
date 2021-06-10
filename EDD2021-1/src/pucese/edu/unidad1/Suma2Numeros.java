package pucese.edu.unidad1;

import java.util.Scanner;

public class Suma2Numeros {

	//declarar atributos
	String a;
	
	public static void main(String[] args) {
		
		//Sumar dos numeros
		
		//objeto para ingreso de datos
		Scanner entrada = new Scanner(System.in);
		
		//variables
		int n1;
		int n2;
		int suma;
	/*	
		//pedir los datos del n1
		System.out.print("escriba el n1: ");
		//leer los datos del n1
		n1 = entrada.nextInt();
		
		//pedir los datos del n2
		System.out.print("escriba el n1: ");
		//leer los datos del n2
		n2 = entrada.nextInt();
			
		//procesar los datos (sumar)
		suma = n1 +n2;
		//imprimir la suma
		System.out.printf("la suma es %d \n", suma);
		
	*/	
		//formatos 
		double n11 = 1.25036;
		//imprimir la variable n11 con formato
		System.out.printf("%.3f \n", n11);
		//System.out.println(); //un salto de linea
		
		//imprimir la variable n11 con 3 decimales y un signo en positivo
		System.out.printf("%+.4f", n11);
		
		
		double q = 1.0/3.0;
		System.out.printf ("1.0/3.0 = %5.3f %n", q);
		System.out.printf ("1.0/3.0 = %7.5f %n", q);
		q = 1.0/2.0;
		System.out.printf ("1.0/2.0 = %09.3f %n", q);
		q = 1000.0/3.0;
		System.out.printf ("1000/3.0 = %7.1e h%n", q);
		q = 3.0/4567.0;
		System.out.printf ("3.0/4567.0 = %7.3e %n", q);
		q = -1.0/0.0;
		System.out.printf ("-1.0/0.0 = %7.2e %n", q);
		q = 0.0/0.0;
		System.out.printf ("0.0/0.0 = %5.2e %n", q);
		System.out.printf ("pi = %5.3f, e = %10.4f %n", Math.PI, Math.E);
		double r = 1.1;
		System.out.printf("C = 2 * %1$5.5f * %2$4.1f, "+"A = %2$4.1f * %2$4.1f * %1$5.5f %n",Math.PI, r);

	}
///declaracion de funciones o metodos
	
}



