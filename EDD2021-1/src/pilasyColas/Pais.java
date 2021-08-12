package pilasyColas;

public class Pais {
	String nombre,capital,habitantes;

	//constructor 
	public Pais() {
		
	}
	public Pais(String nombre, String capital, String habitantes) {
		this.nombre=nombre;
		this.capital= capital;
		this.habitantes=habitantes;
	}
	
	
	//encapsulacion
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(String habitantes) {
		this.habitantes = habitantes;
	}

	//mostrar
	public void mostrar() {
		System.out.println(nombre + " " + capital + " " + habitantes);
	}
	
	
	
}
