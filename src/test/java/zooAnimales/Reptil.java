package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	static private List<Reptil> listado = new ArrayList<Reptil>();
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero,
			String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	public static List<Reptil> getListado() {
		return Reptil.listado;
	}
	public void setListado(List<Reptil> listado) {
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
		return getListado().size();
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Animal crearIguana(String nombre, int edad, String genero) {
		Animal x = new Reptil(nombre, edad, "humedal", genero,	"verde", 3);
		Reptil.iguanas ++;
		return x;
	}
	
	public static Animal crearSerpiente(String nombre, int edad, String genero) {
		Animal x = new Reptil(nombre, edad, "jungla", genero,	"blanco", 1);
		Reptil.serpientes ++;
		return x;
	}	
}
