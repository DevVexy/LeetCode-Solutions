### 33. Search in Rotated Sorted Array 🟡
**Abordagem:** Modified Binary Search ($O(\log n)$).
- A lógica chave é determinar em cada iteração qual metade do array é contínua (ordenada).
- Resolvemos o problema em tempo logarítmico sem precisar encontrar o pivô de rotação explicitamente.