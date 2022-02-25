package br.dio.loops;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Tabuada de qual número?");
		numero = scan.nextInt();
		System.out.println("Tabuada do " + numero + "\n");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " + " + i + "\t = " + (numero*i));
		}
	}

}
