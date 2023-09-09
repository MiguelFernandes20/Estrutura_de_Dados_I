package src.main.java;

public class MergeSort {
    public static void main(String[] args) {
        int[] vetor = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(vetor, 0, vetor.length - 1);

        // Imprime o vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            // Encontra o meio do vetor
            int meio = (esquerda + direita) / 2;

            // Ordena as metades esquerda e direita
            mergeSort(vetor, esquerda, meio);
            mergeSort(vetor, meio + 1, direita);

            // Mescla as metades ordenadas
            merge(vetor, esquerda, meio, direita);
        }
    }

    public static void merge(int[] vetor, int esquerda, int meio, int direita) {
        int tamanhoEsquerda = meio - esquerda + 1;
        int tamanhoDireita = direita - meio;

        int[] vetorEsquerda = new int[tamanhoEsquerda];
        int[] vetorDireita = new int[tamanhoDireita];

        // Copia os elementos para os vetores temporários
        for (int i = 0; i < tamanhoEsquerda; i++) {
            vetorEsquerda[i] = vetor[esquerda + i];
        }
        for (int i = 0; i < tamanhoDireita; i++) {
            vetorDireita[i] = vetor[meio + 1 + i];
        }

        // Mescla os vetores temporários de volta ao vetor original
        int i = 0, j = 0, k = esquerda;
        while (i < tamanhoEsquerda && j < tamanhoDireita) {
            if (vetorEsquerda[i] <= vetorDireita[j]) {
                vetor[k] = vetorEsquerda[i];
                i++;
            } else {
                vetor[k] = vetorDireita[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes dos vetores temporários, se houver
        while (i < tamanhoEsquerda) {
            vetor[k] = vetorEsquerda[i];
            i++;
            k++;
        }
        while (j < tamanhoDireita) {
            vetor[k] = vetorDireita[j];
            j++;
            k++;
        }
    }
}
