//'Elabore uma sub-rotina que leia um número não determinado de valores positivos e retorne
// a média aritmética desses valores. Terminar a entrada de dados com o valor zero.'
import java.util.Scanner;

public class Atividade07 {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        double media = calcularMedia(entrada);

        System.out.println("A média é: " + media);
        entrada.close();
    }
    public static double calcularMedia(Scanner entrada) {
        double soma = 0;
        int quantidadeValores = 0;

        System.out.println("Digite valores positivos:");

        while (true) {
            double valor = entrada.nextDouble();

            if (valor == 0) {
                break;
            }

            if (valor > 0) {
                soma += valor;
                quantidadeValores++;
            } else {
                System.out.println("Digite apenas valores positivos.");
            }
        }

        if (quantidadeValores > 0) {
            return soma / quantidadeValores;
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
            return 0;
        }
    }
}
