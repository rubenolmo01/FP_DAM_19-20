package ejercicios;
import java.util.Scanner;


public class ejercicio_triangulos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int base1,altura1, base2, altura2, area1, area2;
		
		System.out.println("Dime la base del primer triangulo");
		base1=teclado.nextInt();
		
		System.out.println("Dime la altura del primer triangulo");
		altura1=teclado.nextInt();
		
		area1=(base1*altura1)/2;
		
		
		System.out.println("El área del primer triangulo es" + area1);
		
		//////////////////////////////////////////////////////////////
		
		System.out.println("Dime la base del segundo triangulo");
		base2=teclado.nextInt();
		
		System.out.println("Dime la altura del segundo triangulo");
		altura2=teclado.nextInt();
		
		area2=(base2*altura2)/2;
		
		
		System.out.println("El área del segundo triangulo es " + area2);
		
		
		
		if (area1>area2)
			System.out.println("El area del primer triangulo es mayor");
		else
			System.out.println("El area del segundo triangulo es mayor");
			
        teclado.close();
	}

}