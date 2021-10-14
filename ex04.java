package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex04 {
	public static void main(String[] args) {
		String soma = "Lista \n";
		
		for(int i=1000; i>0; i-= 10) {
			soma += i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, soma);
	}
}

// Faça um algoritmo para mostrar na tela a seguinte seqüência de números: 1000 990 980 970 ... 40 30 
//20 10