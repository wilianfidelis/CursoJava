package aplication;

import java.util.ArrayList;
import java.util.List;



public class Exemplo {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add(" ");
		list.add("Wilian");
		list.add("Ana");
		list.add("Diego");
		list.add("Alfredo");
		list.add(2, "Marcos");
		list.add("Alfredo");
		
		
		System.out.println(list.size());
		list.remove(2);
		for (String x : list) {
			System.out.println(x);
		}
		/*----- Remover todos pela letra -*/
		System.out.println("--------------------------------");
		list.removeIf(x -> x.charAt(0) == 'A');
		for (String x : list) {
			System.out.println(x);
		}
		/*- Econtrar posi��o de um elemento -*/
		System.out.println("--------------------------------");
		System.out.println("Index of bob: "+ list.indexOf("Wilian"));
		
		
		
		
		
		
	}

}
