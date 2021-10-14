package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex02 {
		public static void main(String[] args) {
			String soma = "Lista pulando de 10 em 10 \n";
			
			for (int i=0; i<=1000; i +=10) {
				soma += i + "\n";
			}
			JOptionPane.showMessageDialog(null, soma);
		}
}

//Faça um algoritmo para mostrar na tela a seguinte seqüência de números: 10 20 30 40 50 60 70 80... 
//1000.