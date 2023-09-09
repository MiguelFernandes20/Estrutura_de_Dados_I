package src.main.java;

public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 3, 6};

        quickSort(vetor, 0, vetor.length - 1);

        // Imprime o vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            // Encontra o índice do pivô após o particionamento
            int indicePivo = partition(vetor, esquerda, direita);

            // Ordena as metades esquerda e direita do pivô recursivamente
            quickSort(vetor, esquerda, indicePivo - 1);
            quickSort(vetor, indicePivo + 1, direita);
        }
    }

    public static int partition(int[] vetor, int esquerda, int direita) {
        int pivot = vetor[direita]; // Escolhe o pivô (geralmente o último elemento)
        int i = (esquerda - 1); // Índice do menor elemento

        for (int j = esquerda; j < direita; j++) {
            // Se o elemento atual for menor ou igual ao pivô
            if (vetor[j] <= pivot) {
                i++;

                // Troca vetor[i] e vetor[j]
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        // Troca vetor[i+1] e vetor[direita] (pivô)
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[direita];
        vetor[direita] = temp;

        return i + 1;
    }
}

