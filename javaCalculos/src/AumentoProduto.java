// Criar um programa que receba por janela JoptionPane o valor de um produto
//e um código de aumento, segundo a tabela: Código % aumento 1 10 3 25 4
//30 8 50 Utilizando a estrutura switch-case, mostrar em janela de saída o novo
//valor do produto depois de acrescida a porcentagem correspondente.

import javax.swing.JOptionPane;

public class AumentoProduto {
    public static void main(String[] args) {

        String strValorProduto = JOptionPane.showInputDialog("Informe o valor do produto:");

        double valorProduto = Double.parseDouble(strValorProduto);

        String strCodigoAumento = JOptionPane.showInputDialog("Informe o código de aumento:\n" +
                "1 - 10%\n" +
                "3 - 25%\n" +
                "4 - 30%\n" +
                "8 - 50%");

        int codigoAumento = Integer.parseInt(strCodigoAumento);

        double novoValorProduto = 0;

        switch (codigoAumento) {
            case 1:
                novoValorProduto = valorProduto * 1.10; // Aumento de 10%
                break;
            case 3:
                novoValorProduto = valorProduto * 1.25; // Aumento de 25%
                break;
            case 4:
                novoValorProduto = valorProduto * 1.30; // Aumento de 30%
                break;
            case 8:
                novoValorProduto = valorProduto * 1.50; // Aumento de 50%
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código de aumento inválido.");
                return;
        }

        JOptionPane.showMessageDialog(null, "Novo valor do produto: R$ " + novoValorProduto);
    }
}