package zooAnimales;


public class Ave extends Animal {
	static private Ave listado[] = new Ave[100];
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	static int aux = 0;
	
	public Ave() {
		listado[aux] = this;
		aux++;
	}
	
	public Ave(String nombre, int edad, String habitat, String genero,
			String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado[aux] = this;
		aux++;
	}

	public static Ave[] getListado() {
		return Ave.listado;
	}
	public void setListado(Ave[] listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
	public int cantidadAves() {
		return getListado().length;
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		new Mamifero();
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		setColorPlumas("cafe glorioso");
		setHabitat("montanas");
		Ave.halcones ++;
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		new Mamifero();
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		setColorPlumas("blanco y amarillo");
		setHabitat("montanas");
		Ave.aguilas ++;
	}
	
	public static void main(String[] args) {
		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		System.out.println(Animal.totalPorTipo());
	}
}
