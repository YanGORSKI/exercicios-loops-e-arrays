package br.dio.loops;

import java.util.Scanner;

public class Pares_e_Impares {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtdNumeros;
		int cont = 0;
		int numero;
		int pares = 0;
		int impares = 0;
		
		System.out.println("Quantos números: ");
		qtdNumeros = scan.nextInt();
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			if ((numero%2) == 0) pares++;
			else impares++;
			cont++;
			
			
		} while (cont < qtdNumeros);
		
		System.out.println("Você inseriu " + pares + " número(s) par(es)\n");
		System.out.println("e " + impares + " número(s) impar(es)\n");
		
	}

}
