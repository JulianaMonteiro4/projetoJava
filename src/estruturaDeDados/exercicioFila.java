package estruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicioFila {

	public static void main(String[] args) {

		String cliente;
		int opcao = 1;

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		while (opcao != 0) {
			System.out.println("\n--------MENU--------");
			System.out.println("1- Adicionar um cliente na fila");
			System.out.println("2- Listar todos os clientes");
			System.out.println("3- Retirar o cliente da fila");
			System.out.println("0- Sair");
			System.out.println("--------------------");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite um nome: ");
				cliente = leia.next();
				fila.add(cliente);
				System.out.println("Cliente adicionado na fila: " + fila);
				break;
			case 2:
				Iterator<String> clientes2 = fila.iterator();
				
				System.out.println("Clientes na fila: ");
				while (clientes2.hasNext()) {
					System.out.println(clientes2.next());
				}
				break;
			case 3:
				System.out.println("Cliente: " + fila.remove() + " foi removido");

				if(fila.isEmpty()) {
					System.out.println("Sua fila esta vazia");
				}
				break;
			case 0:
				System.out.println("Você saiu");
				break;
			}
		}

		/*
		 * for (int i = 0; i <= 10; i++) fila.add(i);
		 * 
		 * System.out.println("\nElementos na fila: " + fila);
		 * 
		 * System.out.println("\nRemover Elemento: " + fila.remove());
		 * 
		 * System.out.println("\nFila atualizada: " + fila);
		 * 
		 * System.out.println("\nAdicionar Elemento 11: " + fila.add(11));
		 * 
		 * System.out.println("\nExibir a Fila atualizada: " + fila);
		 * 
		 * System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());
		 * 
		 * System.out.println("\nExibir o Tamanho da fila: " + fila.size());
		 * 
		 * System.out.println("\nChecar se o Elemento 4 existe na fila? " +
		 * fila.contains(4));
		 * 
		 * System.out.println("\nExibe e Retira da fila o 1º Elemento (HEAD): " +
		 * fila.poll());
		 * 
		 * System.out.println("\nExibir todos os Elementos da fila por Iteração");
		 * 
		 * Iterator<Integer> iterator = fila.iterator();
		 * 
		 * while(iterator.hasNext()){ System.out.println(iterator.next()); }
		 * 
		 * System.out.println("\nLimpar a fila"); fila.clear();
		 * 
		 * System.out.println("\nA fila está vazia? " + fila.isEmpty());
		 */

	}

}
