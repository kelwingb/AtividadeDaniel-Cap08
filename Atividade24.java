//Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em um vetor. O
//programa deverá calcular e mostrar a maior e a menor temperatura do ano, junto com o mês em que elas
//ocorreram (o mês deverá ser mostrado por extenso: 1 = janeiro; 2 = fevereiro; ...)
//Não se preocupe com empates. Cada cálculo deve ser realizado e mostrado em uma sub-rotina

import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        double[] temperaturas = new double[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média do mês " + (i + 1) + ": ");
            temperaturas[i] = entrada.nextDouble();
        }

        calcularEMostrarTemperaturas(temperaturas);

        entrada.close();
    }

    public static void calcularEMostrarTemperaturas(double[] temperaturas) {
        double maiorTemperatura = temperaturas[0];
        double menorTemperatura = temperaturas[0];
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
                indiceMaior = i;
            }

            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
                indiceMenor = i;
            }
        }

        System.out.println("Maior temperatura do ano: " + maiorTemperatura + " graus, no mês " + (indiceMaior + 1));
        System.out.println("Menor temperatura do ano: " + menorTemperatura + " graus, no mês " + (indiceMenor + 1));
    }
}
