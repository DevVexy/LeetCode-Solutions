### 70. Climbing Stairs 🟢
**Dificuldade:** Fácil | [Link do Desafio](https://leetcode.com/problems/climbing-stairs/)

* **Problema:** Determinar quantas formas distintas existem para subir uma escada de $n$ degraus, podendo avançar 1 ou 2 degraus por vez.
* **Abordagem:** **Programação Dinâmica**. O problema é uma aplicação direta da Sequência de Fibonacci. A solução utiliza uma abordagem iterativa (*bottom-up*) com otimização de espaço, mantendo apenas os resultados dos dois últimos estados para calcular o próximo.
* **Complexidade:**
    * **Tempo:** $O(n)$ — Processamento linear até o degrau desejado.
    * **Espaço:** $O(1)$ — Nenhuma estrutura de dados adicional é necessária, apenas variáveis de controle.