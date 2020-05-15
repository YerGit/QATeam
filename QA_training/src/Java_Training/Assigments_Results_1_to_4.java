package Java_Training;

import java.util.Scanner;

public class Assigments_Results_1_to_4 {

	public static void main(String[] args) {
		// Print funct # 1 
		System.out.println("Hola Mundo desde Java");
		
		// Book details # 2 
		Scanner scan = new Scanner(System.in);
       
        System.out.println("Proporciona el titulo:");
        String titulo = scan.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scan.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
        
        // Book store # 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el simbolo:");
        char simbolo = scanner.nextLine().charAt(0);
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
        
        // Bigger number - #4
        Scanner scann = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scann.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scann.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2);
	}

}
