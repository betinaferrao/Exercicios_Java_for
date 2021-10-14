package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex14 {
	public static void main(String[] args) {
		int operacoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas opera��es banc�rias ser�o realizadas?"));
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Conta corrente: "));
		
		for(int i=1; i<=operacoes; i++) {
			char depOuRet = JOptionPane.showInputDialog("Deseja realizar um (D)ep�sito ou (R)etirada? (D/R)").toUpperCase().charAt(0);
			if (depOuRet == 'D') {
				int deposito = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja depositar? "));
				saldo += deposito;
			} else if (depOuRet == 'R') {
				int retirada = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja retirar? "));
				saldo -= retirada;
			} else {
				JOptionPane.showMessageDialog(null, "Comando inv�lido");
			}
		}
		JOptionPane.showMessageDialog(null, "Saldo total: " + saldo);
	}
}

/*
 Uma cliente possui um determinado valor X, como saldo de conta corrente em um banco. Durante o 
m�s, s�o realizadas opera��es de dep�sitos e retiradas. Fa�a um algoritmo para ler as N opera��es 
banc�rias realizadas durante o m�s, e ao final mostrar na tela o saldo que ficou na conta banc�rias da 
loja. Considere que uma opera��o banc�ria corresponde a leitura do valor movimentado e do tipo da 
opera��o: (D)ep�sito ou (R)etirada
 */