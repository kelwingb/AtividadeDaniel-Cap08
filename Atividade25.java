//Crie um programa que receba o número dos 10 alunos de uma sala, armazenando-os em um vetor, junto
//com as notas obtidas ao longo do semestre (foram realizadas quatro avaliações). Elabore sub-rotinas para:
//determinar e mostrar a média aritmética de todos os alunos;
//indicar os números dos alunos que deverão fazer recuperação, ou seja, aqueles com média inferior a 6.
//Todas as mensagens deverão ser mostradas no programa principal

import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int[] numerosAlunos = new int[10];
        double[][] notasAlunos = new double[10][4];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número do aluno " + (i + 1) + ": ");
            numerosAlunos[i] = entrada.nextInt();

            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notasAlunos[i][j] = entrada.nextDouble();
            }
        }

        double mediaGeral = calcularEMostrarMediaAritmetica(notasAlunos);
        System.out.println("Média aritmética de todos os alunos: " + mediaGeral);

        identificarEMostrarAlunosRecuperacao(numerosAlunos, notasAlunos);

        entrada.close();
    }

    public static double calcularEMostrarMediaAritmetica(double[][] notasAlunos) {
        double somaTotal = 0.0;

        for (int i = 0; i < 10; i++) {
            double somaNotas = 0.0;
            for (int j = 0; j < 4; j++) {
                somaNotas += notasAlunos[i][j];
            }
            double mediaAluno = somaNotas / 4;
            somaTotal += mediaAluno;
        }

        double mediaGeral = somaTotal / 10;

        return mediaGeral;
    }

    public static void identificarEMostrarAlunosRecuperacao(int[] numerosAlunos, double[][] notasAlunos) {
        System.out.println("\nAlunos que precisarão de recuperação:");

        for (int i = 0; i < 10; i++) {
            double somaNotas = 0.0;
            for (int j = 0; j < 4; j++) {
                somaNotas += notasAlunos[i][j];
            }
            double mediaAluno = somaNotas / 4;

            if (mediaAluno < 6) {
                System.out.println("Aluno " + numerosAlunos[i] + ", Média: " + mediaAluno);
            }
        }
    }
}
