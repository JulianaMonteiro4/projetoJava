package lacoRepeticao;

import java.util.Scanner;

public class exercicioDoisFor {

	public static void main(String[] args) {
		
		int i, num1, num2, soma1=0, soma2=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		num2 = leia.nextInt();
		
		for(i=num1; i<=num2; i++) {
			if( num1 < num2 && num1 % 3 == 1) {
	              soma1++;
	          }else if ( num1  % 5 == 1) {
	              soma2++;
	          }
		}
	}

}
