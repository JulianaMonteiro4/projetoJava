package estruturaDecisao;

import java.util.Scanner;

public class exercicioUm {

	public static void main(String[] args) {
		
		int valorA;
		int valorB;
		int valorC;
		int soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da letra A: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite o valor da letra B: ");
		valorB = leia.nextInt();
		
		System.out.println("Digite o valor da letra C: ");
		valorC = leia.nextInt();
		
		soma = valorA + valorB;
		
		if (soma > valorC ) {
			System.out.println("A soma do valor: " + valorA + " + " + valorB + " = " + soma + " é maior do que " + valorC);
		}else if (soma < valorC) {
			System.out.println("A soma do valor: " + valorA + " + " + valorB + " = " + soma + " é menor do que " + valorC);
		}else {
			System.out.println("A soma do valor: " + valorA + " + " + valorB + " = " + soma + " é igual a " + valorC);
		}
	}
}