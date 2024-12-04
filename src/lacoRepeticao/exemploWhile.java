package lacoRepeticao;

import java.util.Scanner;

public class exemploWhile {

	public static void main(String[] args) {
		
		int idade=1, menores=0, maiores=0;
        
        Scanner leia = new Scanner(System.in);
            
        while (idade >0) {
        	System.out.println("Digite uma idade e para finalizar, digite um número NEGATIVO: ");
            idade = leia.nextInt();
            
            if (idade <=21 && idade >0 ) {
	        	menores++;
			}else if(idade >=50 ){
				maiores++;
			}
        }
        System.out.println("Total de pessoas menores de 21 anos: " + menores);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores);
	}
}
