package com.ejerciciouno;

public class Triangulo extends Poligono {
	private double lado1, lado2, lado3, lado4;
	private double base, altura;

	// Cosntructor by default
	public Triangulo() {

	}

	// Constructor Perimetro
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;

	}

	public Triangulo(double base, double altura) {
		super(3);
		this.base = base;
		this.altura = altura;
	}

	// Encapsulacion
	public void setlado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getlado1() {
		return lado1;
	}

	// Encapsulacion
	public void setlado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getlado2() {
		return lado2;
	}

	// Encapsulacion
	public void setlado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getlado3() {
		return lado3;
	}
	
	//Methods
	@Override
	public String toString() {
		String message = "Triangulo " + super.toString() + 
				"\nLado 1= "+lado1+" Lado 2= "+lado2+" Lado 3= "+lado3;
		return message;
	}
	@Override
	public double area() {
		return (base * altura)/2;
	}
	
	@Override
	public double perimetro() {
		return lado1+lado2+lado3;
	}
}
