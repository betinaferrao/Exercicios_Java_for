package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex18 {
	public static void main(String[] args) {
		int totalTubarao = 0;
		int totalJaguaruna = 0;
		int totalMenos17 = 0;
		int qntd = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos alunos?"));
		for (int i = 1; i <= qntd; i++) {
			JOptionPane.showInputDialog("Digite o nome do " + i + "° aluno: ");
			char cidade = JOptionPane.showInputDialog("Digite a cidade do " + i + "° aluno (Tubarão ou Jaguaruna): ").toUpperCase().charAt(0);
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do " + i + "° aluno: "));

			if (cidade == 'T') {
				totalTubarao += 1;
			}

			if (cidade == 'J') {
				totalJaguaruna += 1;
			}

			if (idade < 17) {
				totalMenos17 += 1;
			}
		}

		JOptionPane.showMessageDialog(null,
				"Total de alunos em Tubarão: " + totalTubarao + "\nTotal de alunos em Jaguaruna: " + totalJaguaruna
						+ "\nTotal de alunos com menos de 17 anos: " + totalMenos17);
	}
}


/*
 * Uma sala de aula possui N alunos, dos quais é conhecido: Nome, cidade onde
 * mora e idade. Faça um algoritmo que imprima: a) A quantidade de alunos que
 * residem em TUBARÃO b) A quantidade de alunos que residem em JAGUARUNA c) A
 * quantidade de alunos que possuem idade inferior a 17 anos
 */
