class Solution {
    public int maxSubArray(int[] nums) {
        // Inicializamos com o primeiro elemento para lidar com arrays de um único item
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        // Começamos do segundo elemento
        for (int i = 1; i < nums.length; i++) {
            // Decisão de Kadane: Continuar o subarray atual ou começar um novo?
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Atualiza o recorde global
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}