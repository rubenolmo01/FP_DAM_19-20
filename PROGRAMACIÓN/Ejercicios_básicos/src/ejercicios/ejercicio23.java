package ejercicios;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		int num1;
		System.out.println("Algoritmo que lea números enteros hasta teclear 0, y nos muestre el máximo, el mínimo y la\n" + "media de todos ellos. Piensa como debemos inicializar las variables.");

		System.out.println("Dame un número");
		num1=teclado.nextInt();
		int minimo=num1;
		int maximo=num1;
		int contador=1;     
		int suma=num1;
		int media=0;
		
		
		while(num1!=0)
		{
			if (num1>maximo)
			{
				maximo=num1;
			}
			
			if (num1<minimo)
			{
				minimo=num1;
			}
		
			suma=suma+num1;
			contador=contador++;
			num1=teclado.nextInt();
		}
		
		media=suma/contador;		
		teclado.close();
		System.out.println("El número máximo es: "+(maximo));
		System.out.println("El número mínimo es: "+(minimo));
		System.out.println("La media de los números es: "+(media));
	}

}
