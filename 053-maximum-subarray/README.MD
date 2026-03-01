### 53. Maximum Subarray 🟡
**Abordagem:** Algoritmo de Kadane ($O(n)$).
- Estratégia "Gulosa" (Greedy): em cada posição, avaliamos se o histórico acumulado ajuda ou atrapalha o valor atual.
- Se `currentSum` se torna negativo, ele é descartado e o próximo elemento inicia um novo subarray.