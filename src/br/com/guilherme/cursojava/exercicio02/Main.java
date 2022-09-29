package br.com.guilherme.cursojava.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rend[] rends = new Rend[9];
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		for(int i = 0; i < rooms; i++) {
			System.out.println();
			System.out.println("Rend #" + (i+1));
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rends[room] = new Rend(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i < rends.length; i++) {
			if(rends[i] != null) {
				System.out.println(i + ": " + rends[i]);
			}
		}
		sc.close();
	}

}
