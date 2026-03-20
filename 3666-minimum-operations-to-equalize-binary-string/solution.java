import java.util.*;

class Solution {
    public int minOperations(String s, int k) {
        int n = s.length();
        int cnt0 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') cnt0++;
        }

        if (cnt0 == 0) return 0;

        // Arrays para "saltar" estados já visitados (um para cada paridade)
        int[] next = new int[n + 2];
        for (int i = 0; i <= n + 1; i++) next[i] = i;

        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);

        Deque<Integer> q = new ArrayDeque<>();
        q.offer(cnt0);
        dist[cnt0] = 0;
        
        // Marcamos o estado inicial como "saltado" apontando para o próximo da mesma paridade
        next[cnt0] = cnt0 + 2;

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == 0) return dist[0];

            // Cálculo dos limites L e R (mesma lógica do seu código)
            int minX = Math.max(0, k - (n - cur));
            int maxX = Math.min(k, cur);
            int l = cur + k - 2 * maxX;
            int r = cur + k - 2 * minX;

            // Busca linear otimizada: usamos find() para saltar os visitados
            for (int i = find(next, l); i <= r; i = find(next, i)) {
                if (dist[i] == -1) {
                    dist[i] = dist[cur] + 1;
                    q.offer(i);
                    // O "pulo": este nó agora aponta para o próximo disponível
                    next[i] = find(next, i + 2);
                }
            }
        }

        return -1;
    }

    // Função find clássica de DSU para compressão de caminho
    private int find(int[] parent, int i) {
        if (i >= parent.length) return i;
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]);
    }
}