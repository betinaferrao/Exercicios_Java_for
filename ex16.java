package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex16 {
	public static void main(String[] args) {
		int alunos = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos alunos?"));
		int masc = 0;
		int femi = 0;

		for (int i = 1; i <= alunos; i++) {
			JOptionPane.showInputDialog("Digite o nome do " + i + "° aluno: ");
			char sexo = JOptionPane.showInputDialog("Digite o sexo do " + i + "° aluno (F/M): ").toUpperCase()
					.charAt(0);
			if (sexo == 'M') {
				masc += 1;
			} else if (sexo == 'F') {
				femi += 1;
			} else {
				JOptionPane.showMessageDialog(null, "Comando inválido. Digite novamente");
				i--;
			}
		}
		JOptionPane.showMessageDialog(null,
				"Alunos do sexo masculino: " + masc + "\n Alunos do sexo feminino: " + femi);
	}
}

//Faça um algoritmo para ler nome e sexo dos N alunos de uma sala de aula. Após a leitura, mostre na 
//tela quantos alunos são do sexo masculino, e quantos são do sexo feminino.