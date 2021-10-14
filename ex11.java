package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex11 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome da " + i + "° pessoa");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da " + i + "° pessoa"));
			JOptionPane.showMessageDialog(null, i + "° Pessoa \n Nome: " + nome + "\n Idade: " + idade);
		}

	}

}

// Faça um algoritmo para fazer a leitura de 10 nomes e idades de pessoas. 