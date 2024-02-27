/*
Escreva um programa para determinar a quantidade de cavalos necessários
para levantar uma massa de m quilogramas a uma altura de h metros em t
segundos. Considere cavalos = (m * h / t) / 745,6999.
*/

import java.util.Scanner;

public class CalculoCavalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que informe a massa em quilogramas
        System.out.print("Informe a massa (em quilogramas): ");
        double massa = scanner.nextDouble();

        // Solicitando ao usuário que informe a altura em metros
        System.out.print("Informe a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Solicitando ao usuário que informe o tempo em segundos
        System.out.print("Informe o tempo (em segundos): ");
        double tempo = scanner.nextDouble();

        // Calculando a quantidade de cavalos necessários usando a fórmula fornecida
        double cavalos = (massa * altura / tempo) / 745.6999;

        // Exibindo o resultado na tela
        System.out.println("A quantidade de cavalos necessários é: " + cavalos);

        scanner.close();
    }
}
