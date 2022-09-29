package br.com.guilherme.cursojava.exercicio01.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.guilherme.cursojava.exercicio01.entities.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		Integer number = sc.nextInt();
		System.out.print("Enter accont holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(holder, number, initialDeposit);
			
		}else {
			account = new Account(holder, number, 0.0);
		}
		
		System.out.println();
		System.out.println("Account date: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		
		System.out.println();
		System.out.println("Update account date: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		
		System.out.println();
		System.out.println("Update account date: ");
		System.out.println(account);
		System.out.println();
		
		sc.close();
		
	}

}
