class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";
        int inicio = 0, fim = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expansão para palíndromos ímpares (centro em i)
            int len1 = expandirDoCentro(s, i, i);
            // Expansão para palíndromos pares (centro entre i e i+1)
            int len2 = expandirDoCentro(s, i, i + 1);

            int len = Math.max(len1, len2);

            // Se encontramos um palíndromo maior que o anterior, atualizamos os índices
            if (len > fim - inicio) {
                inicio = i - (len - 1) / 2;
                fim = i + len / 2;
            }
        }
        return s.substring(inicio, fim + 1);
    }

    private int expandirDoCentro(String s, int esquerda, int direita) {
        while (esquerda >= 0 && direita < s.length() && s.charAt(esquerda) == s.charAt(direita)) {
            esquerda--;
            direita++;
        }
        // Retorna o comprimento do palíndromo encontrado
        return direita - esquerda - 1;
    }
}