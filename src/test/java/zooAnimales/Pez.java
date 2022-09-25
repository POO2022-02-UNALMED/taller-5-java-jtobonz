package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {
	static private List<Pez> listado = new ArrayList<Pez>();
	static public int salmones;
	static public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
	}

	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas,
			int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public static List<Pez> getListado() {
		return Pez.listado;
	}
	public void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	
	public int cantidadPeces() {
		return getListado().size();
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public static Animal crearSalmon(String nombre, int edad, String genero) {
		Animal x = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.salmones ++;
		return x;
	}	
	
	public static Animal crearBacalao(String nombre, int edad, String genero) {
		Animal x = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.bacalaos ++;
		return x;	}	
}
