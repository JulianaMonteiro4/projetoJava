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

	}

}
