// Escreva um programa que, com base em uma temperatura em graus Celsius,
//a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit
//(F), seguindo as fórmulas: F = C * 1.8 +32; K = C + 273,15; Re=C*0,8; Ra =
//C * 1,8 + 32 + 459,67

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8;
        double rankine = celsius * 1.8 + 32 + 459.67;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");
        System.out.println("Temperatura em Réaumur: " + reaumur + " °Re");
        System.out.println("Temperatura em Rankine: " + rankine + " °Ra");

        scanner.close();
    }
}