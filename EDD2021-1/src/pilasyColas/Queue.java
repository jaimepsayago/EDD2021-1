package pilasyColas;

public interface Queue <E> {
	//tamaño
	int size();
	
	//si esta vacia
	boolean isEmpty();
	
	//insertar elemento
	void enqueue(E e);
	
	//retorne el prier valor
	E first();
	//remover
	E dequeue();

}
