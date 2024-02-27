// Desenvolver programa que peca ao usuario para cadastrar uma senha; na
//sequencia, deve pedir ao usuario que digite duas variaveis reais, e ira calcular
//a divisão da primeira pela segunda. O programa ira pedir ao usuario que
//digite sua senha:Se estiver correta ela mostra o resultado da divisao. Senao
//da mensagem de erro e encerra o aplicativo.

import java.util.Scanner;

public class DivisaoComSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário cadastrar uma senha
        System.out.print("Cadastre uma senha: ");
        String senhaCadastrada = scanner.nextLine();

        // Solicita ao usuário que digite duas variáveis reais
        System.out.print("Digite o primeiro número real: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double numero2 = scanner.nextDouble();

        // Solicita ao usuário que digite a senha para visualizar o resultado da divisão
        System.out.print("Digite sua senha para ver o resultado da divisão: ");
        String senhaDigitada = scanner.next();

        // Verifica se a senha digitada está correta
        if (senhaDigitada.equals(senhaCadastrada)) {
            // Calcula e exibe o resultado da divisão se a senha estiver correta
            double resultado = numero1 / numero2;
            System.out.println("O resultado da divisão é: " + resultado);
        } else {
            // Exibe mensagem de erro se a senha estiver incorreta
            System.out.println("Senha incorreta. Encerrando o programa.");
        }

        scanner.close();
    }
}
