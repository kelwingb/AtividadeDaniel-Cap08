//. Crie uma sub-rotina que receba como parâmetro dois valores X e Z, calcule e retorne Xz
//        sem utilizar
//        funções ou operadores de potência prontos.
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Informe o valor de X: ");
        int x = entrada.nextInt();

        System.out.print("Informe o valor de Z: ");
        int z = entrada.nextInt();

        int resultado = calcularPotencia(x, z);

        System.out.println("Resultado: " + resultado);
    }

    public static int calcularPotencia(int x, int z) {
        int resultado = 1;

        for (int i = 0; i < z; i++) {
            resultado *= x;
        }

        return resultado;
    }
}
