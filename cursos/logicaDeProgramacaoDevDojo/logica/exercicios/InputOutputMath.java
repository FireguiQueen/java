import java.util.Scanner;

public class InputOutputMath
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Start range: ");
        int startRange = input.nextInt();

        System.out.print("End range: ");
        int endRange = input.nextInt();

        if (endRange < startRange)
        {
            System.out.println("Your end range must be higher (or equivalent) than your start range");
        }
        for (int i = startRange; i <= endRange; i++)
        {
            for (int j = 0; j <= 10; j++)
            {
                System.out.println("" + i + " * " + j + " = " + (j*i));
            }
        }


    }
}