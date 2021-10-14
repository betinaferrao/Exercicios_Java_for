package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex21 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos alunos?"));
		double menor = 0;
		String nomeMenor = "";

		for (int i = 1; i <= n; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "° aluno: ");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do " + i + "° aluno: "));

			if (i == 1) {
				menor = media;
				nomeMenor = nome;
			} else if (media < menor) {
				menor = media;
				nomeMenor = nome;
			}
		}

		JOptionPane.showMessageDialog(null, nomeMenor + " possui a menor média, com " + menor);
	}

}

// Faça um algoritmo para ler o nome e a média de N alunos. Após a leitura, mostre na tela o nome e 
//média do aluno com a menor média. Considere que as médias sejam todas diferentes entre si. 