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
		
		int func = Integer.parseInt(JOptionPane.showInputDialog("H� quantos funcion�rios trabalhando? "));
		for (int i=1; i<=func; i++) {
			String nome = JOptionPane.showInputDialog("Qual o nome do " + i + "� funcion�rio? ");
			int serv = Integer.parseInt(JOptionPane.showInputDialog("Quantos servi�os o " + i + "� funcion�rio presta? "));
			for (int j=1; j<=serv; j++) {
				int pecas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pe�as ser�o colocadas no " + j + "� servi�o? "));
				for (int p=1; p<=pecas; p++) {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da " + p + "� pe�a? "));
					valorTotal += valor;
					valorTotal1 += valor;
					valorTotal2 += valor;
					
				}
				valorServ = valorTotal2;
				valorServ1 += j + "� servi�o de " + nome + " arrecada: " + valorServ + "\n";
				valorServ = 0;
				valorTotal2 = 0;
				
				
			}
			valorFunc = valorTotal1;
			valorFunc1 += i + "� funcion�rio ( " + nome + ") recebe: " + valorFunc + "\n";
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
				"\nTotal de cada funcion�rio: \n" + valorFunc1 +
				"\nTotal de cada servi�o: \n" + valorServ1 +
				"\nFuncion�rio que arrecadou mais: " + nomeMaior +
				"\nFuncion�rio que arrecadou menos: " + nomeMenor);
	}
}


/*Ao prestar um servi�o em uma oficina mec�nica, um funcion�rio coloca v�rias pe�as em um carro e 
ao final informa o valor da m�o de obra. Sendo que na oficina h� N funcion�rios trabalhando e cada 
um  presta  X  servi�os  por  dia,  em  cada  servi�o  prestado  poder�o  ser  colocadas  v�rias  pe�as,  e para 
cada pe�a deve-se informar a quantidade e o valor, mostre: 
a) Total arrecadado pela empresa ao final do dia; 
b) Total de cada funcion�rio; 
c) Total de cada servi�o; 
d) Nome do funcion�rio que arrecadou mais com m�o de obra; 
e) Nome do funcion�rio que arrecadou menos com m�o de obra;*/