package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex06 {
	public static void main(String[] args) {
		int mult = 1;
		for(int i=1; i<=10; i++) {
			mult *= i;
		}
		
		JOptionPane.showMessageDialog(null, "A mutiplica��o dos n�meros de 1 at� 10 � " + mult);
	}
}

//Fa�a um algoritmo que calcule: Y = 1 * 2 * 3 * 4 * 5 * ... * 10. 
