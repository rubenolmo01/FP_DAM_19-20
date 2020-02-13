package utils;

import java.util.Scanner;

public class utils {

	public static void main(String[] args) {
		System.out.println("Ejercicio 5) Crea un programa que permita al usuario adivinar un número del 1 al 100 (generado al azar) en un máximo de 6 intentos. En intento, deberá avisar si se ha pasado o se ha quedado corto.");
		
		Scanner teclado = new Scanner (System.in);
		int intentos=6;
		int numero=((int)(Math.random()*100)+1);
		
		System.out.println("Comienza el juego!!");

		System.out.println("Dime un número del 1 al 100");
		int num=teclado.nextInt();
		
		while (num<1 || num>100) {
			System.out.println("Ponga un número válido");
			num=teclado.nextInt();
			}
		
		while(num!=numero && intentos>1)
		{
			if (num<numero) 
			{
				System.out.println("Un numero mayor");
				
			}
			else
			{
				System.out.println("Un numero menor");
			}
			intentos=intentos-1;
			System.out.println("Le quedan " +intentos+ " intentos");
			num=teclado.nextInt();
		}
		
		if(num==numero)
		{
			System.out.println("GANASTE!!!");
		}
		
		else
		{
			System.out.println("El número era... "+numero+"...vuelva a intentarlo");
		}		
		teclado.close();
	}

}
