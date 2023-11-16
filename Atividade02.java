//Crie uma sub-rotina que receba três números inteiros como parâmetros, representando horas,
// minutos e segundos, e os converta em segundos.
// Exemplo: 2h, 40min e 10s correspondem a 9.610 segundos.


import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int h, m, s;
        System.out.println("Informe um número para as hora: ");
        h = entrada.nextInt();

        System.out.println("Informe um número para os minutos: ");
        m = entrada.nextInt();

        System.out.println("Informe um número para os segundos: ");
        s = entrada.nextInt();


        int totalSegundos = conversao(h,m,s);
        entrada.close();

        System.out.println("O total em segundos é: " + totalSegundos);
    }

    public static int conversao(int h, int m, int s) {
        if (h < 0 || m < 0 || s < 0) {
            System.out.println("Informe um valor que não seja negativo: ");
            return -1;
        }


        int totalSegundos = h * 3600 + m * 60 + s;

        return totalSegundos;
    }
}
