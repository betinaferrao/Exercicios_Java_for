package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex03 {
	public static void main(String[] args) {
		String soma = "Lista \n";
		
		for(int i=99; i>=1; i-=2 ) {
			soma += i + "\n";
		}
		JOptionPane.showMessageDialog(null, soma);
	}
}

//Fa�a um algoritmo para mostrar na tela a seguinte seq��ncia de n�meros: 99 97 95 93 91...7 5 3 1. 