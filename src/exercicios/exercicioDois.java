package exercicios;

import java.util.Scanner;

public class exercicioDois {
	
	public static void main(String[] args){
		
		float notaUm;
		float notaDois;
		float notaTres;
		float notaQuatro;
		float mediaNotas;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a nota número 1: ");
		notaUm = leia.nextFloat();
		
		System.out.println("Insira a nota número 2: ");
		notaDois = leia.nextFloat();

		System.out.println("Insira a nota número 3: ");
		notaTres = leia.nextFloat();
		
		System.out.println("Insira a nota número 4: ");
		notaQuatro = leia.nextFloat();
		
		mediaNotas = notaUm + notaDois + notaTres + notaQuatro / 4;
		
		System.out.println("A média total do aluno é: " + mediaNotas);
	}
}
