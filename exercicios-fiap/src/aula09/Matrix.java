package aula09;

import java.util.Iterator;

public class Matrix {

	public static void main(String[] args) {
		
		char[][] tabuleiro = new char[3][3];
		
		tabuleiro[0][0] = 'X';
		tabuleiro[1][1] = 'O';
		tabuleiro[2][2] = 'X';
		
		System.out.println();
		
		int[][] matriz = new int[4][5];
		
		int linhas = matriz.length;
		System.out.println(linhas);
		
		int colunas = matriz[0].length;
		System.out.println(colunas);
		
		int numero = 1;
		
		
		for (int i = 0; i < linhas; i++) {
			
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println() ;
				
		}	
		

	}

}
