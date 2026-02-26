class Solution {
    public String intToRoman(int num) {
        // Arrays ordenados do maior para o menor valor
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        // Percorre a tabela de valores
        for (int i = 0; i < valores.length; i++) {
            // Enquanto o número comportar o valor atual, anexa o símbolo e subtrai
            while (num >= valores[i]) {
                sb.append(simbolos[i]);
                num -= valores[i];
            }
        }

        return sb.toString();
    }
}