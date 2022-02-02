package Familia44;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
int[] vetor = new int [6];
		
		int par=0, impares=0;
		
		try (Scanner leia = new Scanner(System.in)) {
			for (int x = 0; x<=5; x++) {

			System.out.println("Escreva o valor da posição "+x+": ");
			vetor[x] = leia.nextInt();
			
			if (vetor[x] % 2 == 0) {
				
				par += vetor[x];
				}
			else {
				
				impares += 1;
				
			}
			
			}
		}
		
		
		
		
		System.out.println("\nOs números pares são: ");
		
		for (int y=0; y<=5; y++) {
			
			if (vetor[y] % 2 ==0) {
				
				System.out.print(vetor[y]);
					if ( y <4) {
					
					System.out.print(", ");
				
					}
			}	
		}
			
		System.out.println("\nOs números ímpares são: ");
		
		for (int z=0; z<=5; z++) {
			
			if (vetor[z] % 2 != 0) {
				
				System.out.print(vetor[z]);
				
				if ( z <4) {
					
					System.out.print(", ");
				}
				
			}
		}
		
		
		System.out.println("\nA soma dos números pares é de: " +par);
		System.out.println("A quantidade de números ímpares é de: " +impares);
		
		
		
		
		
		
		}
		
	
	}


