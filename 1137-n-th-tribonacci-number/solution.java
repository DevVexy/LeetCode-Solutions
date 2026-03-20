class Solution {
    public int tribonacci(int n) {
        // Casos base iniciais
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        
        // Inicializando os três primeiros termos
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int tn = 0;
        
        // Calculando do termo 3 até n
        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;
            // Atualiza as variáveis para a próxima iteração
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }
        
        return tn;
    }
}