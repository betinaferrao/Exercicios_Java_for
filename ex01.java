package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex01 {
	public static void main(String[] args) {
		String soma = "Lista de n�meros \n";

		for (int i = 0; i <= 100; i++) {
			soma += i + "\n";
		}
		JOptionPane.showMessageDialog(null, soma);
	}
}

//Fa�a um algoritmo para mostrar na tela a seguinte seq��ncia de n�meros: 1 2 3 4 5 6 7 8...100. 