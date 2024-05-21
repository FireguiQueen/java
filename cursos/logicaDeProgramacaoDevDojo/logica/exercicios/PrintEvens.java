import java.util.Scanner;

public class PrintEvens
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int userNum = input.nextInt();

        int contador = 0;
        while (contador <= userNum)
        {
            if (contador % 2 != 0)
            {
                System.out.println(contador + " é ímpar.");
            }
            contador = contador +1;
        }
    }
}