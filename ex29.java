package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex29 {
	public static void main(String[] args) {
		int n = 1;
		int qntd = 0;
		int primo = 0;

		for (int j = 1; j <= n; j++) {
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro maior que zero: "));
			for (int i = 1; i <=n1; i++) {
				if (n1 % i == 0) {
					qntd++;
				}
			}
			
			if (qntd == 2) {
					primo++;
				
			}
			
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja testar mais um n�mero? ");
			if (confirm == 0) {
				n++;
			} else {
				j = n + 2;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Quantidade de primos: " + primo);
		
	}
}
/*
 * Fa�a um algoritmo para ler uma s�rie de (N) n�mero inteiros maiores que
 * zero(0). Ap�s a leitura mostre na tela a quantidade de n�meros primos
 * digitados. Considere que um n�mero � primo ser ele for divis�vel somente por
 * (1) e por ele mesmo. Dica para determinar se um n�mero � primo: se voc�
 * dividir um determinado n�mero(X) por todos os valores inteiros existentes
 * entre (1) e (X), o total de divisores tem de ser menor/igual a dois (2).
 */
