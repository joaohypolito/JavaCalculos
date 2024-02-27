// Criar um programa para cálculo do salário líquido em que três valores devem
//ser informados pelo usuário em janelas de entrada: a quantidade de horas
//trabalhadas, o salário hora e o número de dependentes. O programa deve
//mostrar em janela de saída as informações contidas no lado esquerdo da
//tabela seguinte: Informação Cálculos Salário bruto Horas trabalhadas *
//salário hora + (50 * número de dependentes) Desconto INSS Se salário bruto
//<= 1000 INSS=salário bruto * 8.5/100 Se salário bruto > 1000 INSS=salário
//bruto * 9/100 Desconto IR Se salário bruto <= 500 IR=0 Se salário bruto >
//500 e <= 1000 IR=salário bruto*5/100 Se salário bruto > 1000 IR=salário
//bruto*7/100 Salário líquido Salário bruto - INSS – IR.

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Informe o salário por hora: ");
        double salarioHora = scanner.nextDouble();

        System.out.print("Informe o número de dependentes: ");
        int numeroDependentes = scanner.nextInt();

        scanner.close();

        double salarioBruto = horasTrabalhadas * salarioHora + (50 * numeroDependentes);

        double descontoINSS;
        if (salarioBruto <= 1000) {
            descontoINSS = salarioBruto * 8.5 / 100;
        } else {
            descontoINSS = salarioBruto * 9 / 100;
        }

        double descontoIR;
        if (salarioBruto <= 500) {
            descontoIR = 0;
        } else if (salarioBruto > 500 && salarioBruto <= 1000) {
            descontoIR = salarioBruto * 5 / 100;
        } else {
            descontoIR = salarioBruto * 7 / 100;
        }

        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS: R$ " + descontoINSS);
        System.out.println("Desconto IR: R$ " + descontoIR);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}