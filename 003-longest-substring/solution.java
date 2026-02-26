import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int esquerda = 0; // Início da janela deslizante

        for (int direita = 0; direita < s.length(); direita++) {
            char c = s.charAt(direita);
            
            if (map.containsKey(c)) {
                // Move a esquerda para evitar caracteres repetidos na janela
                esquerda = Math.max(esquerda, map.get(c) + 1);
            }
            
            map.put(c, direita);
            maxLen = Math.max(maxLen, direita - esquerda + 1);
        }
        return maxLen;
    }
}