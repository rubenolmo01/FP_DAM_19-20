package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		
        System.out.println("Dime dos números. ");
		numero1=teclado.nextInt();
		numero2=teclado.nextInt();
	
		if ((numero1>=0) && (numero2>=0))
		{
			System.out.println("Los dos números son positivos");
		}
		else
		{
			if((numero1<0)&& (numero2<0))
			{
			System.out.println("Los dos numeros son negativos");
			}
			else
			{
				if ((numero1<0) || (numero2<0))
				{
				System.out.println("Uno de los números es negativo"); 
				}
			}
		}
		
		teclado.close();

	}

}









