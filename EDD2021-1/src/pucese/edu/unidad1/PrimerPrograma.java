package pucese.edu.unidad1; //ruta de la app

import java.util.Scanner;

//este es un comentario
/*dfasd
 *varias lineas de comentarios 
 */
public class PrimerPrograma { //nombre de la app

	//metodo/funciones/procedimientos (METODO) empieza la 
	//ejecucion de la aplicacion en java
	public static void main(String[] args) {
	
		//imprimir un mensaje de bienvenidda
		
		System.out.println("bienvenidos a la programación en java!");
		
		//utilizamos el metodo prinftf para mostrar datos con formato
		System.out.printf( "%s\n %s\n %s %s", "bienvenidos" , "a la programacion en java", "es otra variable",
			"cuarta linea"	);
		
		//ENTRADA Y SALIDA DE DATOS
		//LIBRO COMO PROGRAMAR EN JAVA DE DEITEL CAP 2, 3
		
		Scanner input = new Scanner (System.in);
		
		//enviar un mensaje de ingreso de datos
		System.out.println("\n inserte en texto a continuación");
		
		//ingreso de datos
		String text = input.nextLine();
		
		//imprimir o mostrar lo que ingrese en la variable text
		System.out.println(text);
		
		//cerrar variable
		input.close();
		
	}//fin del metodo main

}//fin de la clase primerPrograma
