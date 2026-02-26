### 9. Palindrome Number 🟢
**Dificuldade:** Fácil | [Link do Desafio](https://leetcode.com/problems/palindrome-number/)

* **Problema:** Determinar se um inteiro é um palíndromo (lido da mesma forma de frente para trás e vice-versa).
* **Restrição Adicional:** Resolver sem converter o número para uma String.
* **Abordagem:** **Reversão de Metade Matemática**. Utilizamos operações de módulo (`%`) e divisão (`/`) para reconstruir a metade inferior do número de forma invertida. A comparação final entre a metade original restante e a metade invertida define o resultado.
* **Complexidade:**
    * **Tempo:** $O(\log_{10}(n))$ — O número de iterações é proporcional à quantidade de dígitos no número.
    * **Espaço:** $O(1)$ — Nenhuma estrutura de dados adicional é utilizada.