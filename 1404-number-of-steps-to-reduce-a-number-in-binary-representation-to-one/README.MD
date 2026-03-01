### 1404. Number of Steps to Reduce a Binary Number 🟡
**Abordagem:** Greedy Bit Manipulation ($O(n)$).
- Evita conversão para BigInteger processando os bits individualmente da direita para a esquerda.
- Lógica de `carry` persistente: uma vez que uma soma ocorre em um número binário, todos os bits '0' à esquerda se comportarão como ímpares até serem divididos.