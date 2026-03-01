class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        
        // Percorremos da direita para a esquerda até o segundo bit (i > 0)
        // O primeiro bit "1" é onde queremos chegar.
        for (int i = s.length() - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';
            
            // Se o bit + carry for ímpar, precisamos somar 1 (1 passo) 
            // e depois dividir por 2 (outro passo). Total = 2 passos.
            if (bit + carry == 1) {
                steps += 2;
                carry = 1; // Uma vez que somamos 1, teremos carry até o fim
            } 
            // Se for par (0+0 ou 1+1), apenas dividimos por 2.
            else {
                steps += 1;
            }
        }
        
        // Se ao final houver um carry para o bit mais significativo (s[0])
        // o "1" vira "10", exigindo uma divisão extra.
        return steps + carry;
    }
}