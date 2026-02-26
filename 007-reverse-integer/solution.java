class Solution {
    public int reverse(int x) {
        int reverso = 0;
        
        while (x != 0) {
            int pop = x % 10; // Extrai o último dígito
            x /= 10;          // Remove o último dígito do original
            
            // Verificação de Overflow Positivo
            if (reverso > Integer.MAX_VALUE / 10 || (reverso == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            
            // Verificação de Overflow Negativo
            if (reverso < Integer.MIN_VALUE / 10 || (reverso == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            
            reverso = reverso * 10 + pop;
        }
        
        return reverso;
    }
}