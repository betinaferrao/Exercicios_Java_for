package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex10 {
	public static void main(String[] args) {
		int soma = 0;
		int soma1 = 0;
		int somaTotal = 0;
		
		for(int i=1; i<=100; i+=2) {
			soma += i;
		}
		
		for(int i=-2; i>=-100; i-=2) {
			soma1 += i;
		}
		
		somaTotal = soma + soma1;
		JOptionPane.showMessageDialog(null, somaTotal);
	}
}

// Faça um algoritmo para somar e mostrar na tela o resultado da seguinte expressão  1-2+3-4+5-6+7-
//8+9-10+...100

// i = i -2