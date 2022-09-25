package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	static private List<Anfibio> listado = new ArrayList<Anfibio>();
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero,
			String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}

	public static List<Anfibio> getListado() {
		return Anfibio.listado;
	}
	public void setListado(List<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public int cantidadAnfibios() {
		return getListado().size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Animal crearRana(String nombre, int edad, String genero) {
		Animal x = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas ++;
		return x;
	}	
	
	public static Animal crearSalamandra(String nombre, int edad, String genero) {
		Animal x = new Anfibio(nombre, edad, "selva", genero, "negro y amariilo", false);
		Anfibio.salamandras ++;
		return x;
	}	
}
