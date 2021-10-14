package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex09 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int fat = 1;
		String totalFat = "";
		
		for(int i=num; i>=1; i--) {
			fat *= i;
			totalFat += i + " X ";
		}
		
		JOptionPane.showMessageDialog(null, "O fatorial de " + totalFat + " = " + fat);
		
	}
}

//Peça para o usuário digitar um número inteiro positivo qualquer, digamos N. Após calcule N!.