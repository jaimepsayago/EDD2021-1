package pilasyColas;

public class ArrayQueue<E> implements Queue<E> {

	//variables
	private E[] data; //datos que se guardan
	private int f=0; //indice
	private int sz= 0; //numero de elementos
	public static final int CAPACITY = 1000;
	
	//constructor 
	public ArrayQueue() {
		this(CAPACITY); //tamaño por defecto
		
	}
	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		data = (E []) new Object[capacity];//tamaño declarado por el usuario
	}
	
	
	@Override
	public int size() {
		return sz;
	}

	@Override
	public boolean isEmpty() {
		return (sz == 0);
	}

	//insertar un elemento
	@Override
	public void enqueue(E e) {
		if (sz == data.length) throw new IllegalStateException("cola esta llena");
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
	}

	//retorna el primer valor pero NO lo remueve
	@Override
	public E first() {
		if(isEmpty()) return null;
		return data[f];
	}

	//retornar el valor y remueve el elemento
	@Override
	public E dequeue() {
		if(isEmpty()) return null;
		E res = data[f]; // instancia un obj en una variable res
		data[f] = null; //referencia el objeto al collector de garbage
		f=(f+1)%data.length; //reobtengo el indice del tamaño
		sz--; //disminuir el tamño del objeto
		return res;
		
		
		
	}

}
