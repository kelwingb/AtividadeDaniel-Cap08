//Crie uma sub-rotina que receba como parâmetro um valor inteiro e positivo e retorne a
// soma dos divisores desse valor


import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();


        int result = somaDivi(numero);
        System.out.println("O soma dos divisores desse " + numero + " é: " + result);
        entrada.close();
    }

    public static int somaDivi(int numero) {
        if (numero < 0) {
            System.out.println("Insira um número positivo.");
            return -1;
        }
        int soma = 0;

        for (int i = 1; i <= numero; i++) {
           if (numero % i == 0){
               soma+= i;
           }
        }
        return soma;
    }
}
