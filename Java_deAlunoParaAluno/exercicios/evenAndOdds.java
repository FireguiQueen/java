import java.util.Scanner; 

public class evenAndOdds
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);


        System.out.print("Digite um número: ");
        final long NUMBER = userInput.nextLong();

        if (NUMBER % 2 == 0)
        {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}