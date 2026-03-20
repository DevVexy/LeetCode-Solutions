class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        // ans[0] já é 0 por padrão
        for (int i = 1; i <= n; i++) {
            // i >> 1 é o mesmo que i / 2
            // i & 1 é o mesmo que i % 2
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }
}