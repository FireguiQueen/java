package introducao.exercicios;
import java.util.Scanner;

public class trianguloMario
{

    public static void main(String[] args)
    {
        int tamanhoPiramide = takeInfomations();

        for (int i = 0; i < tamanhoPiramide; i++)
        {
            System.out.println("oi");
        }

    }


    public static int takeInfomations()
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


}
