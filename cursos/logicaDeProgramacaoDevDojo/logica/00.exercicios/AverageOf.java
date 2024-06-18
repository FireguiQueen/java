import java.util.Scanner;

public class AverageOf
{
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        System.out.println("---- Calcular média ----");
        int totalNotas = totalNotas();

        double nota[] = new double[totalNotas];
        double total = 0;

        for (int i = 0; i < totalNotas; i++)
        {
            System.out.print("Digite a nota " + (i+1) +": ");
            double userValue = input.nextDouble();

            nota[i] = userValue;
            total = total + userValue;
        }

        System.out.println("Total: " + total);
        System.out.println("Média: " + total / totalNotas);

    }

    public static int totalNotas()
    {
        System.out.print("Quantas notas você deseja calcular? ");
        int notas = input.nextInt();
        return notas;
    }
}