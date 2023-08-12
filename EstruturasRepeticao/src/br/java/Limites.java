/**
 * @author Luga21
 * Implementação de um programa que recebe como entrada somente números inteiros positivos e
 * imprime apenas os que estão no intervalo de 5 a 15. O Programa termina quando
 * for digitado o valor 0.
 */

package br.java;
import java.util.Scanner;
public class Limites {

	int valor = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true){
            System.out.print("Informe um número a ser adicionado: ");
            int valor = sc.nextInt();
            if(valor >= 5 && valor <= 15) {
            	System.out.println("Valor válido");
            }
            else if (valor == 0) {
            	System.out.println("Encerrando programa...");
            	break;
            }
            else {
            	System.out.println("Valor inválido");
            }
		}
	}
}
