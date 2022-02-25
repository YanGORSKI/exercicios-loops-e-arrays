package br.dio.arrays;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] randomNumbers = new int[20];
		int media = 0;
		
		for(int i = 0; i < randomNumbers.length; i++) {
			int numero = random.nextInt(1,20);
			randomNumbers[i] = numero;
		}
		System.out.println("Numeros Aleatórios: ");
		for (int numero : randomNumbers) {
			System.out.println(numero + " ");
			media = media + numero;
		}
		media = media / randomNumbers.length;
		
		System.out.println("Média das rolagens: " + media);
			}

}
