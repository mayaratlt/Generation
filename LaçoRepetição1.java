package Familia44;

import java.util.Scanner;

public class LaçoRepetição1 {

	public static void main(String[] args) {
		
		int n, impar=0, par=0;
		try (Scanner ler = new Scanner(System.in)) {
			for(int cont=0; cont<10; cont++) {
				
				n = ler.nextInt(); 
				if(n%2 == 0) {
					
				}else if (n%2 != 0) {
					impar++;
				}
				
				
			}
		}
		
         
		System.out.println("Tem " + par + "numeros pares e " + impar + "numerosimpares");
	}
	
	
}





