# Two Sum 🟢

## Estratégia
Utilização de um **HashMap** para reduzir a busca de $O(n^2)$ para $O(n)$. Ao iterar pelo array, calculamos o `complemento` (alvo - número atual) e verificamos se ele já existe no mapa. Se sim, retornamos os índices.



## Complexidade
- **Tempo:** $O(n)$ - Uma única passagem pelo array.
- **Espaço:** $O(n)$ - Armazenamento de até $n$ elementos no mapa.