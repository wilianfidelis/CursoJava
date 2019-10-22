package aplication;

import java.util.Locale;
import java.util.Scanner;
import entites.nota;

public class ProgramNota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		nota nota = new nota();
		
		System.out.print("Digite o nome do aluno: ");
		nota.name = sc.nextLine();
				
		
			System.out.println("Digite a nota do Primeiro trimestre: ");
			nota.nota2 = sc.nextDouble();
			
		    System.out.println("Digite a nota do segundo trimestre: ");
		    nota.nota2 = sc.nextDouble();
		
		    System.out.println("Digite a nota do terceiro trimestre: ");
		    nota.nota3 = sc.nextDouble();
		    
		    System.out.printf("FINAL GRADE: %.2f%n", nota.FinalGrade());
		    
		    if (nota.FinalGrade() < 60.0) {
		    System.out.println("FAILED");
		    System.out.printf("MISSING %.2f POINTS%n", nota.Total());
		    }
		    else {
		    System.out.println("PASS");
		    }

		    sc.close();
	}

}
