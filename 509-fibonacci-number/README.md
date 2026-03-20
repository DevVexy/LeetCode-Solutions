# Número de Fibonacci

## Descrição do Problema

A sequência de Fibonacci, comumente denotada por $F(n)$, forma uma sequência onde cada número é a soma dos dois anteriores, começando de 0 e 1.

### Definição Matemática:
* $F(0) = 0, F(1) = 1$
* $F(n) = F(n - 1) + F(n - 2)$ para $n > 1$.

Dado um número inteiro `n`, calcule $F(n)$.

## Abordagens de Solução

### 1. Recursão Simples (Ineficiente)
Calcula repetidamente os mesmos subproblemas.
* **Complexidade:** $O(2^n)$
* **Problema:** Para $n=30$, o número de chamadas cresce exponencialmente.



### 2. Programação Dinâmica (Iterativa) - Ótima
Em vez de recalcular, armazenamos apenas os dois últimos valores necessários para calcular o próximo.
* **Tempo:** $O(n)$
* **Espaço:** $O(1)$ (Usando apenas duas variáveis).