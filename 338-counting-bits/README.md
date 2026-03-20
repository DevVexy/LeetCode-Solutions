# Contagem de Bits (Counting Bits)

## Descrição do Problema

Dado um número inteiro `n`, retorne um array `ans` de comprimento `n + 1` tal que, para cada `i` ($0 \le i \le n$), `ans[i]` seja o número de **1s** na representação binária de `i`.

### Desafio
Implementar em tempo linear $O(n)$ e em uma única passagem, sem utilizar funções prontas de contagem de bits.

## Lógica da Solução (Programação Dinâmica)

A solução ótima baseia-se na relação entre um número e seus bits anteriores. Existem duas formas comuns de observar isso:

### 1. Padrão Par/Ímpar (Bit Menos Significativo)
* Se um número é **par** (ex: $10_{10} = 1010_2$), ele tem a mesma quantidade de bits '1' que a sua metade ($5_{10} = 101_2$), pois o último bit é 0.
* Se um número é **ímpar** (ex: $11_{10} = 1011_2$), ele tem a mesma quantidade de bits da sua metade mais um, pois o último bit é 1.

**Fórmula:** $ans[i] = ans[i / 2] + (i \pmod 2)$

### 2. Removendo o Bit Mais à Direita
Podemos usar o truque de manipulação de bits $i \ \& \ (i - 1)$, que remove o bit '1' mais à direita de um número. 
Por exemplo, se $i = 6$ ($110_2$), então $6 \ \& \ 5$ resulta em $4$ ($100_2$). 
O número de bits de 6 será $1 +$ o número de bits de 4.

**Fórmula:** $ans[i] = ans[i \ \& \ (i - 1)] + 1$