package exercicios;

import java.util.Scanner;

public class exercicioQuatro {
	public static void main(String[] args){
		
		float n1;
		float n2;
		float n3;
		float n4;
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o valor número um: ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o valor número dois: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o valor número tres: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o valor número quatro: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);

		System.out.println("A diferença entre os valores são: " + diferenca);
	}

}
