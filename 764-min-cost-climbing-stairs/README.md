# Custo Mínimo para Subir Escadas (Min Cost Climbing Stairs)

## Descrição do Problema

Você recebe um array de inteiros `cost`, onde `cost[i]` é o custo do $i$-ésimo degrau de uma escada. Ao pagar o custo, você pode subir **um ou dois degraus**.

Você pode começar pelo degrau de índice **0** ou pelo degrau de índice **1**. O objetivo é retornar o custo mínimo para alcançar o "topo do chão" (além do último degrau).

## Lógica da Solução (Programação Dinâmica)

Para chegar ao degrau `i`, você deve ter vindo ou do degrau `i-1` ou do degrau `i-2`. O custo para estar no degrau `i` será o custo do próprio degrau mais o custo mínimo acumulado para chegar até ele.

### A Relação de Recorrência
Seja $dp[i]$ o custo mínimo para chegar ao degrau $i$:
$$dp[i] = cost[i] + \min(dp[i-1], dp[i-2])$$

### Otimização de Espaço
Como só precisamos dos dois últimos valores calculados ($dp[i-1]$ e $dp[i-2]$) para calcular o próximo, podemos usar apenas **duas variáveis** em vez de um array completo, reduzindo o espaço de $O(n)$ para $O(1)$.