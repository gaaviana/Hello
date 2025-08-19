import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    System.err.println("Quando é 2 + 2 ?");
    var result = scanner.nextInt();
    var isRight = result == 4; // != para verificar se é DIFERENTE
    System.out.printf("O resultado é 4, você acertou? (%s) \n", isRight );

    System.err.println("========================================================================");
    
    System.out.println("Quantos anos você tem? ");
    var age = scanner.nextInt();
    System.err.println("Você é emancipado?");
    var isEmancipated = scanner.nextBoolean();

    var canDrive = age >= 18 || (isEmancipated && age >= 16);
    System.out.printf("Você pode dirigir? (%s) \n", canDrive);

    scanner.close();
    }
}