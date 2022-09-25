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
