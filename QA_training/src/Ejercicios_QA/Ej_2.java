package Ejercicios_QA;

import java.util.Scanner;

public class Ej_2 {
	
	public static void main (String args[]) {
		
		String nombre = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor ingresar su nombre:");
		
		nombre = scan.nextLine();
		
		System.out.println("El nombre digitado es: " + nombre);
		
	}

}
