package pucese.edu.unidad1;

public class UtilizacionMultipleSwitch {

	public static void main(String[] args) {
		// switch se utiliza cuando existen varias condiciones u opciones para un condicion
		
		//ejercicio
		//seleccionar un dia de la semana de acuerdo a un numero
		
		char diaSemana='4'; //declaramos variable para dia de la semana
		
		switch (diaSemana) {
		case '1': System.out.println("lunes");
				break;
		case '2': System.out.println("martes");
		break;
		case '3': System.out.println("miercoles");
		break;
		case '4': System.out.println("jueves");
		break;
		case '5': System.out.println("viernes");
		break;
		case '6': System.out.println("sabado");
		break;
		case '7': System.out.println("domingo");
		break;
		
		
		}
		
		

	}

}
