package zooAnimales;

public class Reptil extends Animal {
	static private Reptil[] listado = new Reptil[100];
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	static int aux = 0;
	
	public Reptil() {
		listado[aux] = this;
		aux++;
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero,
			String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado[aux] = this;
		aux++;
	}
	public static Reptil[] getListado() {
		return Reptil.listado;
	}
	public void setListado(Reptil[] listado) {
		Reptil.listado = listado;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	
	public int cantidadReptiles() {
		return getListado().length;
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
		new Mamifero();
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		setColorEscamas("verde");
		setLargoCola(3);
		setHabitat("humedal");
		Reptil.iguanas ++;
	}
	
	public void crearSerpiente(String nombre, int edad, String genero) {
		new Mamifero();
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		setColorEscamas("blanco");
		setLargoCola(1);
		setHabitat("jungla");
		Reptil.serpientes ++;
	}	
}