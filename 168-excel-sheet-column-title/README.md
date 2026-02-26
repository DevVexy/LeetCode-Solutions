### 168. Excel Sheet Column Title 🟢
**Dificuldade:** Fácil | [Link do Desafio](https://leetcode.com/problems/excel-sheet-column-title/)

* **Problema:** Converter um número inteiro positivo em seu título de coluna correspondente no padrão Excel (A, B, C... Z, AA, AB...).
* **Abordagem:** **Conversão de Base Numérica (Base-26)**. O desafio principal é que o sistema do Excel é baseado em 1 (1-indexado) e não possui o dígito zero. A solução aplica um ajuste iterativo (`columnNumber--`) para alinhar o valor ao mapeamento ASCII de 'A'-'Z'.
* **Complexidade:**
    * **Tempo:** $O(\log_{26}(n))$ — O loop executa uma vez para cada "casa decimal" na base 26.
    * **Espaço:** $O(1)$ — Nenhuma estrutura de dados complexa é utilizada além do buffer de saída.