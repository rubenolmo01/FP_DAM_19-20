package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		
        System.out.println("Dime dos números. ");
		numero1=teclado.nextInt();
		numero2=teclado.nextInt();
	
		if (numero2!=0)
		{
			System.out.println(numero1/numero2);
		}
		else
		{
			System.out.println("Error ");
		}
		
		teclado.close();
		ejemplo();

	}
	
	public static void ejemplo() {}

}
