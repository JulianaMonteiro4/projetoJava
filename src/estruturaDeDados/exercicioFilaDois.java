package estruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class exercicioFilaDois {

	public static void main(String[] args) {
		String livro;
		int opcao = 1;

		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();

		while (opcao != 0) {
			System.out.println("\n--------MENU--------");
			System.out.println("1- Adicionar livro na pilha");
			System.out.println("2- Listar todos os livros");
			System.out.println("3- Retirar o livro da pilha");
			System.out.println("0- Sair");
			System.out.println("--------------------");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite um livro: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("livro adicionado na pilha: " + pilha);
				break;
			case 2:
				Iterator<String> livro2 = pilha.iterator();
				
				System.out.println("Clientes na fila: ");
				while (livro2.hasNext()) {
					System.out.println(livro2.next());
				}
				break;
			case 3:
				System.out.println("Cliente: " + pilha.pop() + " foi removido");

				if(pilha.isEmpty()) {
					System.out.println("Sua fila esta vazia");
				}
				break;
			case 0:
				System.out.println("Você saiu");
				break;
			}
		}
	}
}
