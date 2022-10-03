package br.com.guilherme.cursojava.exercicio13.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.guilherme.cursojava.exercicio13.Services.ContractService;
import br.com.guilherme.cursojava.exercicio13.Services.PaypalService;
import br.com.guilherme.cursojava.exercicio13.entities.Contract;
import br.com.guilherme.cursojava.exercicio13.entities.Installment;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Enter number os installments: ");
		int N = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		ContractService cs = new ContractService(new PaypalService());
		
		cs.processContract(contract, N);
		
		System.out.println();
		System.out.println("INSTALLMENT:");
		for(Installment it : contract.getInstallments()) {
			System.out.println(it);
		}
		
		sc.close();
	}
	
	

}
