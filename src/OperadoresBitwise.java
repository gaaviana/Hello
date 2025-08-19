public class OperadoresBitwise {
    public static void main(String[] args) {

        // =====================================
        // CONVERTENDO NÚMEROS PARA BINÁRIO
        int value1 = 4;
        // Converte o número inteiro para uma string em binário
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operação %s (representação binaria %S)\n", value1, binary1);
        // Exemplo: 4 → 100
        
        int value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Primeiro numero da operação %s (representação binaria %S)\n", value2, binary2);
        // Exemplo: 5 → 101

        // =====================================
        // OPERADORES BIT A BIT
        // | → OR (ou)
        // Faz OR entre cada bit dos dois números
        // 4 = 100
        // 5 = 101
        // 100 | 101 = 101 (5)
        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s | %s = %s (representação binaria %s)\n", value1, value2, result, binaryResult);

        /*
         * RESUMO DOS OPERADORES BIT A BIT:
         * 
         * &  → AND
         *      Retorna 1 apenas se ambos os bits forem 1
         *      Ex: 4 & 5 → 100 & 101 = 100 (4)
         * 
         * |  → OR
         *      Retorna 1 se pelo menos um dos bits for 1
         *      Ex: 4 | 5 → 100 | 101 = 101 (5)
         * 
         * ^  → XOR
         *      Retorna 1 se os bits forem diferentes
         *      Ex: 4 ^ 5 → 100 ^ 101 = 001 (1)
         * 
         * ~  → NOT (inversão de bits)
         *      Inverte todos os bits
         *      Ex: ~5 → 010 → 101... (depende de quantos bits você considerar)
         * 
         * << → SHIFT LEFT (desloca os bits para a esquerda)
         *      Multiplica por 2 a cada posição
         *      Ex: 5 << 2 → 00000101 << 2 = 00010100 (20)
         * 
         * >> → SHIFT RIGHT (desloca os bits para a direita)
         *      Divide por 2 a cada posição (mantendo o sinal)
         * 
         * >>> → SHIFT RIGHT SEM SINAL
         *      Desloca os bits para a direita, sempre preenchendo com 0 à esquerda
         */
    }
}