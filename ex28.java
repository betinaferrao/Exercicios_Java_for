package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex28 {
	public static void main(String[] args) {
		double deposito = 0;
		double retirada = 0;
		double total = 0;
		String total1 = "";
		double totFinal = 0;
		double maior = 0;
		double menor = 0;
		int caixa = 0;
		int caixa1 = 0;
		
		int caixas = Integer.parseInt(JOptionPane.showInputDialog("Quantos caixas tem?"));
		for (int i = 1; i <= caixas; i++) {
			int clientes = Integer
					.parseInt(JOptionPane.showInputDialog("Quantos clientes o " + i + "� caixa atendeu?"));
			for (int j = 1; j <= clientes; j++) {
				JOptionPane.showInputDialog("Nome do " + j + "� cliente: ");
				char depOuRet = JOptionPane.showInputDialog("Deseja realizar um dep�sito ou retirada (D/R)? ").toUpperCase().charAt(0);
				if (depOuRet == 'D') {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja depositar?"));
					deposito += valor;
				} else if (depOuRet == 'R') {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja retirar?"));
					retirada += valor;
				} else {
					JOptionPane.showMessageDialog(null, "Comando inv�lido. Digite novamente.");
					j--;
				}

				total = deposito - retirada;

			}

			total1 += "Caixa " + i + ": \nDep�sitos: " + deposito + "\nRetiradas: " + retirada + "\nTotal: " + total
					+ "\n\n";
			totFinal += total;
			if (i == 1) {
				maior = deposito;
				menor = retirada;
				caixa = i;
				caixa1 = i;
			} 
			if (deposito > maior) {
				maior = deposito;
				caixa = i;
			}
			if (retirada < menor) {
				menor = retirada;
				caixa1 = i;
			}
			
			total = 0;
			deposito = 0;
			retirada = 0;

		}
		JOptionPane.showMessageDialog(null, total1 + "Total final de todas opera��es: " + totFinal + "\nMaior volume de dep�sitos: caixa " + caixa + ", com R$ " + maior +
		"\nMenor n�mero de retiradas: caixa " + caixa1 + ", com R$" + menor);
	}
}

/* Em um banco existem (N) filas de caixas. Cada caixa atende uma quantidade vari�vel (Q) de clientes. 
Cada cliente faz apenas uma �nica opera��o: dep�sitos(D), ou retiradas(R). Fa�a um  algoritmo para  
ler: Nome do cliente, tipo da opera��o (D/R) e valor da opera��o, onde esta leitura deve ser feita para 
cada um dos (Q) clientes de cada uma das (N) filas. Mostrar ao final, o n�mero da fila que obteve o 
maior volume de dep�sitos, e o n�mero da fila que obteve o menor volume de retiradas.
*/