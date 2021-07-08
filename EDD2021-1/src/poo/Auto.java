package poo;

public class Auto {
	

	
	//propiedades = variables = caracteristicas
	//cientosde variables se pueden crear 
	
	public int ruedas;
	private int ancho;
	protected int peso;
	
	//constructor
	//es un metodo especial para inicializar objetos o variables
	public Auto() {
		ruedas = 4;
		ancho = 5;
		peso = 2000;
	}
	
	
	//comportamientos = metodos, procedimientos o funciones
	//puedo crear muchos metodos
	public void imprimir() {
		System.out.println("ruedas: " + ruedas +  "ancho: "+ ancho + "peso:" + peso);
	}

}
