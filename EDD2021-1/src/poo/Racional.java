package poo;

public class Racional {
	/*
	La clase Racional define el numerador y el denominador característicos de un número racional. 
	Por cada dato se proporciona un método miembro que devuelve su valor y un método que asigna numerador y denominador.

	Tiene un constructor que inicializa un objeto a 0/1. 
	*/
	
	private int numerador;
	private int denominador;
	
	//constructor
	public Racional() {
		numerador = 0;
		denominador =1;
	}
	
	//metodos
	public int leerN() {
		return numerador;
	}
	
	public int leerD() {
		return denominador;
	}
	
	public void asignar(int n, int d) {
		numerador = n;
		denominador = d;
	}
	
	
	
	
	
}
