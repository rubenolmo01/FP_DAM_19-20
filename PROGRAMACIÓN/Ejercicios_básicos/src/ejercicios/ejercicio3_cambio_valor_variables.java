package ejercicios;
import java.util.Scanner;

public class ejercicio3_cambio_valor_variables {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double variableA;
		double variableB;
		double variableC;
		
		System.out.println("Cuanto valen las variables?");
				
		
		System.out.println("Dime el valor de A");
		variableA=teclado.nextDouble();
		
		
		System.out.println("Dime el valor de B");
		variableB=teclado.nextDouble();
		
		variableC=variableA;
		variableA=variableB;
		variableB=variableC;
		
		
		System.out.println("La variable A es " +variableA+ " y la variable B es " +variableB);
		variableC=teclado.nextDouble();
		
		teclado.close();

	}

}
