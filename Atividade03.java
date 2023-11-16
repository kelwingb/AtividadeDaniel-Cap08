//Elabore uma sub-rotina que receba dois números como parâmetros e retorne 0, se o primeiro número for
//divisível pelo segundo número. Caso contrário, deverá retornar o próximo divisor.


import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Digite um número: ");
        x = entrada.nextInt();

        System.out.println("Digite outro número: ");
        y = entrada.nextInt();

        if (x == 0){
            System.out.println("Número inválido");
        }

        int resultado = divi(x, y);


        if (resultado == 0) {
            System.out.println(x + " " + "é divisível por" + " " + y);
        } else {
            System.out.println("O próximo divisor de " + x + " em relação a " + y + " é " + resultado);
        }

        entrada.close();
    }


    public static int divi(int x, int y) {
        if (x % y == 0) {
            return 0;
        } else {
            int proximoDivisor = ((x / y) +1) * y;
            return proximoDivisor;
        }
    }
}
