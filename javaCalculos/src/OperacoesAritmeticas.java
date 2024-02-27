// Implementar programa que realize uma das 4 operaçoes (+), (-), (/) e (*) entre
//duas variáveis, através da escolha do usuário.

import java.util.Scanner;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira dois números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicita ao usuário que escolha a operação a ser realizada
        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Digite o número da operação desejada: ");
        int escolha = scanner.nextInt();

        // Realiza a operação selecionada e exibe o resultado
        switch (escolha) {
            case 1:
                System.out.println("Resultado da adição: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado da divisão: " + (numero1 / numero2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
