package exercicios;

import java.util.Scanner;

public class exercicioTres {
	public static void main(String[] args){
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o valor do seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Insira o valor do seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Insira o valor da suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Insira o valor dos seus descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos ;
		
		System.out.println("O valor do seu salário líquido é de: " + salarioLiquido);
	}

}