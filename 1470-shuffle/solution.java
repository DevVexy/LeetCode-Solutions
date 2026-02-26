class Solution {
    /**
     * Reorganiza o array no formato [x1, y1, x2, y2, ..., xn, yn].
     * * Estratégia: Mapeamento Direto.
     * O array de entrada tem tamanho 2n e está dividido em duas metades:
     * - Primeira metade (x): índices de 0 a n-1.
     * - Segunda metade (y): índices de n a 2n-1.
     */
    public int[] shuffle(int[] nums, int n) {
        // Criamos um novo array para armazenar o resultado intercalado
        int[] result = new int[2 * n];

        // Percorremos apenas a primeira metade (n elementos)
        for (int i = 0; i < n; i++) {
            // Os elementos 'x' (nums[i]) devem ocupar as posições PARES no resultado
            // Ex: i=0 -> result[0], i=1 -> result[2], i=2 -> result[4]
            result[2 * i] = nums[i];

            // Os elementos 'y' (nums[i + n]) devem ocupar as posições ÍMPARES no resultado
            // Ex: i=0 -> result[1], i=1 -> result[3], i=2 -> result[5]
            result[2 * i + 1] = nums[i + n];
        }
        
        // Retornamos o array devidamente intercalado
        return result;
    }
}