package zooAnimales;


public class Mamifero extends Animal {
	static private Mamifero listado[] = new Mamifero[100];
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	static int aux = 0;
	
	public Mamifero() {
		listado[aux] = this;
		aux++;
	}

	public Mamifero(String nombre, int edad, String habitat, String genero,
			boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado[aux] = this;
		aux++;
	}

	static public Mamifero[] getListado() {
		return Mamifero.listado;
	}
	public void setListado(Mamifero[] listado) {
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
		return getListado().length;
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
