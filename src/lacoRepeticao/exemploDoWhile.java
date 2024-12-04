package lacoRepeticao;

import java.util.Scanner;

public class exemploDoWhile {

	public static void main(String[] args) {
		
		int num, resultado=0;
		
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("Digite um número e para finalizar, digite 0: ");
            num = leia.nextInt();
            
            if (num > 0) {
            	resultado = num + resultado;
            }

        } while (num != 0 );
        System.out.println("\nA soma dos números positivos é: " + resultado );
	}
}
