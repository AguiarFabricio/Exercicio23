package exercicio23;

import javax.swing.JOptionPane;

public class Exercicio23 {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inicial"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final"));

        int soma = 0;
        int i = numero1;

        while (i <= numero2) {
            soma += i;
            i++;
        }

        JOptionPane.showMessageDialog(null, "A soma dos números de " + numero1 + " até " + numero2 + " é: " + soma);
    }
}
