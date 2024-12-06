package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicioHeatSet {

	public static void main(String[] args) {
		
		int i;
		
		Scanner leia = new Scanner(System.in);
		Set<Double> numeros = new HashSet<Double>();

		//numeros.sort(null);
		for (i = 0; i <10; i ++) {
        	System.out.println("Digite o " + (i+1) + "º número: ");
        	Double numero = leia.nextDouble();
        	
        	numeros.add(numero);
        }
		
		Iterator<Double> numeros2 = numeros.iterator();
		
		System.out.println("Lista de dados do Set:");
		while (numeros2.hasNext()) {
			System.out.println(numeros2.next());
		}
	}

}
