// EXERCICIO: Ano bissexto?

import java.util.Scanner;

public class Aula_21{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Year: ");
        final long YEAR = userInput.nextLong();

        // Podemos fazer isso pois temos o operador de diferença (!=) 
        // E ele faz com que seja retornado TRUE ou FALSE a nossa variável 'isLeap'
        boolean isLeap = YEAR % 4 != 0

        // Podemos fazer isso, pois a variável 'isLeap' está armazenando "true" ou "false".
        if (isLeap){
            System.out.pritnln("The year is a leap year.");
        }
    }
}