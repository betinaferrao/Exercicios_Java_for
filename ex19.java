package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex19 {
	public static void main(String[] args) {
		int qntd = Integer.parseInt(JOptionPane.showInputDialog("Deseja ler o nome e idade de quantas pessoas?"));
		int maior = 0;
		int menor = 0;
		String nomeMaior = "";
		String nomeMenor = "";

		for (int i = 1; i <= qntd; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome da " + i + "° pessoa");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da " + i + "° pessoa"));

			if (i == 1) {
				maior = idade;
				menor = idade;
				nomeMenor = nome;
				nomeMaior = nome;
			} else {

				if (idade < menor) {
					menor = idade;
					nomeMenor = nome;
				}

				if (idade > maior) {
					maior = idade;
					nomeMaior = nome;
				}
			}
		}
		JOptionPane.showMessageDialog(null, nomeMenor + " é a pessoa mais nova, com " + menor + " anos.\n" + nomeMaior
				+ " é a pessoa mais velha, com " + maior + " anos.");

	}
}
/*
 * Uma empresa possui N funcionários dos quais são conhecidos seus nomes e
 * idades. Faça um algoritmo que imprima o nome e a idade da pessoa mais idosa e
 * a mais nova. Considere que não existem pessoas com idades iguais.
 */