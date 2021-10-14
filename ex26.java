package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex26 {
	public static void main(String[] args) {
		double deposito = 0;
		double retirada = 0;
		double total = 0;
		String total1 = "";
		double totFinal = 0;
		
		int caixas = Integer.parseInt(JOptionPane.showInputDialog("Quantos caixas tem?"));
		for (int i = 1; i <= caixas; i++) {
			int clientes = Integer
					.parseInt(JOptionPane.showInputDialog("Quantos clientes o " + i + "° caixa atendeu?"));
			for (int j = 1; j <= clientes; j++) {
				JOptionPane.showInputDialog("Nome do " + j + "° cliente: ");
				char depOuRet = JOptionPane.showInputDialog("Deseja realizar um depósito ou retirada (D/R)? ").toUpperCase().charAt(0);
				if (depOuRet == 'D') {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja depositar?"));
					deposito += valor;
				} else if (depOuRet == 'R') {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja retirar?"));
					retirada += valor;
				} else {
					JOptionPane.showMessageDialog(null, "Comando inválido. Digite novamente.");
					j--;
				}

				total = deposito - retirada;
				
			}

			total1 += "Caixa " + i + ": \nDepósitos: " + deposito + "\nRetiradas: " + retirada + "\nTotal: " + total
					+ "\n\n";
			totFinal += total;
			total = 0;
			deposito = 0;
			retirada = 0;

		}
		JOptionPane.showMessageDialog(null, total1 + "Total final de todas operações: " + totFinal);
	}
}

/*
 * Em um banco existem (N) filas de caixas. Cada caixa atende uma quantidade
 * variável (Q) de clientes. Cada cliente faz apenas uma única operação:
 * depósitos(D), ou retiradas(R). Faça um algoritmo para ler: Nome do cliente,
 * tipo da operação (D/R) e valor da operação, onde esta leitura deve ser feita
 * para cada um dos (Q) clientes de cada uma das (N) filas. Ao final, mostrar na
 * tela o total geral de depósitos e retiradas ocorridos.
 */
