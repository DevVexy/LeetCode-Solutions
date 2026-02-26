### 171. Excel Sheet Column Number 🟢
**Dificuldade:** Fácil | [Link do Desafio](https://leetcode.com/problems/excel-sheet-column-number/)

* **Problema:** Converter um título de coluna do Excel (como "AB") em seu número inteiro correspondente.
* **Abordagem:** **Soma Polinomial em Base 26**. O problema é tratado como uma conversão de base numérica onde cada caractere representa um dígito em um sistema de numeração posicional de base 26. A iteração ocorre da esquerda para a direita, multiplicando o acumulado pela base antes de somar o valor do dígito atual.
* **Complexidade:**
    * **Tempo:** $O(n)$ — Onde $n$ é o número de caracteres na string.
    * **Espaço:** $O(1)$ — Utiliza apenas uma variável inteira para o cálculo.