# Triângulo de Pascal II (Otimizado)

## Descrição do Problema

Dado um índice de linha `rowIndex`, retorne apenas aquela linha específica (0-indexada) do Triângulo de Pascal.

**Desafio Adicional:** Otimizar o algoritmo para usar apenas $O(rowIndex)$ de espaço extra.

## Lógica da Solução Otimizada

Para economizar memória, não precisamos armazenar as linhas anteriores. Podemos usar uma única lista e atualizá-la de trás para frente.

### Por que de trás para frente?
Se atualizarmos a lista da esquerda para a direita, sobrescreveremos os valores da "linha acima" que ainda seriam necessários para calcular o próximo elemento. Ao atualizar da **direita para a esquerda**, garantimos que os valores que estamos somando ainda pertencem à iteração anterior.



### Exemplo de Atualização (rowIndex = 3):
1.  **Inicial:** `[1, 0, 0, 0]`
2.  **i = 1:** `[1, 1, 0, 0]`
3.  **i = 2:** `[1, 2, 1, 0]` (Calculado como: `1` mantido, `1+1=2`, `1` adicionado)
4.  **i = 3:** `[1, 3, 3, 1]` (Calculado como: `1`, `2+1=3`, `1+2=3`, `1`)