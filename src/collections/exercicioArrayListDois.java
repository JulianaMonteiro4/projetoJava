package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicioArrayListDois {

	public static void main(String[] args) {
		int i;

		Scanner leia = new Scanner(System.in);
		Set<Double> numeros = new HashSet<Double>();

		// numeros.sort(null);
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			Double numero = leia.nextDouble();

			numeros.add(numero);
		}

	}

}
