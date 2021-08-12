package pilasyColas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppPaisesPila {
	public static void main(String[] args) {
		
		//crear una pila tipo pais
		Stack<Pais> stackPais = new ArrayStack<>();
		
		//crear paises
		Pais pais; //variable de tipo pais
		
		//agregar los paises
		String N = leerTexto("inserte la cantidad de paises");
		int cantidad = Integer.parseInt(N);
		for(int i=0; i<cantidad; i++) {
			//agregar los datos de los objeto pais 
			pais = new Pais(
					leerTexto("insert nombre:"), 
					leerTexto("inserte capital" ), 
					leerTexto("inserte habitantes"));
			//insertar los paises creados en la pila stackPais
			
			stackPais.push(pais);
			
		}
		
		//mostrar datos guardados en la pila
		while(!stackPais.isEmpty()) {
			pais=stackPais.pop();
			pais.mostrar();
		}
		
		
	}
	
	static private String leerTexto(String mensaje) {
		String texto;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			texto=in.readLine();
		} catch (IOException e) {
			texto="error";
		}
	return texto;
	}

}
