import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        // Inicializa a lista com o tamanho correto preenchida com 0
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        
        // Adiciona o primeiro 1
        row.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
            // Adiciona um 1 ao final para a nova linha
            row.add(1);
            
            // Atualiza os elementos do meio de TRÁS PARA FRENTE
            // j começa em i-1 e vai até 1
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        
        return row;
    }
}