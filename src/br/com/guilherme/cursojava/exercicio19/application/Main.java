package br.com.guilherme.cursojava.exercicio19.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.guilherme.cursojava.exercicio19.entities.Product;

public class Main {

	public static void main(String[] args) {
		
		String path = "c:\\exercicios\\in.txt";
		List<Product> products = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();			
			while(line != null) {
				String[] fields = line.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Double avg = products.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x +y) / products.size();
			
			System.out.println("Averege price: " + String.format("%.2f", avg));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = products.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
