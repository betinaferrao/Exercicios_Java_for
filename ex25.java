package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex25 {
	public static void main(String[] args) {
		double notas = 0;
		double media = 0;
		int alunos = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos alunos? "));
		for(int i=1; i<=alunos; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "° aluno: ");
			double provas = Double.parseDouble(JOptionPane.showInputDialog("Quantas provas o aluno " + i + " fez? "));
			for(int j=1; j<=provas; j++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da prova " + j + " do " + i + " aluno?"));
				notas += nota;
			}
			media = notas/provas;
			JOptionPane.showMessageDialog(null, "Média do aluno " + nome + ": " + media);
			notas = 0;
		}
	}
}



/*
 * Faça um algoritmo para ler o nome de (N) alunos. Considere que cada aluno fez
 * uma quantidade (X) de provas, onde cada aluno poderá ter feito um número
 * diferente de provas, isto é, o valor (X) pode ser diferente entre os alunos.
 * Mostre para cada aluno a sua média.
 */
