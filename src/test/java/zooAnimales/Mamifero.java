package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	static private List<Mamifero> listado = new ArrayList<Mamifero>();
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
	}

	public Mamifero(String nombre, int edad, String habitat, String genero,
			boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	static public List<Mamifero> getListado() {
		return Mamifero.listado;
	}
	public void setListado(List<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
	public int cantidadMamiferos() {
		return getListado().size();
	}
	
	
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		Animal x = new Mamifero(nombre, edad, "pradera", genero,
				true, 4);
		Mamifero.caballos++;
		return x;
	}
	public static Animal crearLeon(String nombre, int edad, String genero) {
		Animal x = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones++;
		return x;
	}
	

}
