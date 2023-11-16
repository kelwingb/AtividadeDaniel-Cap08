//Foi realizada uma pesquisa entre 15 habitantes de uma região. Os dados coletados de cada habitante
//foram: idade, sexo, salário e número de filhos.
//Faça uma sub-rotina que leia esses dados armazenando-os em vetores. Depois, crie sub-rotinas que
//recebam esses vetores como parâmetro e retornem a média de salário entre os habitantes, a menor e a
//maior idade do grupo e a quantidade de mulheres com três filhos que recebem até R$ 500,00 (utilize
//uma sub-rotina para cada cálculo).

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        int tamanho = 15;

        int[] idades = new int[tamanho];
        char[] sexos = new char[tamanho];
        double[] salarios = new double[tamanho];
        int[] numFilhos = new int[tamanho];


        dadosDado(idades, sexos, salarios, numFilhos);

        System.out.println("Média de salário: " + calcularMediaSalario(salarios));
        System.out.println("Menor idade: " + encontrarMenorIdade(idades));
        System.out.println("Maior idade: " + encontrarMaiorIdade(idades));
        System.out.println("Mulheres com três filhos e salário até R$ 500,00: " +
                contarMulheresTresFilhosSalario500(sexos, numFilhos, salarios));
    }

    public static void dadosDado(int[] idades, char[] sexos, double[] salarios, int[] numFilhos) {
        var entrada = new Scanner(System.in);

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade do habitante " + (i + 1+"°") + ": ");
            idades[i] = entrada.nextInt();

            System.out.println("Digite o sexo (M/F) do habitante " + (i + 1+"°") + ": ");
            sexos[i] = entrada.next().charAt(0);

            System.out.println("Digite o salário do habitante " + (i + 1+"°") + ": ");
            salarios[i] = entrada.nextDouble();

            System.out.println("Digite o número de filhos do habitante " + (i + 1+"°") + ": ");
            numFilhos[i] = entrada.nextInt();

            entrada.close();
        }
    }
    public static double calcularMediaSalario(double[] salarios) {
        double somaSalarios = 0;

        for (double salario : salarios) {
            somaSalarios += salario;
        }

        return somaSalarios / salarios.length;
    }
    public static int encontrarMenorIdade(int[] idades) {
        int menorIdade = idades[0];

        for (int idade : idades) {
            if (idade < menorIdade) {
                menorIdade = idade;
            }
        }

        return menorIdade;
    }
    public static int encontrarMaiorIdade(int[] idades) {
        int maiorIdade = idades[0];

        for (int idade : idades) {
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
        }

        return maiorIdade;
    }
    public static int contarMulheresTresFilhosSalario500(char[] sexos, int[] numFilhos, double[] salarios) {
        int contagem = 0;

        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 'F' && numFilhos[i] == 3 && salarios[i] <= 500.00) {
                contagem++;
            }
        }

        return contagem;
    }
}
