//Faça uma sub-rotina que receba como parâmetro dois vetores de dez números inteiros, determine e mostre o vetor intersecção entre eles.

import java.util.Arrays;

public class Atividade19 {
    public static void main(String[] args) {

        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {5, 7, 9, 11, 13, 15, 17, 19, 21, 23};

        int[] interseccao = encontInter(vetor1, vetor2);

        System.out.println("Vetor Interseção: " + Arrays.toString(interseccao));
    }

    public static int[] encontInter(int[] vetor1, int[] vetor2) {
        int[] interseccaoTemp = new int[Math.min(vetor1.length, vetor2.length)];
        int count = 0;


        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    interseccaoTemp[count++] = vetor1[i];
                    break;
                }
            }
        }

        int[] interseccao = Arrays.copyOf(interseccaoTemp, count);

        return interseccao;
    }
}
