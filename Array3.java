package Familia44;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		int[][] matriz = new int [3][3];
		int soma=0;
		
		try (Scanner leia = new Scanner(System.in)) {
			for (int x = 0 ; x<=2 ; x++) {
				for (int y = 0 ; y<=2 ; y++) {
					
					System.out.println("Escreva o valor da posição ["+x+"]["+y+"]: ");
					matriz[x][y] = leia.nextInt();
					
					
					if (matriz[x][y] > 10) {
						
						soma++;
					
					
				}			
						
					}
			}
		}
				
				
				
		System.out.println("Apareceram "+soma+" número(s) maior(es) que 10.");
			

	}



	}


