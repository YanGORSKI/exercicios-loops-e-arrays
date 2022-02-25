package br.dio.arrays;

public class OrdemInversa {

	public static void main(String[] args) {
		int[] vetor = {4, 7, 9, 10, 5, 12};
		
		System.out.println("Vetor : ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
				
		System.out.println("roteV : ");
		for (int i = vetor.length-1; i >= 0; i--) {
			System.out.println(vetor[i] + " ");
	}

}
}