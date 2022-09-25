package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
	static private List<Ave> listado = new ArrayList<Ave>();
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	static int aux = 0;
	
	public Ave() {
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero,
			String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public static List<Ave> getListado() {
		return Ave.listado;
	}
	public void setListado(List<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
	public int cantidadAves() {
		return getListado().size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		Animal x = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.halcones ++;
		return x;
	}
	
	public static Animal crearAguila(String nombre, int edad, String genero) {
		Animal x = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.aguilas ++;
		return x;
	}
}
