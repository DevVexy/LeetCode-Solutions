class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            // Ajuste crucial: o Excel não possui o conceito de '0', 
            // então reduzimos 1 para mapear 1-26 para 0-25 (A-Z).
            columnNumber--; 
            
            char caractere = (char) ('A' + (columnNumber % 26));
            sb.append(caractere);
            
            columnNumber /= 26;
        }

        // Como construímos do último caractere para o primeiro, invertemos.
        return sb.reverse().toString();
    }
}