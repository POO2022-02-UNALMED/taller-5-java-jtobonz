package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}	
	
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.aux + "\n"
				+ "Aves: " + Ave.aux + "\n"
				+ "Reptiles: " + Reptil.aux + "\n"
				+ "Peces: " + Pez.aux + "\n"
				+ "Anfibios: " + Anfibio.aux + "\n";
	}

	@Override
	public String toString() {
		String x = "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en "
				+ getHabitat() + " y mi genero es " + getGenero() ;
		if (zona != null){
			x = "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en "
					+ getHabitat() + " y mi genero es " + getGenero()
				+ ", la zona en la que me ubico es " + getZona() + ", en el " + zona.getZoo();
		}
		return x;
	}
	
	
	
}
	
