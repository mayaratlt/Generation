package PrimeiroCodigoJava;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void mais(String[] args) {
		
		
		int dia,mes,ano,totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("H� quantos dias voc� nasceu?");
		totalDias = leia.nextInt();
		
		ano = totalDias / 365;
		mes = (totalDias % 365) / 30;
	}

}
