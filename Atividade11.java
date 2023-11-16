//Faça uma sub-rotina que receba como parâmetro um valor inteiro e positivo N, indicando a quantidade
//de parcelas de uma soma S, calculada pela fórmula:
//S = 2/4 + 5/5 + 10/6 + 17/7 + 26/8 + ... + (n2 + 1)/(n + 3)

import java.util.Scanner;

public class Atividade11 {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de parcelas (N): ");
        double N = entrada.nextDouble();

        double resultado = calcularSoma(N);

        System.out.println("Resultado: " + resultado);

    }

    public static double calcularSoma(double N) {
        double soma = 0;
        int numerador = 2;
        int denominador = 4;

        for (int i = 0; i < N; i++) {
            double termo = (double) numerador / denominador;
            soma += termo;
            numerador = (i + 2) * (i + 2) + 1;
            denominador = i + 5;
        }

        return soma;
    }
}
