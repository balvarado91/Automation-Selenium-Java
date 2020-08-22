package com.javabasics;

public class ArrayStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      Arreglo unidimensional
//		String []nombres = new String[4];
//		
//		nombres[0] = "Brayan";
//		nombres[1] = "Jose";
//		nombres[2] = "Hola";
//		nombres[3] = "Hola1";
//		
//		System.out.println(nombres[3]);
		
//		Arreglos bidimensionales Matriz
//		{Ana}{Jr Tester}      - [0,0][0,1]
//		{Brayan}{Sr Tester}   - [1,0][1,1]
//		{Carlos}{Sr Tester}	  - [2,0][2,1]	
//		{Cristian}{Sr Tester} - [3,0][3,1]
				
		String [][]persona = new String[4][4];
		
		persona[0][0] = "Ana";
		persona[0][1] = "Jr Tester";
		persona[1][0] = "Brayan";
		persona[1][1] = "Sr Tester";
		persona[2][0] = "Carlos";
		persona[2][1] = "Sr Tester";
		persona[3][0] = "Cristian";
		persona[3][1] = "Sr Tester";
		
		System.out.println("El nombre es: "+persona[1][0]+" y su rol es: "+ persona[1][1]);
//   		
	}

}
