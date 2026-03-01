### 102. Binary Tree Level Order Traversal 🟡
**Abordagem:** BFS (Queue).
- Utiliza uma fila para garantir a ordem de visitação da esquerda para a direita.
- O segredo da separação por níveis é capturar o `queue.size()` antes de iterar os nós de cada profundidade.
- Estrutura de dados essencial: `java.util.Queue` implementada por `LinkedList`.