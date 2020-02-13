package ejercicios;
import java.util.Scanner;


public class ejercicio_salario_trabajador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double horas;
		double tarifa;
		double salario;
		
		System.out.println("Dime la tarifa");
		tarifa=teclado.nextDouble();
		
		System.out.println("Cuantas horas ha trabajado?");
		horas=teclado.nextDouble();
		if(horas>40) {
			horas=horas-40; //le restamos las 40 horas que ha trabajado para saber las horas extra del trabajador
			salario=(horas*(tarifa*1.5))+40*tarifa;//horas extra + luego el salario normal de las 40 horas
		}
		else {
			salario=horas*tarifa;
		}
		System.out.println("El salario del trabajador es: " + salario +" €");
		teclado.close();
	}

}
