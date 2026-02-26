# Concatenation of Array 🟢

## Estratégia
Mapeamento direto com **Offset**. Criamos um array de tamanho $2n$ e, em um único loop, atribuímos o valor `nums[i]` às posições `i` e `i + n`.

## Complexidade
- **Tempo:** $O(n)$ - Loop linear simples.
- **Espaço:** $O(1)$ - (Excluindo o array de saída).