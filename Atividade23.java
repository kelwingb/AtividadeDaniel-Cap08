//Crie um programa que receba três valores (obrigatoriamente maiores que zero), representando as medidas dos três lados de um triângulo.
//Elabore sub-rotinas para:
//determinar se esses lados formam um triângulo (sabe-se que, para ser triângulo, a medida de um
//lado qualquer deve ser inferior ou igual à soma das medidas dos outros dois).
//determinar e mostrar o tipo de triângulo (equilátero, isósceles ou escaleno), caso as medidas formem um triângulo.
//Todas as mensagens deverão ser mostradas no programa principal

import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.print("Digite o lado 1: ");
        lado1 = entrada.nextDouble();

        System.out.print("Digite o lado 2: ");
        lado2 = entrada.nextDouble();

        System.out.print("Digite o lado 3: ");
        lado3 = entrada.nextDouble();

        if (formaTriangulo(lado1, lado2, lado3)) {
            String tipoTriangulo = identificarTipoTriangulo(lado1, lado2, lado3);
            System.out.println("Os lados formam um triângulo " + tipoTriangulo);
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        entrada.close();
    }

    public static boolean formaTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
    }

    public static String identificarTipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}
