package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numeroniños;
		int numeroniñas;
		
        System.out.println("Dime un número. ");
		
		System.out.println();//esto solo sirve para dar un espacio y que quede mas bonito
		
		System.out.println("Dime el número de niños que hay. ");
		numeroniños=teclado.nextInt();
		
		System.out.println("Dime el número de niñas que hay. ");
		numeroniñas=teclado.nextInt();
		
		System.out.println("El porcentaje de niños en el colegio es de: "+numeroniños*100/(numeroniños+numeroniñas)+"%");
		
		System.out.println("El porcentaje de niñas en el colegio es de: "+numeroniñas*100/(numeroniños+numeroniñas)+"%");
		

		teclado.close();
	}

}
