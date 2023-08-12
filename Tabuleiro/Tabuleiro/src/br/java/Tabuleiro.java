package br.java;
import java.util.Scanner;
import java.util.Random;
public class Tabuleiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número de linhas: ");
        int n = sc.nextInt();
        System.out.print("Informe o número de colunas: ");
        int m = sc.nextInt();
        sc.nextLine();
        
        String[][] tabuleiro = new String[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tabuleiro[i][j] = " ";
            }
        }
        
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a letra a ser adicionada: ");
            String letra = sc.next();
            int linha = random.nextInt(n);
            int coluna = random.nextInt(m);
            tabuleiro[linha][coluna] = letra;
        }
          
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tabuleiro[i][j] + "-");
            }
            System.out.println();
        }
	sc.close();
	}
}