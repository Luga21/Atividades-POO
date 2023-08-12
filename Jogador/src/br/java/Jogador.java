/**
 * @author Luga21
 * Declaração da Classe Jogador contendo:
 * Dois atributos privados inteiros identificados como vida e energia.
 * Inicialização de ambos atributos por meio do construtor.
 * Declaração dos métodos para definir e obter o valor de cada atributo.
 */

package br.java;

public class Jogador {

	private int vida, energia;
	
	public Jogador() {};
	
	public Jogador(int vidaInicial, int energiaInicial) {
		vida = vidaInicial;
		energia = energiaInicial;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
}
