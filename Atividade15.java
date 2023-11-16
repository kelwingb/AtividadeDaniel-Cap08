//Elabore uma sub-rotina que receba um vetor X de 15 números inteiros como parâmetro e retorne a
//quantidade de valores pares em X.


public class Atividade15 {
    public static void main(String[] args) {
        int[] x = {2, 3, 5, 9, 10, 0, 8, 11, 3, 6, 9, 16, 12, 17, 15};

        int quantidadePares = contarPares(x);

        System.out.println("A quantidade de valores pares em X é: " + quantidadePares);
    }

    public static int contarPares(int[] x) {
        int quantidadePares = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        return quantidadePares;
    }
}
