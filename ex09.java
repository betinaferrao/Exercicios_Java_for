package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex09 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int fat = 1;
		String totalFat = "";
		
		for(int i=num; i>=1; i--) {
			fat *= i;
			totalFat += i + " X ";
		}
		
		JOptionPane.showMessageDialog(null, "O fatorial de " + totalFat + " = " + fat);
		
	}
}

//Pe�a para o usu�rio digitar um n�mero inteiro positivo qualquer, digamos N. Ap�s calcule N!.