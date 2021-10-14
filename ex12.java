package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex12 {
	public static void main(String[] args) {
		int somaIdades = 0;
		int mediaIdade = 0;
		int qntd = Integer.parseInt(JOptionPane.showInputDialog("Deseja ler o nome e idade de quantas pessoas?"));

		for (int i=1; i<=qntd; i++) {
			JOptionPane.showInputDialog("Digite o nome da " + i + "° pessoa");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da " + i + "° pessoa"));
			somaIdades += idade;
		}
		
		mediaIdade = somaIdades/qntd;
		JOptionPane.showMessageDialog(null, "Soma das idades: " + somaIdades + "\nMédia das idades: " + mediaIdade);

	}
}

//Faça um algoritmo para fazer a leitura de N nomes e idades de pessoas, e após, mostrar: 
//a) O somatório de todas as idades. 
//b) A média das idades. 