// Tem-se um conjunto de dados contendo a altura e o sexo (masculino,
//feminino) de 10 pessoas. Fazer um algoritmo que calcula e escreve:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.

import java.util.Scanner;

public class AnaliseAlturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturasHomens = 0;
        int numeroMulheres = 0;
        int numeroHomens = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 'M' || sexo == 'm') {
                somaAlturasHomens += altura;
                numeroHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                numeroMulheres++;
            } else {
                System.out.println("Sexo inválido. Por favor, digite M ou F.");
                i--;
            }
        }

        double mediaAlturaHomens = somaAlturasHomens / numeroHomens;

        System.out.println("\nResultados:");
        System.out.println("Maior altura do grupo: " + maiorAltura + " metros");
        System.out.println("Menor altura do grupo: " + menorAltura + " metros");
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens + " metros");
        System.out.println("Número de mulheres: " + numeroMulheres);

        scanner.close();
    }
}