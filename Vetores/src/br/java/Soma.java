/**
 * @author Luga21
 * Elaboração de um programa que: 
 * a.	declara um vetor de inteiros de 10 posições, 
 * b.	Preenche o mesmo com valores entre 20 e 50. 
 * c.	Imprime o resultado da soma de todos os 10 valores preenchidos.
 */

package br.java;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		int[] vetor = {22, 25, 30, 32, 34, 40, 45, 47, 48, 49};
		int soma = 0;
		
		for(int i = 0; i< vetor.length; i++) {
			soma += vetor[i];
		}
		
		System.out.println("O resultado da soma é " + soma);
	}
}