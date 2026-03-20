## Descrição do Problema

Alice e Bob jogam um jogo, começando por Alice. Existe um número $n$ no quadro. Em cada turno:
1. O jogador escolhe um inteiro $x$ tal que $0 < x < n$ e $n \pmod x == 0$.
2. O jogador substitui $n$ por $n - x$ no quadro.
3. Quem não conseguir fazer uma jogada (quando $n=1$), perde.

Retorne `true` se Alice vencer, assumindo que ambos jogam de forma otimizada.

## Lógica da Solução (O Insight da Paridade)

A vitória neste jogo depende inteiramente de se $n$ é **par** ou **ímpar**.

1.  **Se $n$ é par:** Alice pode sempre escolher $x = 1$. O novo número será $n - 1$, que é **ímpar**.
2.  **Se $n$ é ímpar:** Qualquer divisor $x$ de um número ímpar também deve ser **ímpar**. Ao subtrair um ímpar de outro ímpar ($n - x$), o resultado será sempre **par**.

### A Estratégia Vencedora
* Quem recebe um número **par** pode sempre passar um número **ímpar** para o adversário (subtraindo 1).
* Quem recebe um número **ímpar** é forçado a passar um número **par** de volta.
* O jogo termina em $n = 1$ (quem recebe 1 perde). Como 1 é ímpar, quem estiver recebendo os números ímpares eventualmente receberá o 1 e perderá.

Portanto, se Alice começa com um número **par**, ela pode garantir que Bob sempre receba números ímpares até que ele perca.