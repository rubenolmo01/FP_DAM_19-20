package utils;

import java.util.Scanner;

public class bateria7 {

	public static void main(String[] args) {
		System.out.println("Realiza un programa que calcule la sucesión de Fibonacci. El programa debera permitrinos calcular N términos dados de la sucesión");
		Scanner teclado = new Scanner (System.in);
		System.out.println("n");
		int n = teclado.nextInt();
		
		while (n<=0) {
			System.out.println("Pon una válida");
			n = teclado.nextInt();
		}
		
		if(n==1){
			System.out.println("a1=1");
		}
		
		else if(n==2){
			System.out.println("a1=1, a2=1");
		}
		
		else {
			System.out.println("a1=1");
			int numactual = 1;
			int numanterior = 2;
			int numsiguiente = 2;
			
			for(int i=2; i<=n ; i++) {
				System.out.println("a" + i + "=" + numactual);
				numanterior = numactual;
				numactual = numsiguiente;
				numsiguiente = numactual + numanterior;
			}
		}
	
		teclado.close();

	}

}
