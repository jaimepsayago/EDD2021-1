package pilasyColas;

import java.util.Iterator;
import java.util.LinkedList;

public class AppQueue {

	public static void main(String[] args) {
		//para implementar una cola
		//1. array generico
		//2. libreria linkedlist
		
		
		// cola con linkedlist
		//creamos una cola
		LinkedList<String> cola = new LinkedList<String>();
		//agregar datos
		cola.add("juan");
		cola.add("pedro");
		cola.add("jose");
		cola.add("pablo");
		
		cola.addFirst("susana");
		cola.addLast("bruno");
		
		//agregar datos en posiciones ejemplo posicion 3
		cola.add(2,"carlitos");
		
		//remover
		cola.remove(3);
		
		//obtener los datos que se desea dato de la posicion 1
		Object datoObtenido = cola.get(1);
		System.out.println("datos posicion 1 " + datoObtenido);
		
		//agregar datos sobre los datos iniciales (reemplazar)
		cola.add(2, "cambio por jorge");
		
		
		//mostrar datos
		//collections --> arraylist linkelist map hashtables
		//Iterator --> recorrer un objeto sin saber o concer su tamaño (recorre objetos dinamicos)
		
		Iterator<String> iterator = cola.iterator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//cola con array generico
		//crear objeto
		Queue<Integer> s = new ArrayQueue<>();
		
		s.enqueue(8);
		s.enqueue(9);
		s.enqueue(26);
		
		System.out.println(s.first());
		
		while(!s.isEmpty()) {
			System.out.println(s.dequeue());
		}
		
		
		

	}

}
