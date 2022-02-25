package br.dio.loops;

import java.util.Scanner;

public class Maior_e_Media {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		int maior = 0;
		float media = 0;
		
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			media = media + numero;
			if (contador == 0) maior = numero;
			if (numero > maior) maior = numero;
			contador++;
		} while (contador < 5);
		
		System.out.println(media);
		media = media/5;
		System.out.println("O maior número é: " + maior + "!\n");
		System.out.printf("A média dos números é: " + "%.1f", media);
	
		
	}
}