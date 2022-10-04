package br.com.guilherme.cursojava.exercicio17.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int id = sc.nextInt();
			a.add(id);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int id = sc.nextInt();
			b.add(id);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int id = sc.nextInt();
			c.add(id);
		}
		
		Set<Integer> totalAluno = new HashSet<>(a);
		totalAluno.addAll(b);
		totalAluno.addAll(c);
		
		System.out.println("Total Students: " + totalAluno.size());
		
		sc.close();
	}

}
