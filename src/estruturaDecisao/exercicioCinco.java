package estruturaDecisao;

import java.util.Scanner;

public class exercicioCinco {

	public static void main(String[] args) {
		
		String nome, doou;
		int idade, apto=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Já doou sangue?: ");
		doou = leia.next();
		
		if(idade >17 && idade <60) {
			idade = apto;
		}else if(idade >=60 && idade <=69 && doou == "sim") {
			
		}
		System.out.println(nome + "está apto para doar sangue");
	}

}
