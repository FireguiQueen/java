package introducao.exercicios;
import java.util.Scanner;


public class imparPar
{
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int range;

        System.out.print("Insira um valor inteiro positivo: ");
        do
        {
            range = userIn.nextInt();
            System.out.println(range <= 0? "Insira um valor válido." : "");
        } while (range <= 0);

        // algoritimo ruim. criado apenas devido ao exercicio (o continue é desnecessário)
        for (int i = 0; i <= range; i++)
        {
            System.out.print("\nO número " + i + " é: ");
            if (i % 2 == 0 ) {
                System.out.print("par");
                continue;
            }
            System.out.print("impar");
        }



        // SEGUNDA FORMA:
        for (int i = 0; i <= range; i++)
        {
            String isOddOrEven = i % 2 == 0? "par" : "ímpar";
            System.out.println(i + " é: " + isOddOrEven);
        }

    }

}
