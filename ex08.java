package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex08 {
	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� valor"));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� valor"));
		int pot = 1;
		
		for(int i=1; i<=B; i++) {
			pot *= A;
		}
		JOptionPane.showMessageDialog(null, pot);
		
	}
}

//Fa�a um algoritmo que pe�a para o usu�rio digitar dois valores inteiros positivos, digamos A e B. Ap�s 
//calcule �A elevado ao expoente B�.

// 2 * 2 * 2