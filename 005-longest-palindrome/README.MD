# Longest Palindromic Substring 🟡

## Estratégia
**Expansão a partir do Centro**. Consideramos cada caractere (e o espaço entre eles) como um centro e expandimos para as extremidades enquanto for um palíndromo. Evita o custo de memória da Programação Dinâmica.



## Complexidade
- **Tempo:** $O(n^2)$ - Expansão para cada um dos $2n-1$ centros.
- **Espaço:** $O(1)$ - Apenas ponteiros de início e fim.