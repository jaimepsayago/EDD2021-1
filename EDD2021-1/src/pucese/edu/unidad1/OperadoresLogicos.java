package pucese.edu.unidad1;

import java.util.Random;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// Ejemplos de operadores logicos
		
		//generar un numero randomico
		Random aleatorio = new Random();
		
		//asignando el valor aleatorio a la variable
		double i = aleatorio.nextInt() % 100;
		int j = aleatorio.nextInt() % 100;
	
		System.out.println("i=  " + i);
		System.out.println("j=  " + j);
		/*		
		//mayor que
		System.out.println("i> j es:  " + (i > j));
		System.out.println("i< j es:  " + (i < j));
		//mayor o igual que
		System.out.println("i>= j es:  " + (i >= j));
		System.out.println("i<= j es:  " + (i <= j));
		//igual y no es igual
		System.out.println("i== j es:  " + (i == j));
		System.out.println("i!= j es:  " + (i != j));
		
		//and 
		System.out.println("i<10) & & (j<10) es:  " + ((i<10) && (j<10)));
		
		//or
		System.out.println("i<10) || (j<10) es:  " + ((i<10) || (j<10)));
	*/	
		
		//CONJUNTO DE FUNCIONES PARA LAS MATEMATICAS IMPLEMENTAR FUNCIONES MATEMATICAS
		
		//ESTA ES LA LIBRERIA: MATH
		
		//POTENCIA
		System.out.println("POTENCIA " + Math.pow(i, j));
		//raiz cuadrada
		System.out.println("raiz cuadrada " + Math.sqrt(i));
		//logaritmos
		System.out.println("logaritmo decimal " + Math.log10(i));
		
		//valores absolutos
		System.out.println("valor absoluto " + Math.abs(i));
		//redondeo
		
		System.out.println("redodne al entero menor mas proximo" + Math.floor(i));
		//maximo
		System.out.println("maximo" + Math.max(i,j));
		//minimo
		System.out.println("minimo" + Math.min(i,j));
		//pi
		System.out.println("PI" + Math.PI);

		
		//funciones trigonometricas seno coseno tangente, etc.
	}

}
