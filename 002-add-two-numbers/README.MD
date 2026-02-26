# Add Two Numbers 🟡

## Estratégia
Simulação de soma aritmética manual em **Listas Ligadas**. Percorremos ambas as listas simultaneamente, mantendo uma variável `carry` para o "vai um". Utilizamos um **Dummy Node** para simplificar a criação da lista de retorno.



## Complexidade
- **Tempo:** $O(\max(m, n))$ - Onde $m$ e $n$ são os tamanhos das listas.
- **Espaço:** $O(\max(m, n))$ - Tamanho da nova lista gerada.