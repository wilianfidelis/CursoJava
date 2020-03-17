package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 
				12);
		Comment c3 = new Comment("Have a nice trip!");
		Comment c4 = new Comment("Wow that's awesome!");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
				"See you tomorrow",
				"Good night", 
				5);
		
		p1.addComment(c1);
		p2.addComment(c2);
		p1.addComment(c3);
		p2.addComment(c4);
		
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		
		
		

		sc.close();

	}

}
