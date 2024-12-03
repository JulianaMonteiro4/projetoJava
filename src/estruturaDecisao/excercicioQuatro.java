package estruturaDecisao;

import java.util.Scanner;

public class excercicioQuatro {

	public static void main(String[] args) {
		
		int opcao;
		float num1;
		float num2;
		float operacao;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("#### CALCULADORA ####");
		System.out.println("Opção 1: SOMA");
		System.out.println("Opção 2: SUBTRAÇÃO");
		System.out.println("Opção 3: MULTIPLICAÇÃO");
		System.out.println("Opção 4: DIVISÃO");
		
		System.out.println("\nEscolha o operador:");
		opcao = leia.nextInt();
		System.out.println("Digite um número:");
		num1 = leia.nextFloat();
		System.out.println("Digite outro número:");
		num2 = leia.nextFloat();
		
		switch (opcao) {
		case 1:
			operacao = num1 + num2;
			System.out.println("O valor total: " + operacao);
			break;
		case 2:
			operacao = num1 - num2;
			System.out.println("O valor total: " + operacao);
			break;
		case 3:
			operacao = num1 * num2;
			System.out.println("O valor total: " + operacao);
			break;
		case 4:
			operacao = num1 / num2;
			System.out.println("O valor total: " + operacao);
			break;
		}
	}
}
