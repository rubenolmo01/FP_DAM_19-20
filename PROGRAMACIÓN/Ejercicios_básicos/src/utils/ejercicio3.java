package utils;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int i;
		System.out.println("Dame una cadena");
		
		i=teclado.nextInt();
		
		if (i<45)
		{
			System.out.println("es menor de 45");
		}
		else
		{
			System.out.println();
		}
		    
	
	
		teclado.close();


	}

}
