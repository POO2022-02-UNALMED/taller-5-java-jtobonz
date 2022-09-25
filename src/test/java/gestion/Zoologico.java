package gestion;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	
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

	public Zona[] getZonas() {
		return zonas;
	}

	public void setZonas(Zona[] zonas) {
		this.zonas = zonas;
	}
	
	public void agregarZonas(Zona zona) {
		zonas[getZonas().length] = zona;
	}
	
	public int cantidadTotalAnimales() {
		int cantidadTotalAnimales = 0;
		for (int i = 0; i < getZonas().length; i++) {
			 cantidadTotalAnimales += zonas[i].cantidadAnimales();
		}
		return cantidadTotalAnimales;
	}
	
	
}
