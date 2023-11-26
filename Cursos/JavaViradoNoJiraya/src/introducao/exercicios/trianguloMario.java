package introducao.exercicios;
import java.util.Scanner;

public class trianguloMario
{
    public static void main(String[] args)
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

        for (int i = 0; i < tamanhoPiramide; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("#");
            }
            System.out.println("oi");
        }


    }
}
