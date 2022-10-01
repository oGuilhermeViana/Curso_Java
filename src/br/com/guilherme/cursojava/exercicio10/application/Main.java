package br.com.guilherme.cursojava.exercicio10.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.guilherme.cursojava.exercicio10.entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String Holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double amount = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, Holder, amount, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		
		sc.close();
	}

}
