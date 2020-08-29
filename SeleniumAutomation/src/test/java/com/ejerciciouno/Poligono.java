package com.ejerciciouno;

//Polimorfismo
public abstract class Poligono {
	private int numLados;
	
	//Constructor by default
	public Poligono() {
		
	}
	//Constructor para saber cuatos lados va a tener nuestro poligono
	public Poligono(int numLados) {
		this.numLados = numLados;
	}
	
	//Encapsular los setters & getters
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	
	public int getNumlLados(){
		return numLados;
	}
	
	//numero Lados
	@Override
	public String toString() {
		return "Numero de lados:" + numLados;
	}
	
	//Medodo de abstraccion
	public abstract double area();
	public abstract double perimetro();
}
