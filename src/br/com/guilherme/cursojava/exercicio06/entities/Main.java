package br.com.guilherme.cursojava.exercicio06.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.guilherme.cursojava.exercicio06.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		//data client
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (dd/MM/yyyy): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		//Status
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println();
		System.out.print("How many items to this order: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Enter #" + i + " item data");
			System.out.print("Product name: ");
			name = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(name, price);
			OrderItem item = new OrderItem(quantity, product);
			order.addItem(item);
		}

		System.out.println();
		System.out.println("ORDER SUMARY: ");
		System.out.println(order);
		
	}

}
