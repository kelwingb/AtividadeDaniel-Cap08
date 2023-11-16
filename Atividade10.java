//Elabore uma sub-rotina que receba como parâmetro um valor N (inteiro e maior ou igual a 1) e determine o valor da sequência S, descrita a seguir:
//S = 1 + 1/2 + 1/3...
//Observação
//A quantidade de parcelas que compõe S é igual a N. em java
import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int N=0;
        double resultado = calcularSequenciaS(N, entrada);
        System.out.println("O valor da sequência S para N = " + " é: " + resultado);
    }


    public static double calcularSequenciaS(int N, Scanner entrada) {
        if (N <= 1) {
            System.out.println("Por favor, insira um valor N maior ou igual a 1.");
            N = entrada.nextInt();
        }

        double soma = 0;

        for (int i = 1; i <= N; i++) {
            soma += 1.0 / i;
        }

        return soma;
    }
}

