package br.com.guilherme.cursojava.exercicio07.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.guilherme.cursojava.exercicio07.entities.ImportedProduct;
import br.com.guilherme.cursojava.exercicio07.entities.Product;
import br.com.guilherme.cursojava.exercicio07.entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of product: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			Product product;
			if(type == 'c') {
				product = new Product(name, price);
			}else if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				product = new UsedProduct(name, price, manufactureDate);
			}else {
				System.out.print("Customs fee: ");
				Double customFee = sc.nextDouble();
				
				product = new ImportedProduct(name, price, customFee);
			}
			products.add(product);
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product c : products) {
			System.out.println(c.priceTag());
		}
		
		sc.close();
		
	}

}
