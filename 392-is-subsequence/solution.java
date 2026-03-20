class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        
        int i = 0; // ponteiro para s
        int j = 0; // ponteiro para t
        
        while (j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                // Se i chegou ao fim de s, todos os caracteres foram encontrados
                if (i == s.length()) return true;
            }
            j++;
        }
        
        return i == s.length();
    }
}