class Solution {
    public int titleToNumber(String columnTitle) {
        int resultado = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            // Converte o caractere atual em seu valor numérico (A=1, B=2...)
            int valorChar = columnTitle.charAt(i) - 'A' + 1;
            
            // Eleva o acumulado à próxima potência de 26 e soma o novo valor
            resultado = resultado * 26 + valorChar;
        }

        return resultado;
    }
}