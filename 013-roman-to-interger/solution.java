import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Converte uma string em numeral romano para um inteiro.
     * Complexidade de Tempo: O(n) - Percorre a string uma vez.
     * Complexidade de Espaço: O(1) - O mapa de símbolos tem tamanho fixo.
     */
    public int romanToInt(String s) {
        // Tabela de mapeamento dos símbolos romanos
        Map<Character, Integer> mapa = new HashMap<>();
        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        int resultado = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int valorAtual = mapa.get(s.charAt(i));

            // Se houver um próximo caractere e ele for maior, subtraímos o valor atual
            if (i < n - 1 && valorAtual < mapa.get(s.charAt(i + 1))) {
                resultado -= valorAtual;
            } else {
                // Caso contrário, somamos normalmente
                resultado += valorAtual;
            }
        }

        return resultado;
    }
}