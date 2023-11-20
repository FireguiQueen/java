package introducao.exercicios;
import java.util.Scanner;

public class range_II
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);

        System.out.println("=== range === ");
        int start = 0;
        int end = 0;

        while (true)
        {
            System.out.print("Digite o valor de start: ");
            start = userIn.nextInt();

            System.out.print("Digite o valor de end: ");
            end = userIn.nextInt();
            if (start > end) {
                System.out.println("'end' não pode ser menor que 'start'! ");
                continue;
            }
            break;
        }

        System.out.println("RANGE: ");
        for (int i = start; i <= end; i++)
        {
            System.out.println("Valor: " + i + " (" + (i%2 == 0? "par" : "ímpar") + ")");
        }

        System.out.println("\n IGNORANDO PARES:");
        for (int i = start; i <= end; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println("ímpar: " + i);
            }
        }



    }
}
