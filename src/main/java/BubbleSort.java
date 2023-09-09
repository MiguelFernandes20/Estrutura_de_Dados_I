package src.main.java;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 3, 6};

        // Inicializa um vetor de inteiros com os valores não ordenados.

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                // Primeiro loop (i) controla o número de iterações.
                // Segundo loop (j) percorre o vetor para comparações.

                if (vetor[j] > vetor[j + 1]) {
                    // Verifica se o elemento atual é maior que o próximo.
                    // Se sim, realiza a troca dos elementos.

                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    // Realiza a troca dos elementos usando uma variável temporária 'temp'.
                }
            }
        }

        // Imprime o vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
