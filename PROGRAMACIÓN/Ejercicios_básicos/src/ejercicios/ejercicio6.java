package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1;
		
        System.out.println("Dime un número. ");
		
		System.out.println();//esto solo sirve para dar un espacio y que quede mas bonito
		
		System.out.println("Dime el primer número: ");
		numero1=teclado.nextInt();
		
		if (numero1<=0)
		{
			System.out.println("Error ");
		}
		else 
		{
			System.out.println("El cuadrado del numero es:  "+numero1*numero1);
			System.out.println("La raíz del numero es:  "+(int) Math.sqrt(numero1));
		}
		
		teclado.close();
	}

}
