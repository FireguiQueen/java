package introducao.exercicios;

import java.util.Scanner;

public class palindromo
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String userWord = userIn.next();

        boolean isPalindromo = false;

        for (int i = 0, j = (userWord.length() - 1); i < userWord.length(); i++, j--)
        {
            if (userWord.charAt(i) != userWord.charAt(j))
            {
                System.out.println("Não é um palíndromo");
                break;
            }
            isPalindromo = true;

        }

        System.out.println("A palavra " + (isPalindromo? "é um palíndromo" : "não é um palíndromo"));

    }
}
