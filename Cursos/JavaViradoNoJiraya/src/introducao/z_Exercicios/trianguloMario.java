package introducao.z_Exercicios;
import java.util.Scanner;

public class trianguloMario
{

    public static void main(String[] args)
    {
        int tamanhoPiramide = takeInfomations();
        buildPyramid(tamanhoPiramide);
    }


    private static int takeInfomations()
    {
        Scanner userIn = new Scanner(System.in);

        System.out.print("Insira o tamanho da pirâmide: ");
        int tamanhoPiramide;

        while (true)
        {
            tamanhoPiramide = userIn.nextInt();

            if (tamanhoPiramide <= 0) continue;
            break;
        }
        return tamanhoPiramide;
    }

    private static void buildPyramid(int tamanhoPiramide)
    {
        for (int i = 0; i < tamanhoPiramide; i++)
        {

            for (int j = (tamanhoPiramide - 1); j > i; j--)
            {
                System.out.print(' ');
            }

            for (int j = 0; j < (i + 1); j++)
            {
                System.out.print(i>=1? "##": " #");

            }
            System.out.println();

        }
    }

}
