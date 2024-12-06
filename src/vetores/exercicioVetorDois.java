package vetores;

import java.util.Scanner;

public class exercicioVetorDois {

	public static void main(String[] args) {

		int lista[] = new int[10];
		int i, numero;
		
		Scanner leia = new Scanner(System.in);
		
		for (i = 0; i <10; i ++) {
		 System.out.println("Digite 10 números: ");
            lista[i] = leia.nextInt();
		}
		
		System.out.println("Digite um número que você deseja encontrar: ");
        numero = leia.nextInt();
        
        System.out.println("O número " + numero + " esta localizado na posição: " + lista[numero]);
	}

}
