package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex24 {
	public static void main(String[] args) {
	String seq = "";
	String seq1 = "";
	
	for(int i = 1; i <= 3; i++) {
		for(int j = 3; j >= 0; i--) {
			if(j == 0) {
				seq += j;
			} else {
				seq += j + ", ";
			}
		}
		seq1 += i + ", " + seq + "\n";
		seq = "";
	  }
	
	JOptionPane.showMessageDialog(null, seq1);
	}
}


/*
Faça um algoritmo para mostrar na tela a seguinte sequência de números:  
1, 3, 2, 1, 0 
2, 3, 2, 1, 0 
3, 3, 2, 1, 0
*/