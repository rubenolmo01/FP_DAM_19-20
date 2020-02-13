import java.util.Scanner;

public class bateria3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Año");
		int año=teclado.nextInt();
		if(año%4==0 && año%100!=0) {
			System.out.println("Es bisiesto");
		}
		else if (año%100==0 && año%400==0) {
			System.out.println("Es bisiesto");
		}
		else {
			System.out.println("No es bisesto");
		}
		
		teclado.close();

	}

}
