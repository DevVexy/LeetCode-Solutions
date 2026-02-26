class Solution {
    public boolean isPalindrome(int x) {
        // Caso de borda: Números negativos e números que terminam em 0 (exceto o 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversoMetade = 0;
        // Revertemos o número até que a metade revertida seja >= que a original
        while (x > reversoMetade) {
            reversoMetade = (reversoMetade * 10) + (x % 10);
            x /= 10;
        }

        // Para números com dígitos ímpares, removemos o dígito central: reversoMetade / 10
        // Exemplo: 121 -> ao fim do loop x = 1, reversoMetade = 12. 1 == 12/10 -> true.
        return x == reversoMetade || x == reversoMetade / 10;
    }
}