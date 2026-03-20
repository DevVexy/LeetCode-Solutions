# Triângulo de Pascal (Pascal's Triangle)

## Descrição do Problema

Dado um número inteiro `numRows`, o objetivo é retornar as primeiras `numRows` do Triângulo de Pascal.

No Triângulo de Pascal, cada número é a soma dos dois números diretamente acima dele, conforme a regra matemática das combinações.

### Regras de Construção
1. A primeira linha é sempre `[1]`.
2. Cada linha subsequente começa e termina com o número `1`.
3. Cada valor intermediário em uma linha é a soma dos dois valores localizados na linha anterior, nas posições imediatamente acima (esquerda e direita).



## Lógica da Solução

Para construir o triângulo de forma eficiente, utilizamos uma abordagem de **Programação Dinâmica** simples:

1.  **Iteração de Linhas:** Percorremos de `0` até `numRows - 1`.
2.  **Criação da Linha:** Para cada linha `i`, criamos uma lista com `i + 1` elementos.
3.  **Cálculo dos Valores:**
    * Se for o primeiro (`j = 0`) ou o último (`j = i`) elemento, atribuímos **1**.
    * Caso contrário, o valor será: `triangulo[i-1][j-1] + triangulo[i-1][j]`.

### Complexidade
* **Tempo:** $O(n^2)$, onde $n$ é o número de linhas, pois calculamos cada elemento do triângulo uma única vez.
* **Espaço:** $O(n^2)$, necessário para armazenar a estrutura de listas aninhadas.
