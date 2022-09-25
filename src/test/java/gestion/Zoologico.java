package gestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();

	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Zona> getZona() {
		return zonas;
	}

	public void setZona(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		Iterator<Zona> i = zonas.iterator();
		int cantidadTotalAnimales = 0;
		while (i.hasNext()) {
			cantidadTotalAnimales += i.next().cantidadAnimales();
		}
		return cantidadTotalAnimales;
	}
	
	
}
