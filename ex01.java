package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex01 {
	public static void main(String[] args) {
		String soma = "Lista de números \n";

		for (int i = 0; i <= 100; i++) {
			soma += i + "\n";
		}
		JOptionPane.showMessageDialog(null, soma);
	}
}

//Faça um algoritmo para mostrar na tela a seguinte seqüência de números: 1 2 3 4 5 6 7 8...100. 