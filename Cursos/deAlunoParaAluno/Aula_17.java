// STRINGS
/*
    O conceito "string" refere a uma cadeia de caracteres.
    Ou seja, caracteres separados, que quando unidos, foram uma "string".
 */
import java.util.Scanner; 

public class Aula_17{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Define uma string. Ela não é um tipo de dado primitivo, é um objeto. 
        String nome = "Osvaldo";
        System.out.println(nome);
        // ouput: "Osvaldo"


        // Pegando uma entrada de informação. O usuário irá digitar seu nome no terminal. 
        System.out.print("Digite seu nome: ");
        String userName = input.next();

        // printa o nome do usuário 
        System.out.println("Olá, " + userName + "!");



        // Para ter uma entrada de informação do tipo string, usamos o método "next()". 
        // Mas observe que, após o espaço, toda a string é ignorada, e apenas a primeira palavra é capturada.

        // Você pode digitar "João Pedro", mas apenas "joão" será salvo nesta variável.
        String name01 = input.next();

        // Com o "nextLine", não temos esta limitação. Ela só para de capturar quando vamos para a próxima linha.
        // Ou seja, quando pressionamos "enter".
        String name02 = input.nextLine();
    }
}