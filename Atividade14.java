//Faça uma sub-rotina que receba um vetor X de 30 elementos inteiros como parâmetro e retorne dois
//vetores A e B. O vetor A deve conter os elementos de X que sejam maiores que zero e o vetor B, os elementos menores ou iguais a zer

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        var entrada =  new Scanner(System.in);
        int[] x = {-7, -4, -8, 2, 5, 7, 9, 1, 2, 10, 3, -2, -7, -9, 12, 11, 19, 20, 1, 0, 2, 6, 7, 9, 3, 4, 7, 11, 22, 30};

        int[] vetorA = null;
        int[] vetorB = null;

        ResultadoSeparacao resultado = sepVetor(x, x.length);

        vetorA = resultado.vetorA;
        vetorB = resultado.vetorB;

        System.out.println("Vetor A (elementos maiores que zero): ");
        imprimirVetor(vetorA);

        System.out.println("\nVetor B (elementos menores ou iguais a zero): ");
        imprimirVetor(vetorB);

        entrada.close();
    }

    public static ResultadoSeparacao sepVetor(int[] x, int tamanho) {
        int contA = 0, contB = 0;

        for (int i = 0; i < tamanho; i++) {
            if (x[i] > 0) {
                contA++;
            } else {
                contB++;
            }
        }

        int[] vetorA = new int[contA];
        int[] vetorB = new int[contB];

        int numA = 0, numB = 0;
        for (int i = 0; i < tamanho; i++) {
            if (x[i] > 0) {
                vetorA[numA++] = x[i];
            } else {
                vetorB[numB++] = x[i];
            }
        }

        return new ResultadoSeparacao(vetorA, vetorB);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

class ResultadoSeparacao {
    int[] vetorA;
    int[] vetorB;

    public ResultadoSeparacao(int[] vetorA, int[] vetorB) {
        this.vetorA = vetorA;
        this.vetorB = vetorB;
    }
}
