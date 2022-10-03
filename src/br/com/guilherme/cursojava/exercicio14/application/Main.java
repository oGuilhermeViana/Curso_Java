package br.com.guilherme.cursojava.exercicio14.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.guilherme.cursojava.exercicio14.entities.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\exercicios\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			for (Employee s : list) {
				System.out.println(s.getName() + ", " + String.format("%.2f", s.getSalary()));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
