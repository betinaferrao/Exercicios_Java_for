package aula_2_exercicios;

import javax.swing.JOptionPane;

public class ex15a {
	public static void main(String[] args) {
        int n = 1;

        for (int i = 1; i <= n; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
            double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do aluno " + nome + ":"));

            if (media >= 7.0) {
                JOptionPane.showMessageDialog(null, nome + "está aprovado(a)");
            } else {
                if (media < 2.0) {
                    JOptionPane.showMessageDialog(null, nome + "está reprovado(a)");
                } else {
                    JOptionPane.showMessageDialog(null, nome + "está de recupração");
                }
            }

            int confirm = JOptionPane.showConfirmDialog(null, "Deseja verificar outro aluno(a)?");

            if (confirm == 0) {
                n++;
            } else {
                i = n + 2;
            }
        }

    }
}
