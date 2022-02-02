package Aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.Companhia;
import Polimorfismo.Contribuinte;
import Polimorfismo.Individual;

public class Programa {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = null; new ArrayList<Contribuinte>();
		
		System.out.print("Digite o número de contribuintes");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.print("Contribuinte #" + i + "data:");
			System.out.print("Individual ou Companhia (i/c)?");
			char type = sc.next().charAt(0);
			System.out.print("Nome:");
			String name = sc.next();
			System.out.print("Rendimento anual:");	
			Double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Gasto com saúde:");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Número de empregados");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Companhia(name, anualIncome, numberOfEmployees));
				
			}
			
			System.out.println();
			System.out.println("Impostos pagos");
			for (Contribuinte tp : list) {
				System.out.println(tp.getName() + ": $ " + tp.getName());
			}
			
					
			
		}
        sc.close();
	}

	}
