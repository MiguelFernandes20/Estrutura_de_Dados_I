package src.main.java;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 3, 6};

        // Itera sobre todo o vetor, exceto o último elemento
        for (int i = 0; i < vetor.length - 1; i++) {
            // Encontra o índice do menor elemento na parte não ordenada
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Troca o menor elemento com o elemento na posição atual
            int temp = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = temp;
        }

        // Imprime o vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
