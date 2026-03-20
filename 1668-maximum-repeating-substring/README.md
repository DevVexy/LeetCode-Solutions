# Máximo de Substring Repetida (Maximum Repeating Substring)

## Descrição do Problema

Dada uma string `sequence` e uma string `word`, uma repetição de `word` $k$ vezes é chamada de **k-repeating**. O objetivo é encontrar o valor máximo de $k$ tal que `word` repetida $k$ vezes seja uma substring de `sequence`.

Se `word` não estiver em `sequence`, o valor máximo é `0`.

## Lógica da Solução

Dada a restrição pequena (comprimento máximo de 100 para ambas as strings), a solução mais simples e eficiente é a **construção iterativa**:

1.  **Inicialização:** Começamos com $k = 1$ e criamos uma string temporária que é a repetição da `word`.
2.  **Busca Progressiva:** Verificamos se `word` repetida $k$ vezes existe dentro de `sequence` (usando o método `.contains()` do Java).
3.  **Incremento:** Enquanto a condição for verdadeira, incrementamos $k$ e adicionamos outra instância de `word` à nossa string de busca.
4.  **Resultado:** O maior valor de $k$ que passou no teste é a nossa resposta.

### Complexidade
* **Tempo:** $O(N^2 / M)$, onde $N$ é o comprimento de `sequence` e $M$ o de `word`. No pior caso, as concatenações e buscas dentro do loop resultam em uma complexidade quadrática aceitável para $N, M \le 100$.
* **Espaço:** $O(N)$, para armazenar a string repetida que está sendo testada.