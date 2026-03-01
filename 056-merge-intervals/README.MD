### 56. Merge Intervals 🟡
**Abordagem:** Sorting + Linear Scan.
- A ordenação garante que só precisamos comparar cada intervalo com o último inserido na lista de resultados.
- Uso de `LinkedList` facilita o acesso ao último elemento via `getLast()`.