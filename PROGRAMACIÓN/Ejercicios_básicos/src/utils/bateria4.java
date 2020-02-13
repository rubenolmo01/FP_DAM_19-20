package utils;

import java.util.Scanner;

public class bateria4 {

	public static void main(String[] args) {
		System.out.println("Programa que dado un dia, un mes y un año calcule cual es el dia siguiente. Tener en cuenta años bisiestos, que febrero tiene un dia más ");
        Scanner teclado = new Scanner (System.in);
		System.out.println();
		System.out.println("Dime el año");
		int año=teclado.nextInt();
		
		while (año<0){
			System.out.println("Pon un año válido");
			año=teclado.nextInt();
		}
		
		System.out.println("Dime el mes");
		int mes=teclado.nextInt();
		
		while (mes<0){
			System.out.println("Pon un mes válido");
			mes=teclado.nextInt();
		}
		
		System.out.println("Dime el día");
		int dia=teclado.nextInt();
		
		while (dia<0 || dia>=32){
			System.out.println("Pon un día válido");
			dia=teclado.nextInt();
		}
		
		while (mes==2 && (bisiesto(año)==true) && dia>=30){
			System.out.println("Pon un día válido");
			dia=teclado.nextInt();
		}
		
		while (mes==2 && (bisiesto(año)==false) && dia>=28){
			System.out.println("Pon un día válido");
			dia=teclado.nextInt();
		}
		
		while ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && dia>31){
			System.out.println("Pon un día válido");
			dia=teclado.nextInt();
		}
		
		while ((mes==4 || mes==6 || mes==9 || mes==11) && dia>30){
			System.out.println("Pon un día válido");
			dia=teclado.nextInt();
		}
		
		if((bisiesto(año)==true) && mes==2 && dia==28){
			System.out.println("29/2/"+año);
		}
		else if ((bisiesto(año)==true) && mes==2 && dia==29){
			System.out.println("1/3/"+año);
		}
		
		else {
			if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10)&& dia==31){
				System.out.println("La fecha seria: "+"1 / "+(mes+1)+ " / "+año);
			}
		else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)&& dia!=31) {
			System.out.println("La fecha seria: "+(dia+1)+ " / " +mes + " / " +año);
		}
		
		else if(mes==12 && dia==31) {
			System.out.println("La fecha seria: "+"1 / 1/ " +(año+1));
		}
			
		else if((mes==4 || mes==6 || mes==9 || mes==11) && dia==30) {
			System.out.println("La fecha seria: "+"1 / " +(mes+1) +" / " +año);
		}
			
		else if((mes==4 || mes==6 || mes==9 || mes==11) && dia!=30) {
			System.out.println("La fecha seria: "+(dia+1)+ " / " +mes + " / " +año);
		}
		
		else if(mes==2 && dia==28) {
			System.out.println("La fecha seria: "+"1 / 3 / " +año);
		}
		
		else if(mes==2 && dia<28) {
			System.out.println("La fecha seria: "+dia+1 + "/ 2 / " +año);
		}
		
	}	
		
	teclado.close();
		
	}
	
	static boolean bisiesto(int año) {
		if(año%4==0 && año%100!=0) {
			return true;
		}
		else if(año%100==0 && año%400==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
