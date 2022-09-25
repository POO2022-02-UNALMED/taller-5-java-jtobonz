package zooAnimales;


public class Anfibio extends Animal {
	static private Anfibio[] listado = new Anfibio[100];
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	static int aux = 0;
	
	public Anfibio() {
		listado[aux] = this;
		aux++;
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero,
			String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado[aux] = this;
		aux++;
	}

	public static Anfibio[] getListado() {
		return Anfibio.listado;
	}
	public void setListado(Anfibio[] listado) {
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
		return getListado().length;
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		new Mamifero();
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		setColorPiel("rojo");
		setVenenoso(true);
		setHabitat("selva");
		Anfibio.ranas ++;
	}	
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		new Mamifero();
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		setColorPiel("negro y amarillo");
		setVenenoso(false);
		setHabitat("selva");
		Anfibio.ranas ++;
	}
}
