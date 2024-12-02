package exercicios;

import java.util.Scanner;

public class exercicioUm {
	public static void main(String[] args){
		
		float salario;
		float abono;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o valor do seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Insira o valor do seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
				
		System.out.println("O valor do seu novo salário é de: " + novoSalario);
	}
	

}
