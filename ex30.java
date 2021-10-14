package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex30 {
	public static void main(String[] args) {
		double valorTotal = 0;
		double valorTotal1 = 0;
		double valorTotal2 = 0;
		double valorFunc = 0;
		String valorFunc1 = "";
		double valorServ = 0;
		String valorServ1 = "";
		double maior = 0;
		double menor = 0;
		String nomeMaior = "";
		String nomeMenor = "";
		
		int func = Integer.parseInt(JOptionPane.showInputDialog("Há quantos funcionários trabalhando? "));
		for (int i=1; i<=func; i++) {
			String nome = JOptionPane.showInputDialog("Qual o nome do " + i + "° funcionário? ");
			int serv = Integer.parseInt(JOptionPane.showInputDialog("Quantos serviços o " + i + "° funcionário presta? "));
			for (int j=1; j<=serv; j++) {
				int pecas = Integer.parseInt(JOptionPane.showInputDialog("Quantas peças serão colocadas no " + j + "° serviço? "));
				for (int p=1; p<=pecas; p++) {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da " + p + "° peça? "));
					valorTotal += valor;
					valorTotal1 += valor;
					valorTotal2 += valor;
					
				}
				valorServ = valorTotal2;
				valorServ1 += j + "° serviço de " + nome + " arrecada: " + valorServ + "\n";
				valorServ = 0;
				valorTotal2 = 0;
				
				
			}
			valorFunc = valorTotal1;
			valorFunc1 += i + "° funcionário ( " + nome + ") recebe: " + valorFunc + "\n";
			if(i==1) {
				maior = valorFunc;
				menor = valorFunc;
				nomeMaior = nome;
				nomeMenor = nome;
			} 
			if (valorFunc > maior) {
				nomeMaior = nome;
			}
			if (valorFunc < menor) {
				nomeMenor = nome;
			}
			valorFunc = 0;
			valorTotal1 = 0;
		}
		valorFunc = valorTotal/func;
		JOptionPane.showMessageDialog(null, "Total da empresa: " + valorTotal + 
				"\nTotal de cada funcionário: \n" + valorFunc1 +
				"\nTotal de cada serviço: \n" + valorServ1 +
				"\nFuncionário que arrecadou mais: " + nomeMaior +
				"\nFuncionário que arrecadou menos: " + nomeMenor);
	}
}


/*Ao prestar um serviço em uma oficina mecânica, um funcionário coloca várias peças em um carro e 
ao final informa o valor da mão de obra. Sendo que na oficina há N funcionários trabalhando e cada 
um  presta  X  serviços  por  dia,  em  cada  serviço  prestado  poderão  ser  colocadas  várias  peças,  e para 
cada peça deve-se informar a quantidade e o valor, mostre: 
a) Total arrecadado pela empresa ao final do dia; 
b) Total de cada funcionário; 
c) Total de cada serviço; 
d) Nome do funcionário que arrecadou mais com mão de obra; 
e) Nome do funcionário que arrecadou menos com mão de obra;*/