
// Importa a classe Scanner, que permite ler dados digitados pelo usuário
import java.util.Scanner;
public class App {

    // Constante com a mensagem inicial (final = não pode mudar depois de definida)
    private final static String WELCOME_MESSAGE = "Olá, informe seu nome";

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do teclado (System.in)
        var scanner = new Scanner(System.in);

        // Exibe a mensagem de boas-vindas pedindo o nome
        System.out.println(WELCOME_MESSAGE);

        // Lê a próxima palavra digitada pelo usuário e guarda na variável 'name'
        // (se digitar "Maria Silva", só pega "Maria")
        var name = scanner.next();

        // Pede a idade do usuário
        System.out.println("Informe sua idade: ");

        // Lê o número inteiro digitado e guarda na variável 'age'
        var age = scanner.nextInt();

        // Mostra uma mensagem concatenando as variáveis name e age
        System.out.println("ola " + name + " sua idade é " + age);

        // Faz a mesma coisa, mas usando 'printf' (formatação de string)
        // %s = substitui por uma String
        System.out.printf("ola %s sua idade é %s \n", name, age);

        scanner.close(); // fecha o recurso Scanner
    }
}
