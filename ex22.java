package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex22 {
	public static void main(String[] args) {
		int n = 1;
		int andarInicio = Integer.parseInt(JOptionPane.showInputDialog("Qual o andar inicial? "));
		for (int i=1; i<=n; i++) {
		int andarIndo = Integer.parseInt(JOptionPane.showInputDialog("Qual o pr�ximo andar? "));
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
 * Fa�a um algoritmo para simular um elevador. O algoritmo dever� ler
 * inicialmente o n�mero do andar inicial (qualquer n�mero n�o negativo). Depois
 * disto, o algoritmo deve continuamente ler o pr�ximo andar e escrever �sobe�
 * ou �desce� caso este andar seja superior (n�mero maior) ou inferior (n�mero
 * menor). O algoritmo deve parar quando o pr�ximo andar for igual ao andar em
 * que o elevador j� se encontrar. O elevador dever� realizar N movimenta��es
 * entre os andares.
 */
