package src.main.java;

public class CombSort {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 3, 6};

        combSort(vetor);

        // Imprime o vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void combSort(int[] vetor) {
        int n = vetor.length;
        int fatorEncolhimento = (int) (n / 1.3);
        boolean troca = true;

        while (fatorEncolhimento > 1 || troca) {
            fatorEncolhimento = Math.max(1, (int) (fatorEncolhimento / 1.3));
            troca = false;

            for (int i = 0; i + fatorEncolhimento < n; i++) {
                if (vetor[i] > vetor[i + fatorEncolhimento]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + fatorEncolhimento];
                    vetor[i + fatorEncolhimento] = temp;
                    troca = true;
                }
            }
        }
    }
}
