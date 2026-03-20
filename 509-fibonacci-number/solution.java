class Solution {
    public int fib(int n) {
        // Casos base
        if (n <= 1) return n;
        
        int a = 0; // Representa F(n-2)
        int b = 1; // Representa F(n-1)
        
        for (int i = 2; i <= n; i++) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        
        return b;
    }
}