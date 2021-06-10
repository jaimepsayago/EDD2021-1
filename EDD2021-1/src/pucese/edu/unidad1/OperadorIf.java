package pucese.edu.unidad1;

public class OperadorIf {

	public static void main(String[] args) {
		// condicionales---> if y switch
		//repetitivos o loops---> for while do while 
		
		
		//ejercicio: comparar dos valores
		
		int intento = 15;
		int solucion = 15;
		int resultado = 0;
		
		//condicional
		if (intento > solucion)
		{
			resultado = +1;
			
		}
		else if (intento < solucion)
		{
			resultado = -1;
		}
				else { 
					resultado = 0; 
				}
		System.out.println(resultado);

	}

}
