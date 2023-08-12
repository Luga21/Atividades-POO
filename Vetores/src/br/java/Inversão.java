/**
 * @author Luga21
 * Elaboração de um programa que:
 * a.	Declara um vetor de inteiros de 10 posições 
 * b.	Preenche o vetor
 * c.	Imprime os valores do vetor de maneira invertida, do último elemento pra primeiro;
 * d.	Mostra o maior e o menor valor do vetor
 */

package br.java;

public class Inversão {

	public static void main(String[] args) {
		int[] vetor = {31, 25, 30, 32, 34, 40, 45, 47, 48, 44};
		System.out.print("Valores invertidos: ");
		for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print("[" + vetor[i] + "]");
		}
		
		int maiorElemento = vetor[0];
		int menorElemento = vetor[0];
		
		for (int i = vetor.length - 1; i >= 0; i--) {
            if(vetor[i] > maiorElemento) {
            	maiorElemento = vetor[i];
            }
            if(vetor[i] < menorElemento) {
            	menorElemento = vetor[i];
            }
		} System.out.println("\nO maior elemento é " + maiorElemento);
		System.out.println("O menor elemento é " + menorElemento);
	}
}
