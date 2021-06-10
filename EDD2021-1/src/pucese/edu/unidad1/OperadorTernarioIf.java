package pucese.edu.unidad1;

public class OperadorTernarioIf {

	public static void main(String[] args) {
		//operador TERNARIO ?:
				//NOS SIRVE COMO UN IF REDUCIDO
				//mas sencilla CON POCAS LINEAS CODIGO UN SIMPLE IF - ELSE
				//ESTRUCTURA: resultado=(condicion)?valor1;valor2
		
		int x=1;
		int y=2;
		int mayor=0;
		
		mayor= (x>y)?x:0;
		System.out.println(mayor);
	}

}
