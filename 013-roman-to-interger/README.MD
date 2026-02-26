### 13. Roman to Integer 🟢
**Dificuldade:** Fácil | [Link do Desafio](https://leetcode.com/problems/roman-to-integer/)

* **Problema:** Converter uma representação em numerais romanos para um número inteiro.
* **Abordagem:** Iteração linear com lógica de comparação. Ao comparar o valor atual com o próximo, determinamos se o valor deve ser somado ou subtraído (casos como IV, IX, XC).
* **Conceitos Chave:**
    * **HashMap:** Para acesso $O(1)$ aos valores dos símbolos.
    * **Lógica Condicional:** Tratamento de regras de precedência.
* **Complexidade:**
    * **Tempo:** $O(n)$ — Onde $n$ é o comprimento da string (máximo 15 conforme constraints).
    * **Espaço:** $O(1)$ — O mapa de símbolos é constante e não cresce com a entrada.