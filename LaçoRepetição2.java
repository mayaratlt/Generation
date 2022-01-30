package Familia44;

import java.util.Scanner;

public class LaçoRepetição2 {

   public static void main(String[] args) {
		
	  int idade = 0, pessoasMenor21=0, pessoasMaior50=0;
		try (Scanner ler = new Scanner(System.in)) {
			while(idade !=  -99) {
				System.out.println("Entre com a idade da pessoa:");
			   idade = ler.nextInt();
				if(idade<21) {
					pessoasMenor21++;
					}else if(idade>50) {
			}

}
		}
		
		System.out.println("O total de pessoas menores de 21 é "+pessoasMenor21
   		  + " e as pessoas maiores de 50 é" + pessoasMaior50);
}



}
	