package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex23a {
	public static void main(String[] args) {
		String seq = "";
		String junto = "";

		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 4; i++) {
				seq += j + ", ";
			}
			
			junto += i + ", " + seq + "\n";
			seq = "";
			
		}
		JOptionPane.showMessageDialog(null, junto);
	}
}
