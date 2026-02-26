import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Mapa para busca rápida: o valor do número é a chave, o índice é o valor
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            
            // Se o complemento já foi visto, retornamos o par de índices
            if (map.containsKey(complemento)) {
                return new int[] { map.get(complemento), i };
            }
            
            // Guardamos o número atual para consultas futuras
            map.put(nums[i], i);
        }
        return new int[] {}; // Caso não encontre (conforme enunciado, sempre haverá solução)
    }
}