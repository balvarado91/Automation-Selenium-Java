package com.ejerciciouno;

public class Polimorfistmo {

	public static void main(String[] args) {
		// Objeto Poligono Abstraccion y polimorfisto, instanciamos 
		//la clase Poligono y abstraemos los objetos escenciales de la clase Rectangulo
		Poligono oPoligono = new Rectangulo(4,4,2,2);
		System.out.println(oPoligono.toString());
		double perimetro = oPoligono.perimetro();
		System.out.println("El perimetro de esta figura es: " + perimetro);
		
		oPoligono = new Rectangulo(2,2);
		double area = oPoligono.area();
		System.out.println("El area del Rectangulo es: "+area);
		
		System.out.println("===================================");
		
		oPoligono = new Triangulo(3,3,3);
		System.out.println(oPoligono.toString());
		double perimetro2 = oPoligono.perimetro();
		System.out.println("El perimetro de esta figura es: " + perimetro2);

		
		oPoligono = new Triangulo(5,2);
		double area2 = oPoligono.area();
		System.out.println("El area del Triangullo es: "+area2);
		
		//Ejericio - Generar un trapecio con sus lados, area y perimetro
	}

}
