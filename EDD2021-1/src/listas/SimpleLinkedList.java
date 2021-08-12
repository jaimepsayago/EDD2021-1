package listas;

//CLASE PADRE
public class SimpleLinkedList <E> {
	
	//CLASE INTERNA O CLASE HIJO DENTRO DE LA CLASE PADRE
		public static class Node<E>{
			private E element; //elemento que se guarda en el nodo
			private Node<E> next; // referencia al siguiente nodo
			
			//constructor
			public Node(E e, Node<E> n) {
				element = e;
				next = n;
			}
			
			//getters and setters o encapsulacion
			public E getElement() {
				return element;
			}
			public void setNext(Node<E> n) {
				next=n;
			}
			public Node<E> getNext(){
				return next;
			}
			
		}
	//FIN CLASE INTERNA
		
		//INSTANCIAR OBJETOS Y METODOS DE LA CLASE SIMPLELINKDLIST
		
		//head o cabeza del nodo de la lista
		private Node<E> head=null;
		private Node<E> tail=null;
		
		//numero de nodos de la lista
		private int size=0 ; //EDD DINAMICA!!!
		
		//constructor
		public SimpleLinkedList() {
			
		}
		
		//metodos para la lista enlazada
		
		//tamaño
		public int size() {
			return size();
		}
		
		//si esta vacia
		public boolean isEmpty() {
			return size==0;
		}
				
		//retornar el primer elemento
		public E first() {
			if (isEmpty()) return null;
			return head.getElement();
		}
		
		//retornar el ultimo elemento
		public E last() {
			if (isEmpty()) return null;
			return tail.getElement();
		}
		
		//agregar datos al inicio de la lista
		public void addFirst(E e) {
			head = new Node<>(e,head); //e = elemento y head = referencia
			if (size == 0)
				tail=head;
			size++;
			
		}
		
		//agregar datos al fin de la lista
		public void addLast(E e) {
			Node<E> newest = new Node<>(e, null);
			if (isEmpty())
				head = newest;
			else
			tail.setNext(newest);
			tail = newest;
		size++;
		}
		//remover
		public E removeFirst() {
			if(isEmpty()) return null;
			//n1--n2--n3
			E e1 = head.getElement(); //obtengo el valor del primer elemento n1
			head = head.getNext(); //apunto o referncio al siguiente n2
			size --;
			if (size ==0)
				tail = null;
		return e1;
		}
		//obtener cualquier dato
		public E getElementObject (int index) {
			int c = 0;
			//n1--n2--n3
			Node<E> tmp = head; //me ubico en la cabeza = n1
			//recorrerlo 
			while(c<index) {
				tmp = tmp.getNext(); //recorre cada elemento de la lista
				c++;
			}
			return tmp.getElement();
		}
		//mostrar todos
		public void getAll() {
			Node <E> tmp = head; //me ubicoi en la cabeza de la lista
			//recorrer
			while(tmp != null) {
				System.out.println(tmp.getElement().toString());
				tmp = tmp.getNext();
			}
		}
		

}
//FIN CLASE PADRE
