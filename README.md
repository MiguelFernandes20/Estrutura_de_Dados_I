# Estrutura de dados I

Este repositório tem como objetivo documentar o aprendizado abordado na disciplina de Estrutura de Dados I do curso de Bacharelado em Sistemas de Informação, começando com conceitos de vetores e progredindo em direção às estruturas de dados lineares.

# Vetores: Uma Explicação Básica
# O que são Vetores:
Em matemática e programação, um vetor é uma estrutura de dados que armazena uma coleção ordenada de elementos, geralmente do mesmo tipo. Cada elemento é acessado por um índice único, que começa em 0 para o primeiro elemento, 1 para o segundo e assim por diante. Os vetores são frequentemente utilizados para armazenar informações relacionadas de forma organizada e para realizar operações em massa em seus elementos.

# Utilização de Vetores:
 Os vetores têm uma ampla variedade de aplicações em ciência da computação e matemática, incluindo:
1.	Armazenamento de Dados: Vetores são usados para armazenar coleções de elementos, como números, strings, objetos, etc. Por exemplo, um vetor pode ser usado para armazenar as notas de alunos em uma turma.
2.	Iteração e Processamento em Massa: É fácil percorrer todos os elementos de um vetor e realizar operações em cada um deles. Isso é útil para cálculos estatísticos, ordenação, busca e muito mais.
3.	Implementação de Estruturas de Dados: Vetores podem ser usados como blocos de construção para criar estruturas de dados mais complexas, como listas, pilhas, filas e matrizes.
4.	Manipulação de Imagens e Gráficos: Em computação gráfica e processamento de imagens, vetores são usados para representar pontos, cores, vetores de deslocamento e muito mais.

# O que Pode ser Feito com Vetores:
•	Acesso rápido a elementos por meio de índices.
•	Inserção e remoção de elementos em posições específicas.
•	Realização de operações matemáticas em todos os elementos do vetor.
•	Ordenação, pesquisa e filtragem dos elementos.
•	Implementação eficiente de estruturas de dados dinâmicas, como listas.

# O que Não Pode ser Feito com Vetores:
•	Vetores têm tamanho fixo após a sua criação. Se você precisar de uma coleção de tamanho variável, deve usar estruturas de dados como listas ligadas ou dinâmicas.
•	Inserções e remoções em vetores podem ser lentas quando muitos elementos estão envolvidos, pois requerem realocação de memória.
•	Vetores são estruturas unidimensionais, então não podem representar dados multidimensionais diretamente. Para isso, você precisaria de matrizes ou vetores de vetores. 


# Introdução às Estruturas de Dados:
As estruturas de dados são componentes fundamentais da ciência da computação que permitem organizar, armazenar e gerenciar dados de maneira eficiente. Elas desempenham um papel crítico no desenvolvimento de algoritmos e na otimização de programas para lidar com informações. Existem várias estruturas de dados disponíveis, cada uma com suas características e usos específicos, incluindo vetores, listas ligadas, árvores, grafos, pilhas e filas, entre outras.

# Bubble Sort:
O Bubble Sort é um algoritmo de ordenação simples, mas ineficiente em termos de desempenho. Ele é chamado "Bubble" porque os elementos maiores "borbulham" para a extremidade direita do vetor à medida que o algoritmo progride. O algoritmo funciona comparando pares de elementos adjacentes no vetor e trocando-os se estiverem fora de ordem. Esse processo é repetido várias vezes até que todo o vetor esteja ordenado.

# Como o Bubble Sort Funciona:
1.	O algoritmo começa comparando o primeiro elemento com o segundo. Se o primeiro elemento for maior que o segundo, eles são trocados.
2.	Em seguida, ele compara o segundo elemento com o terceiro e faz a troca, se necessário.
3.	Esse processo continua até o penúltimo elemento, e o maior elemento na primeira iteração "sobe" para a última posição.
4.	O algoritmo então repete o processo para os elementos restantes (exceto o último, que já está na posição correta) até que todo o vetor esteja ordenado.

# Selection Sort
é um algoritmo de ordenação simples e ineficiente que opera encontrando repetidamente o menor (ou maior, dependendo da ordem desejada) elemento a partir da parte não ordenada do vetor e o colocando na posição correta na parte ordenada. Esse processo é repetido até que todo o vetor esteja ordenado.

# Aqui estão os passos específicos do funcionamento do Selection Sort:
1.	Inicialmente, o vetor inteiro é considerado como a parte não ordenada.
2.	O algoritmo encontra o menor elemento na parte não ordenada, percorrendo todos os elementos e comparando-os uns com os outros.
3.	Uma vez encontrado o menor elemento, ele é trocado com o primeiro elemento da parte não ordenada, colocando-o na primeira posição da parte ordenada.
4.	A parte ordenada é expandida para incluir o elemento recém-colocado nela, e a parte não ordenada é reduzida em um elemento.
5.	O algoritmo repete os passos 2 a 4 até que a parte não ordenada esteja vazia, o que indica que todo o vetor está ordenado. 

# Insertion Sort 
é um algoritmo de ordenação que, à medida que percorre um vetor, constrói uma parte ordenada do vetor, um elemento de cada vez. Ele pega cada elemento do vetor e insere na posição correta na parte ordenada do vetor, movendo os elementos maiores para abrir espaço.

# Aqui está uma explicação passo a passo de como o Insertion Sort funciona:
1.	Inicialização: O primeiro elemento do vetor é considerado a parte ordenada (pois um único elemento é sempre ordenado por definição), e o restante do vetor é considerado a parte não ordenada.
2.	Iteração: O algoritmo percorre os elementos da parte não ordenada, um de cada vez, começando do segundo elemento.
3.	Comparação e Inserção: Para cada elemento na parte não ordenada, o algoritmo compara o elemento com os elementos na parte ordenada, começando pelo último elemento da parte ordenada e movendo-se para a esquerda.
4.	Se o elemento na parte ordenada for maior que o elemento sendo considerado, o elemento na parte ordenada é deslocado uma posição para a direita (abre espaço para o elemento atual).
5.	O processo de comparação e deslocamento continua até que o elemento correto seja encontrado na parte ordenada para o elemento atual, ou seja, até que todos os elementos na parte ordenada sejam menores que o elemento atual.
6.	O elemento atual é então inserido na posição correta na parte ordenada.
7.	O processo de iteração, comparação, deslocamento e inserção é repetido para todos os elementos na parte não ordenada.
8.	O vetor inteiro é agora considerado ordenado quando a parte não ordenada estiver vazia. 

# O Bogo Sort 
é um algoritmo de ordenação extremamente ineficiente e impraticável. Ele é muitas vezes usado como um exemplo de como não se deve ordenar um conjunto de dados. A característica distintiva do Bogo Sort é que ele gera aleatoriamente permutações dos elementos do vetor até que uma permutação seja encontrada na qual o vetor esteja ordenado. Como é baseado em sorteio aleatório, não há garantia de que ele irá ordenar o vetor em um tempo razoável, e não é adequado para uso em aplicações do mundo real.

# O Merge Sort
é um algoritmo de ordenação eficiente e divide para conquistar que é amplamente utilizado para ordenar coleções de dados. Ele é conhecido por sua eficiência e estabilidade, o que significa que a ordem relativa dos elementos iguais no vetor original é preservada na ordenação final.

# Aqui está uma explicação passo a passo de como o Merge Sort funciona:
1.	Divisão: O vetor não ordenado é dividido em duas metades iguais. Este passo é repetido recursivamente até que cada subconjunto tenha apenas um elemento (caso base da recursão).
2.	Conquista: Cada subconjunto de um único elemento é considerado ordenado.
3.	Combinar (Merge): As metades ordenadas são mescladas para formar um único vetor ordenado. Durante a mesclagem, os elementos são comparados e colocados na ordem correta no vetor resultante. 

# O Heap Sort
é um algoritmo de ordenação que utiliza uma estrutura de dados chamada heap (ou árvore binária) para ordenar um vetor. Ele é conhecido por sua eficiência e é utilizado em várias aplicações de ordenação. O Heap Sort possui uma complexidade de tempo de O(n log n), tornando-o uma escolha eficiente para ordenar grandes conjuntos de dados.

# Aqui está uma explicação passo a passo de como o Heap Sort funciona:
1.	Construção do Heap: O primeiro passo do Heap Sort é construir uma estrutura de heap a partir do vetor não ordenado. Um heap é uma árvore binária especial onde cada nó (pai) tem valores menores ou iguais aos seus nós filhos (filhos à esquerda e à direita). O maior elemento do vetor estará na raiz do heap (se estivermos ordenando em ordem crescente).
2.	Ordenação: Depois de construir o heap, o maior elemento (raiz do heap) é removido e colocado na posição final do vetor. O heap é então reconstruído com os elementos restantes.
3.	Repetição: Os passos 2 são repetidos até que todos os elementos tenham sido removidos do heap e colocados no vetor na ordem correta.
4.	Resultado: No final do processo, o vetor estará totalmente ordenado. 

# O Quick Sort
é um algoritmo de ordenação muito eficiente e amplamente utilizado. Ele pertence à categoria de algoritmos de ordenação "dividir para conquistar", e sua complexidade média de tempo é O(n log n), tornando-o adequado para ordenar grandes conjuntos de dados.

# Aqui está uma explicação passo a passo de como o Quick Sort funciona:
1.	Escolha do Pivô: O primeiro passo do Quick Sort é escolher um elemento do vetor como pivô. O pivô é um elemento que dividirá o vetor em duas partes: elementos menores que o pivô à esquerda e elementos maiores que o pivô à direita.
2.	Particionamento: O vetor é particionado em torno do pivô de tal forma que, após o particionamento, todos os elementos à esquerda do pivô são menores que o pivô, e todos os elementos à direita do pivô são maiores que o pivô. O pivô é agora na sua posição final.
3.	Recursão: O Quick Sort é aplicado recursivamente às duas metades do vetor resultantes do passo anterior, uma metade à esquerda do pivô e outra metade à direita do pivô. Isso é feito até que todo o vetor esteja ordenado.
4.	Combinação: Não é necessário um passo de combinação, pois o vetor é ordenado "in-place", o que significa que não são criadas cópias adicionais do vetor.

# O Comb Sort
é um algoritmo de ordenação baseado no algoritmo Bubble Sort, mas com melhorias significativas em termos de eficiência. Ele foi projetado para superar as limitações do Bubble Sort e tem uma complexidade de tempo média de O(n^2/2^p), onde "n" é o número de elementos no vetor e "p" é o número de iterações (ou fatores de encolhimento). Isso torna o Comb Sort mais eficiente do que o Bubble Sort em cenários de casos gerais.
Aqui está uma explicação simplificada de como o Comb Sort funciona:
1.	Definição dos Fatores de Encolhimento: O Comb Sort utiliza uma série de fatores de encolhimento (geralmente um valor próximo de 1.3) para determinar a distância entre os elementos que serão comparados e trocados. Inicialmente, o fator de encolhimento é escolhido de forma apropriada.
2.	Compara e Troca: O algoritmo começa comparando os elementos em pares a uma determinada distância (determinada pelo fator de encolhimento) e troca os elementos se estiverem fora de ordem.
3.	Redução do Fator de Encolhimento: Após cada passagem através do vetor, o fator de encolhimento é reduzido, o que efetivamente aumenta a distância entre os elementos que são comparados e trocados. O processo de comparação e troca continua até que o fator de encolhimento seja igual a 1.
4.	Ordenação Final: Após várias passagens através do vetor com diferentes fatores de encolhimento, o algoritmo continua a ordenar o vetor como o Bubble Sort tradicional até que nenhum elemento seja trocado durante uma passagem completa.





