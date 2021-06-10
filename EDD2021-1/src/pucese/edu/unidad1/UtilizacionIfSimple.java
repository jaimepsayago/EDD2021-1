package pucese.edu.unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UtilizacionIfSimple {

	public static void main(String[] args) {
		// a partir de la tarea entregada del alumno ver si aprueba o no
		
		byte nota = 0;
		String tareaEntregada = " ";
		BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("introduzca una nota: ");
			nota = (byte)Integer.parseInt(bufferdReader.readLine()); //conversion de string a byte
			System.out.print("se entregado la tarea S/N: ");
			tareaEntregada = bufferdReader.readLine();
			
			//condicion si la nota es mayor a 5 y si fue entregada, esta aprobado, sino no esta aprobado
			
			if (nota > 3 && ((tareaEntregada.charAt(0) == 'S') || (tareaEntregada.charAt(0) == 's')) ) {
				System.out.println("aprobado");
			}
			else {
				System.out.println("reprobado");
			}
	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		
		
		

	}

}
