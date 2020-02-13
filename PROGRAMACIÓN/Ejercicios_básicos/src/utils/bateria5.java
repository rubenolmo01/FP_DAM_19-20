package utils;

import java.util.Scanner;

public class bateria5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Qué opción desea?");
		System.out.println("Opciones:\n \tl Galones a litros \n\t2 Pies a pulgadas, Yardas, cm y metros \n\t3 Litros a galones");
		int opcion = teclado.nextInt();
		
		while (opcion<1 || opcion>3) {
			System.out.println("Seleccione ina opción válida");
			opcion = teclado.nextInt();
		}
		
		switch (opcion)
		{
		
		case 1:
			System.out.println("Dime los galones");
			double galones = teclado.nextDouble();
			double litros = galones * 3.7854;
			System.out.println(galones + " galones son: " + litros + " litros");
		
		case 2:
		
			System.out.println("Dime los pies");
			double pies = teclado.nextDouble();
			double pulgadas = pies * 12;
			double cm = pulgadas * 2.54;
			double metros = cm /100;
			double yardas = metros * 0.94;
			
			System.out.println(pies + " pies son: " + pulgadas + " pulgadas, " + yardas + " yardas, " + cm + "cm" + metros +"metros");
		
		case 3:
			
			for(int i=1 ; i<=100 ; i++) 
			{
				double litross = 0;
				litross = i * 3.7854;
				
				if(i%10==0) {
					System.out.println(i + " litross son: " + litross + " galones");
					System.out.println("");
				}
				else {
					System.out.println(i + " litross son: " + litross + " galones");
				}
				
				
			}
			break;
			
		}

		teclado.close();
	}

}
