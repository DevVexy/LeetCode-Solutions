# Median of Two Sorted Arrays 🔴

## Estratégia
**Busca Binária na Partição**. Em vez de mesclar os arrays, dividimos ambos de forma que a metade esquerda contenha elementos menores que a direita. A busca é feita no menor array para garantir eficiência logarítmica.



## Complexidade
- **Tempo:** $O(\log(\min(m, n)))$ - Atende à restrição de alta performance.
- **Espaço:** $O(1)$ - Apenas variáveis de controle de índice.