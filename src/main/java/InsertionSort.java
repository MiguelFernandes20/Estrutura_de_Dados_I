package src.main.java;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 3, 6};

        // Itera sobre o vetor começando do segundo elemento (índice 1)
        for (int i = 1; i < vetor.length; i++) {
            int elementoAtual = vetor[i]; // Armazena o elemento atual a ser inserido
            int j = i - 1; // Inicializa j com o índice do elemento anterior na parte ordenada

            // Move os elementos maiores para a direita para abrir espaço para o elemento atual
            while (j >= 0 && vetor[j] > elementoAtual) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            // Insere o elemento atual na posição correta
            vetor[j + 1] = elementoAtual;
        }

        // Imprime o vetor ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
