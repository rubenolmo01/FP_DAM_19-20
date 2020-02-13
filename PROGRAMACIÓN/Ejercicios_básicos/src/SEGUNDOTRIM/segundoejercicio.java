package SEGUNDOTRIM;

import java.util.Scanner;

public class segundoejercicio {

	public static void main(String[] args) 
	{
		System.out.println("");
		
		Scanner teclado = new Scanner (System.in);
		
		int a;
		
		int [] tabla = new int [100];
		for (a=0;a<=99;a++)
		{
			tabla[a]=a;
			
			System.out.println(tabla[a]);
		}
		System.out.println("PAUSE");
		
		
		
		teclado.close();

	}

}
