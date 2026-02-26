class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // Casos base: 0 e 1

        int low = 1;
        int high = x / 2; // A raiz de x (x>1) nunca é maior que x/2
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Usamos long para evitar overflow no cálculo de mid * mid
            long num = (long) mid * mid;

            if (num == x) {
                return mid;
            } else if (num < x) {
                ans = mid;    // mid é um candidato a "arredondado para baixo"
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}