/*
Calcule e apresente o valor do volume de uma lata de óleo, utilizando a
fórmula: V = 3,14159 * R * R * A, em que as variáveis: V, R e A representam
respectivamente o volume, o raio e a altura. Vamos declarar as variáveis V,
R e A como double e definir um valor qualquer para as variáveis de altura e
de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, em
seguida, exibir na tela uma mensagem contendo o resultado do volume
encontrado.
*/

import java.util.Scanner;

public class CalculoVolumeLata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do raio da lata (em centímetros): ");
        double raio = scanner.nextDouble();

        System.out.println("Informe o valor da altura da lata (em centímetros): ");
        double altura = scanner.nextDouble();

        double volume = 3.14159 * raio * raio * altura;

        System.out.println("O volume da lata de óleo é: " + volume + " centímetros cúbicos.");

        scanner.close();
    }
}