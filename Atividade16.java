//Faça uma sub-rotina que receba um vetor X de 20 de números reais como parâmetro e retorne a soma
//dos elementos de X.

public class Atividade16 {
    public static void main(String[] args) {
        double[] vetor = {1.0, 2.5, 3.7, 4.2, 5.8, 6.4, 7.1, 8.9, 9.3, 10.6,
                11.2, 12.8, 13.4, 14.7, 15.3, 16.9, 17.5, 18.0, 19.6, 20.2};

        double resultado = calcularSoma(vetor);

        System.out.println("A soma dos números do vetor é: " + resultado);
    }
    public static double calcularSoma(double[] vetor) {
        double soma = 0.0;

        for (double elemento : vetor) {
            soma += elemento;
        }

        return soma;
    }
}

