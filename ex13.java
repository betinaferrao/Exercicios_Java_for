package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex13 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros deseja? "));
		double total = 0;
		
		for(double i=1; i<=n; i++) {
		total += 1/i;
		}
		
		JOptionPane.showMessageDialog(null, "O resultado da f�rmula � " + String.format("%.2f", total));
		
	}
}


//Fa�a um algoritmo para calcular e mostrar na tela o resultado da seguinte f�rmula: 
//Considere que o valor �N� ser� digitado pelo usu�rio. 