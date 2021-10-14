package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex06 {
	public static void main(String[] args) {
		int mult = 1;
		for(int i=1; i<=10; i++) {
			mult *= i;
		}
		
		JOptionPane.showMessageDialog(null, "A mutiplicação dos números de 1 até 10 é " + mult);
	}
}

//Faça um algoritmo que calcule: Y = 1 * 2 * 3 * 4 * 5 * ... * 10. 
