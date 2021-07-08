package poo;

public class AppAuto {

	public static void main(String[] args) {
		// instanciar un objeto de la clase Auto
		Auto aveo;
		//inicializar el objeto
		aveo = new Auto();
		//obtener las variables de la clase Auto
		System.out.println("este coche tiene el peso: " + aveo.peso);
		//obtener todas las propiedades
		System.out.println("estas  son todas la propiedades del objeto aveo: ");
		aveo.imprimir();
	}

}
