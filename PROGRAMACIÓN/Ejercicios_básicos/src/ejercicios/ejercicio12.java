package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1;
		
        System.out.println("Dime el número. ");
		numero1=teclado.nextInt();
	
		if (numero1==0)
		{
			System.out.println("El numero " +numero1 +" no es ni par ni impar.");
		}
		else
		{
			if(numero1%2==0)
			{
				System.out.println("El numero " +numero1 +" es par. ");
			}
			else
			{
				System.out.println("El numero " +numero1 +" es impar.");
			}
		}
		
		teclado.close();

	}

}
