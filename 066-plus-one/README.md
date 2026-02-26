### 66. Plus One 🟢
**Dificuldade:** Fácil | [Link do Desafio](https://leetcode.com/problems/plus-one/)

* **Problema:** Dado um array de dígitos representando um número inteiro, incrementar esse número em 1 e retornar o novo array.
* **Abordagem:** **Simulação de Soma com Carry**. Percorremos o array de forma reversa. A lógica foca em identificar o primeiro dígito da direita para a esquerda que não seja `9` para realizar o incremento. Caso todos os dígitos sejam `9`, um novo array de tamanho $n+1$ é gerado para comportar o novo dígito mais significativo.
* **Complexidade:**
    * **Tempo:** $O(n)$ — Onde $n$ é o número de dígitos.
    * **Espaço:** $O(n)$ — No pior caso de redimensionamento, caso contrário $O(1)$ (espaço extra).