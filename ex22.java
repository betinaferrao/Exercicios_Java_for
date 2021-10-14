package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex22 {
	public static void main(String[] args) {
		int n = 1;
		int andarInicio = Integer.parseInt(JOptionPane.showInputDialog("Qual o andar inicial? "));
		for (int i=1; i<=n; i++) {
		int andarIndo = Integer.parseInt(JOptionPane.showInputDialog("Qual o próximo andar? "));
		if (andarIndo > andarInicio) {
			JOptionPane.showMessageDialog(null, "Subindo...");
		} else if (andarIndo < andarInicio) {
			JOptionPane.showMessageDialog(null, "Descendo...");
		} else if(andarIndo == andarInicio) {
			JOptionPane.showMessageDialog(null, "Parado...");
		} 
		andarInicio = andarIndo;
		int confirm = JOptionPane.showConfirmDialog(null, "Deseja ir para outro andar? " );
		if (confirm == 0) {
			n++;
		} else {
			i = n + 2;
		}
		}
	}
}



/*
 * Faça um algoritmo para simular um elevador. O algoritmo deverá ler
 * inicialmente o número do andar inicial (qualquer número não negativo). Depois
 * disto, o algoritmo deve continuamente ler o próximo andar e escrever “sobe”
 * ou “desce” caso este andar seja superior (número maior) ou inferior (número
 * menor). O algoritmo deve parar quando o próximo andar for igual ao andar em
 * que o elevador já se encontrar. O elevador deverá realizar N movimentações
 * entre os andares.
 */
