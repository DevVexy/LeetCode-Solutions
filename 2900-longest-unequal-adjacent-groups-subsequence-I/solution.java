import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        
        // Sempre adicionamos a primeira palavra
        result.add(words[0]);
        int lastGroup = groups[0];
        
        for (int i = 1; i < n; i++) {
            // Se o grupo atual for diferente do último grupo adicionado
            if (groups[i] != lastGroup) {
                result.add(words[i]);
                lastGroup = groups[i]; // Atualiza o último grupo visto
            }
        }
        
        return result;
    }
}