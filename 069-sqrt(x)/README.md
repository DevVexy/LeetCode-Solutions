### 69. Sqrt(x) 🟢
**Dificuldade:** Fácil | [Link do Desafio](https://leetcode.com/problems/sqrtx/)

* **Problema:** Calcular a raiz quadrada de um número inteiro não negativo, arredondando o resultado para baixo, sem utilizar funções matemáticas nativas.
* **Abordagem:** **Busca Binária**. O algoritmo pesquisa o valor da raiz dentro do intervalo $[1, x/2]$. A cada iteração, verifica-se se o quadrado do ponto médio é igual, menor ou maior que $x$, ajustando os ponteiros de busca conforme necessário.
* **Complexidade:**
    * **Tempo:** $O(\log x)$ — A cada passo, o espaço de busca é reduzido pela metade.
    * **Espaço:** $O(1)$ — Utiliza apenas variáveis de controle.
* **Destaque Técnico:** Implementação de proteção contra *Integer Overflow* ao converter o cálculo do quadrado para o tipo `long`.