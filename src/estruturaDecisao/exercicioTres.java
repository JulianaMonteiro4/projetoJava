package estruturaDecisao;

import java.util.Scanner;

public class exercicioTres {

	public static void main(String[] args) {
		
		int opcao;
		int quantidade;
		int valorTotal;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("#########   Menu   ###########");
		System.out.println("Opção 1: Hot Dog  - R$10,00");
		System.out.println("Opção 2: X-Salada - R$15,00");
		System.out.println("Opção 3: X-Bacon  - R$18,00");
		System.out.println("Opção 4: Bauru    - R$12,00");
		System.out.println("Opção 5: Refrigerante - R$8,00");
		System.out.println("Opção 6: Suco de Laranja - R$13,00");
		System.out.println("\nDigite um número e escolha uma opção:");
		opcao = leia.nextInt();
		System.out.println("Digite a quantidade:");
		quantidade = leia.nextInt();		
		
		switch (opcao) {
		case 1:
			valorTotal = quantidade * 10;
			System.out.println("O valor total: " + valorTotal);
			break;
		case 2:
			valorTotal = quantidade * 15;
			System.out.println("O valor total: " + valorTotal);
			break;
		case 3:
			valorTotal = quantidade * 18;
			System.out.println("O valor total: " + valorTotal);
			break;
		case 4:
			valorTotal = quantidade * 12;
			System.out.println("O valor total: " + valorTotal);
			break;
		case 5:
			valorTotal = quantidade * 8;
			System.out.println("O valor total: " + valorTotal);
			break;
		case 6:
			valorTotal = quantidade * 13;
			System.out.println("O valor total: " + valorTotal);
			break;
		}
	}

}
