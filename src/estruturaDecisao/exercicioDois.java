package estruturaDecisao;

import java.util.Scanner;

public class exercicioDois {

	public static void main(String[] args) {
		
		int valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		valor = leia.nextInt();
		
	
		if (valor % 2 == 0 && valor >0) {
			System.out.println("O número: " + valor + " é par e positivo");
		}else if (valor % 2 == 0 && valor <0) {
			System.out.println("O número: " + valor + " é par e negativo");
		}else if (valor % 2 == 1 && valor >0 ) {
			System.out.println("O número: " + valor + " é ímpar e positivo ");
		}else {
			System.out.println("O número: " + valor + " é ímpar e negativo");
		}
	}

}
