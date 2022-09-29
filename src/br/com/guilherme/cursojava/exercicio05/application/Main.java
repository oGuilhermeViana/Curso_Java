package br.com.guilherme.cursojava.exercicio05.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.guilherme.cursojava.exercicio05.entities.Comment;
import br.com.guilherme.cursojava.exercicio05.entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post1 = new Post(sdf.parse("21/06/2022 13:05:44"),
				"Traveling to New Zeland", 
				"I'm going to visit this wonderful contry!", 
				12);
		
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome!"));
		
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
				"Good night guys", 
				"See you tomorrow", 
				5);
		
		post2.addComment(new Comment("Good Night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post1);
		System.out.println();
		System.out.println(post2);
	}

}
