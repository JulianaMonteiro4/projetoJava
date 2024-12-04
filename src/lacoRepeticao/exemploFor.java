package lacoRepeticao;

import java.util.Scanner;

public class exemploFor {

	public static void main(String[] args) {
		
		int contador, numero, par=0, impar=0;
		
        Scanner leia = new Scanner(System.in);
        
        for (contador = 1; contador <=10; contador ++) {
        	System.out.println("Digite o " + contador + "º número: ");
            numero = leia.nextInt();
         
	        if (numero % 2 == 0 ) {
	        	par++;
			}else {
				impar++;
			}
        }
        
        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar );

	}
}