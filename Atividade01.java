//Faça uma sub-rotina que receba um número inteiro e positivo N como parâmetro e retorne
// a soma dos números inteiros existentes entre o número 1 e N (inclusive).


import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);
        int n;
        System.out.println("Informe um número Inteiro: ");
        n = entrada.nextInt();

        entrada.close();
        int resultado = soma(n);
        System.out.println("A soma dos números de 1 a " + n + " é: " + resultado);
    }

    public static int soma(int n) {
        if (n <= 0) {
            System.out.println("Informe um número positivo: ");
            return -1;
        }
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }


        return soma;
    }
}