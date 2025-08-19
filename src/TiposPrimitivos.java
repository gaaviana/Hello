
public class TiposPrimitivos {

    public static void main(String[] args) {
        // TIPOS NUMERAIS INTEIROS
        // byte (8 bits), short (16 bits), int (32 bits), long (64 bits)
        // O "l" no final indica que é um long
        var number = 1L; 

        // TIPOS FLUTUANTES (com casas decimais)
        // float (32 bits), precisa do "f" no final
        float numberF = 1.8f;

        // double (64 bits), pode usar "d" no final (opcional, mas é boa prática)
        var numberD = 1.8d;

        // TIPOS DE CARACTERE
        // char guarda apenas 1 caractere
        char letter = 'a';

        // Para armazenar várias letras/palavras, usamos String

        boolean bool = false;


        // Exibindo valores
        System.out.println("Número long: " + number);
        System.out.println("Número float: " + numberF);
        System.out.println("Número double: " + numberD);
        System.out.println("Caractere único: " + letter);
        System.out.println("Esse conteudo é: " + bool);
  
    }
}