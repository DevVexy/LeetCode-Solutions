class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        // Representam o custo mínimo para alcançar os dois degraus anteriores
        int primeiro = cost[0];
        int segundo = cost[1];
        
        // Começamos do índice 2 pois os índices 0 e 1 são pontos de partida
        for (int i = 2; i < n; i++) {
            int atual = cost[i] + Math.min(primeiro, segundo);
            primeiro = segundo;
            segundo = atual;
        }
        
        // O topo está além do último degrau, então escolhemos o mínimo entre 
        // os dois últimos degraus alcançados.
        return Math.min(primeiro, segundo);
    }
}