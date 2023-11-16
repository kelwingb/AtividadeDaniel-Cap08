//Faça uma sub-rotina que receba como parâmetro o raio de uma esfera, calcule e mostre no programa principal
//o seu volume: v = 4/3 * R3
//.

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        double R;

        System.out.println("Informe o raio da esfera: ");
        R = entrada.nextDouble();

        double volume = raioEsfera(R);
        System.out.println("O volume do raio da esfera é: " + volume);

        entrada.close();
    }
    public static double raioEsfera(double R) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(R, 3);
        return volume;
    }
}
