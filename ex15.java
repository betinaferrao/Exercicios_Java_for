package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex15 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos alunos?"));
		for (int i = 1; i <= n; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "� aluno: ");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a m�dia do " + i + "� aluno: "));
			if (media >= 7.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + " est� aprovado(a)!");
			} else if (2.0 <= media && media < 7.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + " est� em recupera��o!");
			} else if (media < 2.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + " est� reprovado(a)!");
			}
		}
	}
}


/*
 * Fa�a um algoritmo onde o usu�rio dever� digitar o nome e a m�dia de N alunos.
 * Durante a leitura, verifique se o aluno foi �aprovado�, �reprovado�, ou em
 * �recupera��o�. Mostre na tela, uma mensagem apropriada, dependendo da
 * situa��o do aluno. Considere que as situa��es poss�veis para os alunos s�o:
 * Aprovado (m�dia >= 7.0); Recupera��o (2.0 <= m�dia < 7.0); Reprovado (m�dia <
 * 2.0).
 */

