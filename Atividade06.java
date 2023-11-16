//Crie uma sub-rotina que receba como parâmetro a altura (alt) e o sexo de uma pessoa e retorne seu peso ideal.
//Para homens, deverá calcular o peso ideal usando a fórmula: peso ideal = 72.7 *alt − 58; para mulheres: peso
//ideal = 62.1 *alt − 44.7.


import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        double alt;
        char sexo;

        System.out.println("Informe sua altura: ");
        alt = entrada.nextDouble();
        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        sexo = entrada.next().charAt(0);

        double result = altSexo(alt,sexo);
        System.out.println("O peso ideal é: " + result);
    }

    public static double altSexo(double alt, char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            return 72.7 * alt - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            return 62.1 * alt - 44.7;
        } else {
            System.out.println("Sexo inválido. Insira M para masculino ou F para feminino.");
            return 0;
        }
    }
}
