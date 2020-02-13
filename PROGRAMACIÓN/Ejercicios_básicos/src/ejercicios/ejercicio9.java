package ejercicios;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num=1;
		int contador=1;
		int cuadrado;
		
		
		while (num<10)
		{
			cuadrado=num*num;
			System.out.println("el cuadrado del numero " +num + " es " +cuadrado);
			num++;
			contador++;
		
		}
		
		teclado.close();

	}

}
