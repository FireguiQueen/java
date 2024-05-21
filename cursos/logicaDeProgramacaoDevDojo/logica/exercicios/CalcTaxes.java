import java.util.Scanner;

public  class CalcTaxes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1. Calcular imposto");
        System.out.println("2. Depositar salário");
        System.out.println("3. Sair");

        while (true)
        {
            System.out.println("Opção: ");
            byte userChoiches = input.nextByte();

            if (userChoiches != 1 && userChoiches != 2 && userChoiches != 3)
            {
                System.out.println("Digite uma opção válida.");
                continue;
            }
            break;
        }
    }
}