package zooAnimales;


public class Pez extends Animal {
	static private Pez[] listado = new Pez[100];
	static public int salmones;
	static public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	static int aux = 0;
	
	public Pez() {
		listado[aux] = this;
		aux++;
	}

	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas,
			int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado[aux] = this;
		aux++;
	}

	public static Pez[] getListado() {
		return Pez.listado;
	}
	public void setListado(Pez[] listado) {
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
		return getListado().length;
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
