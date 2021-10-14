package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex15 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos alunos?"));
		for (int i = 1; i <= n; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "° aluno: ");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do " + i + "° aluno: "));
			if (media >= 7.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + " está aprovado(a)!");
			} else if (2.0 <= media && media < 7.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + " está em recuperação!");
			} else if (media < 2.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + " está reprovado(a)!");
			}
		}
	}
}


/*
 * Faça um algoritmo onde o usuário deverá digitar o nome e a média de N alunos.
 * Durante a leitura, verifique se o aluno foi “aprovado”, “reprovado”, ou em
 * “recuperação”. Mostre na tela, uma mensagem apropriada, dependendo da
 * situação do aluno. Considere que as situações possíveis para os alunos são:
 * Aprovado (média >= 7.0); Recuperação (2.0 <= média < 7.0); Reprovado (média <
 * 2.0).
 */

