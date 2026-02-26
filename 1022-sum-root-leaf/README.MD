# Sum of Root To Leaf Binary Numbers 🟢

## Estratégia
**DFS (Depth First Search)** com Manipulação de Bits. Conforme descemos na árvore, deslocamos o valor acumulado para a esquerda (`<< 1`) e adicionamos o valor do nó atual (`| val`).



## Complexidade
- **Tempo:** $O(n)$ - Visita todos os nós da árvore.
- **Espaço:** $O(h)$ - Pilha de recursão proporcional à altura da árvore.