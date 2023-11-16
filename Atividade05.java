//Faça uma sub-rotina que receba um valor inteiro e verifique se ele é positivo ou negativo.

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int x;
        System.out.println("Informe um número: ");
        x = entrada.nextInt();

        veri(x);
    }
    public static void veri(int x) {
        if (x < 0) {
            System.out.println("Esse número é negativo");
        } else if (x == 0){
            System.out.println("O número é zero");
        } else{
            System.out.println("esse número é positivo");
        }
    }
}
