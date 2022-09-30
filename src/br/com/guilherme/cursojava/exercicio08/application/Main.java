package br.com.guilherme.cursojava.exercicio08.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.guilherme.cursojava.exercicio08.entities.Company;
import br.com.guilherme.cursojava.exercicio08.entities.Individual;
import br.com.guilherme.cursojava.exercicio08.entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			Double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		double totalTaxes = 0;
		System.out.println("TAXES PAID:");
		for (TaxPayer p : list) {
			totalTaxes += p.tax();
			System.out.println(p);
		}
		System.out.println();
		System.out.println("TOTAL TAXES: "+ String.format("%.2f", totalTaxes));
		
		sc.close();
	}

}
