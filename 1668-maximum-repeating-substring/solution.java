class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String repeatedWord = word;
        // Enquanto a sequência contiver a palavra repetida k+1 vezes
        while (sequence.contains(repeatedWord)) {
            k++;
            repeatedWord += word;
        }
        return k;
    }
}