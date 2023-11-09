// EXERCÍCIO: Ano bissexto

import java.util.Scanner;

public class Aula_21{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Year: ");
        final long YEAR = userInput.nextLong();

        // Podemos fazer isso pois temos um operador de comparação, e ele é o responsável por retornar um valor booleano.
        // Ele faz com que seja retornado TRUE ou FALSE a nossa variável 'isLeap'
        boolean isLeap = (YEAR % 400 == 0) || (YEAR % 4 == 0 && YEAR % 100 != 0);

        // Podemos armazenar 'isLeap' no 'if', pois a variável 'isLeap' está armazenando "true" ou "false".
        if (isLeap)
        {
            System.out.println("The year is a leap year.");
        }
    }
}