/**
 * @author Luga21
 * Implementação de um programa que usa a classe jogador declarada. 
 * a. Definindo valores para os atributos da classe por meio do construtor;
 * b. Mostrando os valores dos atributos definidos
 * c. Atualizando os valores dos atributos por meio dos métodos
 * d. Mostrando os valores dos atributos definidos
 */

package br.java;

public class TestaJogador {

	public static void main(String[] args) {
		Jogador jogador = new Jogador(100, 50);
		System.out.println("A vida do jogador é: " + jogador.getVida());
		System.out.println("A energia do jogador é: " + jogador.getEnergia());
		
		jogador.setVida(1);
		jogador.setEnergia(100);
		
		System.out.println("\nA vida redefinida do jogador é: " + jogador.getVida());
		System.out.println("A energia redefinida do jogador é: " + jogador.getEnergia());
	}
}
