# Melhor Momento para Comprar e Vender Ações (Stock Profit)

## Descrição do Problema

Dado um array `prices` onde `prices[i]` é o preço de uma determinada ação no dia `i`.

Você deseja maximizar seu lucro escolhendo **um único dia** para comprar uma ação e escolhendo um **dia diferente no futuro** para vendê-la.

Retorne o lucro máximo que você pode obter. Se não for possível obter lucro, retorne `0`.

### Restrição Chave
Você deve comprar antes de vender. Não é permitido vender no dia 1 e comprar no dia 2.

## Lógica da Solução (Abordagem One-Pass)

Para resolver este problema de forma eficiente em **tempo linear**, utilizamos uma estratégia gulosa:

1.  **Manter o Menor Preço:** Enquanto percorremos o array, guardamos o menor valor encontrado até o momento (`minPrice`).
2.  **Calcular Lucro Potencial:** Para cada novo preço, calculamos quanto ganharíamos se tivéssemos comprado no `minPrice` anterior e vendido hoje.
3.  **Atualizar Lucro Máximo:** Se esse lucro potencial for maior que o nosso lucro máximo atual (`maxProfit`), nós o atualizamos.

### Complexidade
* **Tempo:** $O(n)$, onde $n$ é o número de dias, pois percorremos o array apenas uma vez.
* **Espaço:** $O(1)$, pois usamos apenas duas variáveis extras.