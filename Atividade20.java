//A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e o
//número de filhos. Faça uma sub-rotina que leia esses dados para um número não determinado de pessoas
//e retorne a média de salário da população, a média do número de filhos, o maior salário e o percentual
//de pessoas com salário inferior a R$ 380,00.

import java.util.Scanner;

public class Atividade20{
    public static void main(String[] args) {
        analisarDadosHabitantes();
    }

    public static void analisarDadosHabitantes() {
        var entrada = new Scanner(System.in);

        double totalSalario = 0;
        int totalFilhos = 0;
        double maiorSalario = 0;
        int contPessoasSalarioAbaixo380 = 0;

        System.out.println("Entre com os dados dos habitantes. Para encerrar, digite um salário negativo.");

        while (true) {
            System.out.print("Salário: R$ ");
            double salario = entrada.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Número de filhos: ");
            int numFilhos = entrada.nextInt();

            totalSalario += salario;
            totalFilhos += numFilhos;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario < 380) {
                contPessoasSalarioAbaixo380++;
            }
        }

        entrada.close();

        double mediaSalario = totalSalario / contPessoasSalarioAbaixo380;
        double mediaFilhos = (double) totalFilhos / contPessoasSalarioAbaixo380;

        double percentualSalarioAbaixo380 = (contPessoasSalarioAbaixo380 / (double) contPessoasSalarioAbaixo380) * 100;

        System.out.println("\nResultados:");
        System.out.println("Média de salário: R$ " + mediaSalario);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário: R$ " + maiorSalario);
        System.out.println("Percentual de pessoas com salário inferior a R$ 380,00: " + percentualSalarioAbaixo380 + "%");
    }
}
