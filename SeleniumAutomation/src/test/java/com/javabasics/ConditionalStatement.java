package com.javabasics;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad = 80;
		int limite = 70;
		
//		if(velocidad > limite) {
//			System.out.println("Multa");
//		}
//		
//		if(velocidad > limite) {
//			System.out.println("Multa");
//		}else {
//			System.out.println("Su velocidad es adecuada");
//		}
//		
//		if anidados
//		boolean highway = false;
//		
//		if(highway == true) {
//			System.out.println("Vamos en carretera");
//			limite = 100;
//		if(velocidad > limite) {
//				System.out.println("Multa");
//		}else {
//				System.out.println("Su velocidad es adecuada");
//				}
//		}else if(velocidad > limite) {
//			System.out.println("Vamos en calle y su velocidad es inadecuada");
//		}else {
//			System.out.println("Vamos en calle y su velocidad es adecuada");
//		}
		
//SWITCH CASE		
		int temperatura = 29;
		
		switch(temperatura) {
		case 10:
			System.out.println("Frio");
			break;
		case 20:
			System.out.println("Agradable");
			break;
		case 30:
			System.out.println("Calor");
			break;
		case 40:
			System.out.println("Estamos en el descierto");
		default:
			System.out.println("Da igual");
			break;
		}


			
	}

}
