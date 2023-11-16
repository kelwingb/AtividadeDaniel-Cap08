//Faça uma sub-rotina que receba um valor inteiro e positivo, calcule e mostre seu fatorial.

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = entrada.nextInt();

        int result = calcularFatorial(numero);
        System.out.println("O fatorial do " + numero + " é: " + result);
        entrada.close();
    }

    public static int calcularFatorial(int numero){
            if (numero < 0) {
                System.out.println("Não foi definido para fazer fatorial de números negativos.");
                return -1;
            }
         int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
