# N-ésimo Número de Tribonacci

## Descrição do Problema

A sequência de Tribonacci $T_n$ é definida da seguinte forma:
* $T_0 = 0, T_1 = 1, T_2 = 1$
* $T_{n+3} = T_n + T_{n+1} + T_{n+2}$ para $n \ge 0$.

Dado um número inteiro `n`, retorne o valor de $T_n$.

## Lógica da Solução (Janela Deslizante / DP)

Para calcular o $n$-ésimo termo de forma eficiente em **tempo linear**, não precisamos de recursão (que seria extremamente lenta). Utilizamos uma abordagem de **Programação Dinâmica** com espaço otimizado:

1.  **Casos Base:** Tratamos diretamente se $n$ for 0, 1 ou 2.
2.  **Estado:** Mantemos três variáveis que representam os três últimos valores calculados ($T_{i-3}, T_{i-2}, T_{i-1}$).
3.  **Transição:** A cada iteração, o novo valor é a soma dessas três variáveis. Em seguida, "deslizamos" a janela: o mais antigo é descartado e o novo é incluído.



### Complexidade
* **Tempo:** $O(n)$, pois percorremos de 3 até $n$ uma única vez.
* **Espaço:** $O(1)$, pois usamos apenas quatro variáveis de inteiros, independentemente do valor de $n$.