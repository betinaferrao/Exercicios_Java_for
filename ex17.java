package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex17 {
	public static void main(String[] args) {
		int qntd = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos n�meros?"));
		double menor = 0;

		for (int i = 1; i <= qntd; i++) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + i + "� n�mero real: "));
			if (i == 1) {
				menor = n;
			}
			else if (n < menor) {
				menor = n;
			}
		}

		JOptionPane.showMessageDialog(null, "O menor n�mero entre eles � " + menor);
	}
}

/*
 * Fa�a um algoritmo para ler uma s�rie de N n�meros do tipo REAL. Ap�s a
 * leitura, mostre na tela o menor dentre todos os n�meros. Considere que o
 * usu�rio poder� digitar qualquer n�mero, positivos, negativos e zero.
 */