class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Percorre o array do fim para o início
        for (int i = n - 1; i >= 0; i--) {
            // Se o dígito for menor que 9, incrementamos e terminamos
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Se for 9, vira 0 e continua para o próximo índice (carry)
            digits[i] = 0;
        }

        // Se chegou aqui, todos os dígitos eram 9 (ex: 99 -> 100)
        int[] result = new int[n + 1];
        result[0] = 1; // O restante do array já é inicializado com 0 por padrão em Java
        
        return result;
    }
}