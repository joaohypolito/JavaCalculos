// Programa que calcule a média de salários de uma empresa, pedindo ao
//usuário a grade de funcionários e os salários em JOptionPane e devolvendo
//a média.

import javax.swing.JOptionPane;

public class CalculoMediaSalarios {
    public static void main(String[] args) {
        String strQuantidadeFuncionarios = JOptionPane.showInputDialog("Informe a quantidade de funcionários:");
        int quantidadeFuncionarios = Integer.parseInt(strQuantidadeFuncionarios);

        double somaSalarios = 0;

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            String strSalario = JOptionPane.showInputDialog("Informe o salário do funcionário " + (i + 1) + ":");
            double salario = Double.parseDouble(strSalario);
            somaSalarios += salario;
        }

        double mediaSalarios = somaSalarios / quantidadeFuncionarios;

        JOptionPane.showMessageDialog(null, "A média de salários da empresa é: " + mediaSalarios);
    }
}
