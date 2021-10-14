package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex17 {
	public static void main(String[] args) {
		int qntd = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos números?"));
		double menor = 0;

		for (int i = 1; i <= qntd; i++) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + i + "° número real: "));
			if (i == 1) {
				menor = n;
			}
			else if (n < menor) {
				menor = n;
			}
		}

		JOptionPane.showMessageDialog(null, "O menor número entre eles é " + menor);
	}
}

/*
 * Faça um algoritmo para ler uma série de N números do tipo REAL. Após a
 * leitura, mostre na tela o menor dentre todos os números. Considere que o
 * usuário poderá digitar qualquer número, positivos, negativos e zero.
 */