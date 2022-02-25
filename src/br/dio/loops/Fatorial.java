package br.dio.loops;

import java.util.Scanner;
import java.lang.*;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int fatorial = 1;
		
		System.out.println("Fatorial de qual número?");
		numero = scan.nextInt();
				
		for (int i = numero; i >= 1 ; i--) {
			fatorial = fatorial * i;
		}
		System.out.printf(numero + "! = " + fatorial);
		
	}

}
