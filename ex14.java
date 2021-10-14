package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex14 {
	public static void main(String[] args) {
		int operacoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas operações bancárias serão realizadas?"));
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Conta corrente: "));
		
		for(int i=1; i<=operacoes; i++) {
			char depOuRet = JOptionPane.showInputDialog("Deseja realizar um (D)epósito ou (R)etirada? (D/R)").toUpperCase().charAt(0);
			if (depOuRet == 'D') {
				int deposito = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja depositar? "));
				saldo += deposito;
			} else if (depOuRet == 'R') {
				int retirada = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja retirar? "));
				saldo -= retirada;
			} else {
				JOptionPane.showMessageDialog(null, "Comando inválido");
			}
		}
		JOptionPane.showMessageDialog(null, "Saldo total: " + saldo);
	}
}

/*
 Uma cliente possui um determinado valor X, como saldo de conta corrente em um banco. Durante o 
mês, são realizadas operações de depósitos e retiradas. Faça um algoritmo para ler as N operações 
bancárias realizadas durante o mês, e ao final mostrar na tela o saldo que ficou na conta bancárias da 
loja. Considere que uma operação bancária corresponde a leitura do valor movimentado e do tipo da 
operação: (D)epósito ou (R)etirada
 */