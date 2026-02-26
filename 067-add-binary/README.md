### 67. Add Binary 🟢
**Dificuldade:** Fácil | [Link do Desafio](https://leetcode.com/problems/add-binary/)

* **Problema:** Somar duas strings binárias e retornar a soma como uma nova string binária.
* **Abordagem:** **Simulação de Soma Bit a Bit**. Percorremos ambas as strings simultaneamente do final para o início. Utilizamos uma variável `carry` para gerenciar o transporte de valores. A lógica utiliza aritmética modular (`soma % 2`) para definir o bit atual e divisão inteira (`soma / 2`) para definir o transporte.
* **Complexidade:**
    * **Tempo:** $O(\max(N, M))$ — Onde $N$ e $M$ são os comprimentos das strings de entrada.
    * **Espaço:** $O(\max(N, M))$ — Necessário para o `StringBuilder` que armazena o resultado.