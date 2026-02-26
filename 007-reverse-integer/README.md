### 7. Reverse Integer 🟡
**Dificuldade:** Médio | [Link do Desafio](https://leetcode.com/problems/reverse-integer/)

* **Problema:** Reverter os dígitos de um inteiro de 32 bits, retornando 0 caso o resultado ultrapasse os limites `[-2^31, 2^31 - 1]`.
* **Abordagem:** **Manipulação Aritmética**. O desafio reside na restrição de não utilizar variáveis de 64 bits (long). A solução implementa verificações preventivas antes de cada operação de multiplicação para detectar um possível overflow de memória.
* **Complexidade:**
    * **Tempo:** $O(\log_{10}(n))$ — Iteramos sobre cada dígito do número.
    * **Espaço:** $O(1)$ — Nenhuma estrutura de dados extra é utilizada.