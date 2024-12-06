package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicioArrayList {

	public static void main(String[] args) {
		
		int i;
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		
		for (i = 0; i <5; i ++) {
			 System.out.println("Digite a " + (i + 1)  +"º cor: ");
	         String cor= leia.nextLine();
	         
	         cores.add(cor);
			}
		System.out.println("Lista de todas as cores:" + cores);
		
		System.out.println("Lista ordenada das cores:");
		cores.sort(null);
		for(String cor : cores) {
			System.out.println(cor);
			
		}
		
	}

}
