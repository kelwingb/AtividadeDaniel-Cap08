//Elabore uma sub-rotina que calcule o máximo divisor comum (MDC) de dois números recebidos como
//parâmetros.

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Informe um número: ");
        numero1 = entrada.nextInt();

        System.out.println("Informe um número: ");
        numero2 = entrada.nextInt();

        int mdc = calcularMDC(numero1, numero2);

        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é: " + mdc);
    }

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

