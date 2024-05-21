import java.util.Scanner;

public  class CalcTaxes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        byte userChoiches = 0;

        System.out.println("1. Calcular imposto");
        System.out.println("2. Depositar salário");
        System.out.println("3. Sair");
        System.out.println("Escolha uma das opções acima:");
        while (userChoiches != 1 && userChoiches != 2 && userChoiches != 3)
        {
            System.out.println("Digite aqui: ");
            userChoiches = input.nextByte();
        }

    }
}