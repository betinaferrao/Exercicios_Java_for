package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex05 {
	public static void main(String[] args) {
		int soma = 0;
		
		for(int i=0; i<=10; i++) {
			soma += i;
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos n�meros de 1 a 10 � "+ soma);
	}
}

//Fa�a um algoritmo que calcule: Y = 1 + 2 + 3 + 4 + 5 + ... + 10.