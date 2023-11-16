//Criar um programa que:
//utilize uma sub-rotina para receber os elementos de uma matriz 10X5 de números reais;
//utilize uma sub-rotina para calcular a soma de todos os elementos localizados abaixo da sexta linha
//dessa matriz;
//Os resultados deverão ser mostrados no programa principal


import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        double[][] matriz = lerMatriz();
        if (matriz != null) {
            double soma = calcularSomaAbaixoSextaLinha(matriz);
            System.out.println("A soma dos elementos abaixo da sexta linha é: " + soma);
        }
    }

    public static double[][] lerMatriz() {
        var entrada = new Scanner(System.in);
        double[][] matriz = new double[10][5];

        try {
            System.out.println("Entre com os elementos da matriz 10x5:");

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("Matriz[" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = entrada.nextDouble();
                }
            }

            return matriz;
        } catch (InputMismatchException e) {
            System.out.println("Erro: Insira valores numéricos válidos.");
            return null;
        } finally {
            entrada.close();
        }
    }

    public static double calcularSomaAbaixoSextaLinha(double[][] matriz) {
        double soma = 0.0;

        for (int i = 5; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }
}
