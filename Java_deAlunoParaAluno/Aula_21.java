// EXERCICIO: Ano bissexto
// REGRAS:
/*
    1. Se o ano for uniformemente divisível por 4, vá para a etapa 2. Caso contrário, vá para a etapa 5.
    2. Se o ano for uniformemente divisível por 100, vá para a etapa 3. Caso contrário, vá para a etapa 4.
    3. Se o ano for uniformemente divisível por 400, vá para a etapa 4. Caso contrário, vá para a etapa 5.

    4. O ano é bissexto (tem 366 dias);
    5. O ano não é um ano bissexto (tem 365 dias).
*/

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

        // Podemos fazer isso, pois a variável 'isLeap' está armazenando "true" ou "false".
        if (isLeap){
            System.out.println("The year is a leap year.");
        }
    }
}