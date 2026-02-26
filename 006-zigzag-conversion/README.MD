### 6. Zigzag Conversion 🟡
**Dificuldade:** Médio | [Link do Desafio](https://leetcode.com/problems/zigzag-conversion/)

* **Problema:** Converter uma string para um padrão zigzag com um número específico de linhas e ler o resultado linha a linha.
* **Abordagem:** **Simulação de Movimento**. Utilizamos uma lista de `StringBuilder` para cada linha e uma variável booleana para controlar a direção do cursor (subindo ou descendo). Isso evita o uso de matrizes esparsas e economiza memória.
* **Complexidade:**
    * **Tempo:** $O(n)$ — Onde $n$ é o comprimento da string, pois percorremos cada caractere uma única vez.
    * **Espaço:** $O(n)$ — Para armazenar os caracteres divididos nas linhas.