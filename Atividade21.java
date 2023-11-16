//Faça uma sub-rotina que receba uma matriz 10X10 e determine o maior elemento acima da diagonal
//principal. Esse valor deverá ser mostrado no programa principal.


import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {

        int[][] matriz = lerMatriz();
        int maiorElemento = encontrarMaiorElementoAcimaDiagonal(matriz);

        System.out.println("O maior elemento acima da diagonal principal é: " + maiorElemento);
    }

    public static int[][] lerMatriz() {
        var entrada = new Scanner(System.in);
        int[][] matriz = new int[10][10];

        System.out.println("Entre com os elementos da matriz 10x10:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Matriz[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }


        entrada.close();

        return matriz;
    }

    public static int encontrarMaiorElementoAcimaDiagonal(int[][] matriz) {
        int maiorElemento = matriz[0][1];

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
        }

        return maiorElemento;
    }
}

