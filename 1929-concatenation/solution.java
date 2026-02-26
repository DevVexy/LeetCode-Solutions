class Solution {
    /**
     * Cria um novo array que é a concatenação de 'nums' com ele mesmo.
     * Estratégia: Duplicação por deslocamento (offset).
     * * Complexidade de Tempo: O(n) - Percorremos o array original exatamente uma vez.
     * Complexidade de Espaço: O(n) - Espaço necessário para o array 'ans' de tamanho 2n.
     */
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        // Inicializamos o array resultante com o dobro do tamanho do original
        int[] ans = new int[2 * n];

        // Iteramos sobre o array original para preencher ambas as metades de 'ans'
        for (int i = 0; i < n; i++) {
            // Atribui o elemento à primeira metade (índices de 0 a n-1)
            ans[i] = nums[i];

            // Atribui o mesmo elemento à segunda metade (índices de n a 2n-1)
            // O uso de 'i + n' garante o alinhamento perfeito da duplicata
            ans[i + n] = nums[i];
        }
        
        // Retorna o array concatenado [nums[0]...nums[n-1], nums[0]...nums[n-1]]
        return ans;
    }
}