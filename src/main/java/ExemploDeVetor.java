package src.main.java;

public class ExemploDeVetor {
    public static void main(String[] args) {
        // Criando um vetor de inteiros com tamanho 5
        int[] vetor = new int[5];

        // Inicializando o vetor com alguns valores
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;

        // Acessando elementos individualmente
        int primeiroElemento = vetor[0];
        int segundoElemento = vetor[1];

        // Iterando sobre o vetor e imprimindo seus elementos
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }


    }
}
