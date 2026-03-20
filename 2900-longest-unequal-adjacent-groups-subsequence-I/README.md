# Maior Subsequência de Grupos Adjacentes Desiguais I

## Descrição do Problema

Você recebe um array de strings `words` e um array binário `groups`, ambos de comprimento $n$. 

Uma subsequência de `words` é **alternante** se, para quaisquer duas strings consecutivas na sequência, seus elementos correspondentes no array `groups` forem **diferentes** (ou seja, não pode haver 0 seguido de 0, ou 1 seguido de 1).

Seu objetivo é retornar a subsequência alternante **mais longa**. Se houver múltiplas respostas, qualquer uma será aceita.

## Lógica da Solução (Algoritmo Guloso)

A estratégia para maximizar o comprimento é simples: sempre que encontrarmos uma mudança de valor no array `groups` em relação ao último elemento que adicionamos à nossa subsequência, nós incluímos essa nova palavra.

1.  **Início:** Sempre incluímos a primeira palavra (`words[0]`), pois ela inicia nossa sequência.
2.  **Iteração:** Percorremos o array `groups` a partir do segundo elemento ($i = 1$).
3.  **Comparação:** Se o valor de `groups[i]` for diferente do valor do grupo da **última palavra adicionada**, incluímos `words[i]` na nossa lista de resultados.
4.  **Atualização:** Atualizamos o marcador do "último grupo visto" para o valor atual.

### Complexidade
* **Tempo:** $O(n)$, onde $n$ é o número de palavras. Percorremos o array apenas uma vez.
* **Espaço:** $O(n)$ no pior caso para armazenar a lista de resposta.