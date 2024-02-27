/*
Uma parede em formato retangular, cuja altura é hp (altura da parede) e a
largura lp (largura da parede) precisa ser coberta por azulejos também
retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la
(largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp,
ha e la, calcule e imprima quanto azulejos com as medidas dadas são
necessários para cobrir a parede dada.
*/

import java.util.Scanner;

public class CoberturaAzulejos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura da parede (em metros): ");
        double alturaParede = scanner.nextDouble();

        System.out.println("Digite a largura da parede (em metros): ");
        double larguraParede = scanner.nextDouble();

        System.out.println("Digite a altura do azulejo (em centímetros): ");
        double alturaAzulejoCm = scanner.nextDouble();

        System.out.println("Digite a largura do azulejo (em centímetros): ");
        double larguraAzulejoCm = scanner.nextDouble();

        double alturaAzulejo = alturaAzulejoCm / 100;
        double larguraAzulejo = larguraAzulejoCm / 100;

        double areaParede = alturaParede * larguraParede;
        double areaAzulejo = alturaAzulejo * larguraAzulejo;

        int azulejosNecessarios = (int) Math.ceil(areaParede / areaAzulejo);

        System.out.println("Para cobrir a parede serão necessários " + azulejosNecessarios + " azulejos.");

        scanner.close();
    }
}