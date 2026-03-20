class Solution {
    public int maxProfit(int[] prices) {
        // Inicializamos o menor preço como o maior valor possível
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            // Se encontrarmos um preço menor que o atual, atualizamos o ponto de compra
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Caso contrário, vemos se vender hoje traz um lucro maior que o anterior
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}