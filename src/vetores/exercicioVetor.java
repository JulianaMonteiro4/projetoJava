package vetores;

import java.util.Scanner;

public class exercicioVetor {

	public static void main(String[] args) {
		
		int numero[] = new int[10];
		int i, soma=0, media=0;
		
		 Scanner leia = new Scanner(System.in);
		 
		 for (i = 0; i <10; i ++) {
	        	System.out.println("Digite o " + (i+1) + "º número: ");
	            numero[i] = leia.nextInt();
	     }
		 System.out.println("--------");
		 
		 for (i = 0; i <10; i ++) {
			 if (numero[i] % 2 == 0 ) {
		        	System.out.println("Número par: " + numero[i]);
				}
	     }
		 System.out.println("--------");
		 
		 for (i = 0; i <10; i ++) {
			 if (numero[i] % 2 == 1 ) {
		        	System.out.println("Número ímpar: " + numero[i]);
				}
	     }
		 System.out.println("--------");
	     
	     for (i = 0; i <10; i ++) {
		        soma += numero[i];
		        media = soma/10;
	     }
	     System.out.println("Soma dos números: " + soma);
	     System.out.println("Média dos números: " + media);
	}

}
