import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // Cria o Scanner para ler valores digitados pelo usuário
        var scanner = new Scanner(System.in);

        // =====================================
        // SOMA DE DOIS NÚMEROS
        System.out.println("Informe o primero numero: ");
        var value1 = scanner.nextInt(); // lê um número inteiro digitado (poderia usar nextFloat para decimais)
        
        System.out.println("Informe o segundo numero: ");
        var value2 = scanner.nextInt();
        
        // Exibe o resultado da soma usando formatação de string
        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);

        System.out.println("=================================================");

        // =====================================
        // RAIZ QUADRADA
        System.out.println("Informe o primero numero: ");
        var value01 = scanner.nextInt();
        
        // Usa o método Math.sqrt() para calcular a raiz quadrada
        System.out.printf("a raiz quadrada de %s é %s \n", value01, Math.sqrt(value01));
        // Obs: Math.pow(x, y) serviria para calcular potenciação (x^y)

        System.out.println("=================================================");

        // =====================================
        // OPERADORES DE INCREMENTO/DECREMENTO
        var value = 50;

        // Pré-incremento (++value):
        // Primeiro soma 1, depois usa o valor → aqui vai imprimir 51
        System.out.println(++value);

        // Agora mostra o valor atualizado (51)
        System.out.println(value);

        // Obs: se fosse pós-incremento (value++):
        // Ele usaria o valor atual (50), e só depois incrementaria para 51.
        
        // Da mesma forma existe o decremento (--value ou value--)
        scanner.close(); // Fecha o Scanner (boa prática)
    }
}
