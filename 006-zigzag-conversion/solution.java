import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        // Caso base: se houver apenas uma linha, o padrão não muda
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Criamos uma lista de StringBuilders para representar cada linha
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean indoParaBaixo = false;

        // Percorremos cada caractere da string original
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            
            // Inverte a direção quando atingimos o topo ou a base
            if (curRow == 0 || curRow == numRows - 1) {
                indoParaBaixo = !indoParaBaixo;
            }
            
            // Move para a próxima linha dependendo da direção
            curRow += indoParaBaixo ? 1 : -1;
        }

        // Une todas as linhas em um único resultado
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        
        return res.toString();
    }
}