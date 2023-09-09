package src.main.java;

public class HeapSort {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 3, 6};

        heapSort(vetor);

        // Imprime o vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void heapSort(int[] vetor) {
        int n = vetor.length;

        // Constrói o heap (max-heap)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vetor, n, i);
        }

        // Remove elementos um por um do heap e coloca no vetor ordenado
        for (int i = n - 1; i > 0; i--) {
            // Move o elemento raiz (maior) para o final do vetor
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;

            // Reconstroi o heap com os elementos restantes
            heapify(vetor, i, 0);
        }
    }

    public static void heapify(int[] vetor, int n, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        // Encontra o maior entre o nó raiz, o nó da esquerda e o nó da direita
        if (esquerda < n && vetor[esquerda] > vetor[maior]) {
            maior = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[maior]) {
            maior = direita;
        }

        // Se o maior não for o nó raiz, troca os elementos e reconstroi o heap
        if (maior != i) {
            int temp = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = temp;

            heapify(vetor, n, maior);
        }
    }
}
