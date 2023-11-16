//Crie uma sub-rotina que gere e mostre os três primeiros números primos acima de 100.

public class Atividade18 {
    public static void main(String[] args) {
        tresPrimosAcimaDe100();
    }

    public static void tresPrimosAcimaDe100() {
        int conta = 0;
        int numAtual = 101;

        while (conta < 3) {
            if (Primo(numAtual)) {
                System.out.println(numAtual);
                conta++;
            }
            numAtual++;
        }
    }

    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
