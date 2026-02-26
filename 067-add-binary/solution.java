class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Continua enquanto houver dígitos em 'a', 'b' ou um carry pendente
        while (i >= 0 || j >= 0 || carry > 0) {
            int soma = carry;

            // Adiciona o bit de 'a' se disponível
            if (i >= 0) {
                soma += a.charAt(i--) - '0';
            }

            // Adiciona o bit de 'b' se disponível
            if (j >= 0) {
                soma += b.charAt(j--) - '0';
            }

            // Adiciona o bit resultante (0 ou 1)
            sb.append(soma % 2);

            // Calcula o próximo carry (1 se soma >= 2, caso contrário 0)
            carry = soma / 2;
        }

        // Como adicionamos os bits na ordem inversa, precisamos reverter a string
        return sb.reverse().toString();
    }
}