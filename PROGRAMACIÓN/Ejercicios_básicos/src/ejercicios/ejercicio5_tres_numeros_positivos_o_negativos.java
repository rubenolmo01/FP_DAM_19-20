package ejercicios;

import java.util.Scanner;

public class ejercicio5_tres_numeros_positivos_o_negativos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Dime tres números: ");
		
		System.out.println();//esto solo sirve para dar un espacio y que quede mas bonito
		
		System.out.println("Dime el primer número: ");
		numero1=teclado.nextInt();
		
		System.out.println("Dime el segundo número: ");
		numero2=teclado.nextInt();
		
		System.out.println("Dime el tercer número: ");
		numero3=teclado.nextInt();
		
		if (numero1<0) 
		{
			System.out.println("Como el primer número es negativo, el resultado es: "+numero1*numero2*numero3);
		}
		else 
		{
			System.out.println("Como el primer número es positivo, el resultado es: "+(numero1+numero2+numero3));
		}
		teclado.close();
	}

}
