class Solution {
    public int climbStairs(int n) {
        // Casos base
        if (n <= 2) return n;

        int primeiro = 1; // Maneiras de chegar no degrau 1
        int segundo = 2;  // Maneiras de chegar no degrau 2

        for (int i = 3; i <= n; i++) {
            int atual = primeiro + segundo;
            primeiro = segundo; // O degrau anterior vira o "atrasado"
            segundo = atual;    // O degrau atual vira o novo "anterior"
        }

        return segundo;
    }
}