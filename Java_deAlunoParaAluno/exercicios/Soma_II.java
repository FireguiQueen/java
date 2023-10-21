import java.util.Scanner;

public class Soma_II
{
    public static void main(String[] args)
    {
        float x, y, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        x = input.nextFloat();

        System.out.print("Digite o valor de Y: ");
        y = input.nextFloat();

        total = x + y;

        System.out.println("Resultado: " + total);
    }
}