# É Subsequência (Is Subsequence)

## Descrição do Problema

Dadas duas strings `s` e `t`, retorne `true` se `s` for uma **subsequência** de `t`, ou `false` caso contrário.

Uma subsequência é formada a partir da string original deletando alguns (ou nenhum) caracteres sem alterar a posição relativa dos caracteres restantes. (Ex: `"ace"` é subsequência de `"abcde"`, mas `"aec"` não é).

## Lógica da Solução (Dois Ponteiros)

A abordagem mais eficiente para uma única comparação é utilizar dois ponteiros:

1.  **Ponteiro `i`** para a string `s`.
2.  **Ponteiro `j`** para a string `t`.
3.  Percorremos `t` com o ponteiro `j`. Sempre que o caractere `s[i]` for igual a `t[j]`, avançamos o ponteiro `i`.
4.  O ponteiro `j` sempre avança a cada iteração.
5.  Se ao final `i` for igual ao comprimento de `s`, significa que encontramos todos os caracteres na ordem correta.

### Complexidade
* **Tempo:** $O(T)$, onde $T$ é o comprimento da string `t`.
* **Espaço:** $O(1)$, pois usamos apenas dois inteiros como ponteiros.