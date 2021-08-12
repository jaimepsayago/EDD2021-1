package listas;

public class AppSimpleLinkedList {
	public static void main(String[] args) {
		
		SimpleLinkedList<Integer> listaEnlazada = new SimpleLinkedList<>();
		
		listaEnlazada.addFirst(15);
		listaEnlazada.addFirst(25);
		listaEnlazada.addFirst(35);
		//35--25--15
		listaEnlazada.addLast(45);
		//35--25--15 -- 45
		//System.out.println(listaEnlazada.last());
		
		listaEnlazada.getAll();
		
		System.out.println("indice--2--"+listaEnlazada.getElementObject(2));
		
		/*
		 * 3 puntos
		Realizar un programa utilizando listas enlazadas, 
		se debe crear una clase estudiantes con los siguientes datos la cedula, 
		nombre, edad estos datos por teclado
		Los procesos que se deben realizar en la lista son (lista de Estudiante)son: 
		calcular el promedio de los estudiantes, el estudiante mayor de la lista, 
		y calcular la cantidad de estudiantes que tienen mas de 20 años.
		
		*pista: se debe generar en simplelinkedlist dos metodos 
		*promedio()
		*Estudiante mayor()

		 */
		
	}
}
