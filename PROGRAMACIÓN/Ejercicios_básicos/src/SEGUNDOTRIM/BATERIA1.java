package SEGUNDOTRIM;

import java.util.Scanner;

public class BATERIA1 
{
	public static void main(String[] args) 
	{
		System.out.println("Rellene un array con los 100 primeros números enteros y los muestre en pantalla en orden ascendente.");
		
		Scanner teclado = new Scanner (System.in);
		
			int x;
			int[] tabla = new int [100];
			for (x=0;x<=99;x++)
			{
				tabla[x]=x;
				
				System.out.println(tabla[x]);
			}
			System.out.println("PAUSE");
	 		
        
			teclado.close();
  }
}






