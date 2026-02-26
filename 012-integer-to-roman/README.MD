### 12. Integer to Roman 🟡
**Dificuldade:** Médio | [Link do Desafio](https://leetcode.com/problems/integer-to-roman/)

* **Problema:** Converter um número inteiro entre 1 e 3999 para sua representação em numerais romanos.
* **Abordagem:** **Algoritmo Greedy (Ganancioso)**. Ao mapear todos os casos especiais (formas subtrativas como 4 e 9) junto aos símbolos padrão, podemos simplesmente iterar do maior valor para o menor, subtraindo o máximo possível em cada etapa.
* **Conceitos Chave:**
    * **StringBuilder**: Utilizado para construção eficiente da string de resposta.
    * **Mapeamento Estático**: Arrays paralelos para tradução rápida de valores decimais para símbolos.
* **Complexidade:**
    * **Tempo:** $O(1)$ — Embora dependa do valor de `num`, o limite máximo é 3999, o que garante um número constante de operações.
    * **Espaço:** $O(1)$ — Armazenamento fixo para os mapeamentos de símbolos.