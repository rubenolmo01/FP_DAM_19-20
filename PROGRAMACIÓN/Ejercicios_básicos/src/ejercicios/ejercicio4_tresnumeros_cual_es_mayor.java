package ejercicios;
import java.util.Scanner;

public class ejercicio4_tresnumeros_cual_es_mayor 
{

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
			
			if ((numero1>numero2)&& (numero1>numero3)) 
			{
				System.out.println("El primer número es el mayor");
			}
				else 
				{
					if ((numero2>numero1)&& (numero2>numero3)) 
					{
					System.out.println("El segundo número es el mayor");
					}
					else 
					{
						if ((numero1==numero2)&& (numero2==numero3)) 
						{
							System.out.println("Los tres números son iguales");	
						}
						else
						{
							System.out.println("El tercer número es el mayor");
						}
					}
					
			    }
			teclado.close();
			}   
}



