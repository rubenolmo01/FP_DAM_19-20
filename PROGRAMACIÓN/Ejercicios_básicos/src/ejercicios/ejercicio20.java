package ejercicios;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num;
		int contador=0;
		
		
		
		while ((num>0) && (num<10))
		{
			cuadrado=num*num;
			System.out.println("el cuadrado del numero " +num + " es " +cuadrado);
			num++;
			contador++;
		
		}
		
		teclado.close();

	}

}
