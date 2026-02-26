class Solution {
    /**
     * Calcula o número máximo de 1s consecutivos em um array binário.
     * Complexidade de Tempo: O(n) - Percorre o array apenas uma vez.
     * Complexidade de Espaço: O(1) - Utiliza apenas variáveis de controle simples.
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximo = 0;        // Armazena o maior recorde de 1s encontrado até agora
        int contadorAtual = 0; // Contador para a sequência de 1s que está sendo processada no momento

        for (int n : nums) {
            // Verifica se o elemento atual faz parte de uma sequência de 1s
            if (n == 1) {
                contadorAtual++; // Incrementa a contagem da sequência atual
                
                // Atualiza o recorde global caso a contagem atual supere o máximo anterior
                // Nota: Fazer isso dentro do if garante que capturamos sequências que terminam no fim do array
                if (contadorAtual > maximo) {
                    maximo = contadorAtual;
                }
            } else {
                // Encontrou um 0: a sequência foi interrompida
                // Resetamos o contador para começar uma nova contagem na próxima oportunidade
                contadorAtual = 0;
            }
        }
        
        return maximo; // Retorna o maior valor acumulado durante a execução
    }
}