package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex23 {
	public static void main(String[] args) {
		String seq = "";
		
		for(int i=1; i<4; i++) {
			seq += i + ", 0, 1, 2, 3\n";

		}
		JOptionPane.showMessageDialog(null, seq);
	}
}


/*Faça um algoritmo para mostrar na tela a seguinte sequência de números:  
1, 0, 1, 2, 3 
2, 0, 1, 2, 3 
3, 0, 1, 2, 3 
*/