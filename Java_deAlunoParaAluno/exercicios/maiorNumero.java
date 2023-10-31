import java.util.Scanner;

public class maiorNumero{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int totalValores;
        do{
            System.out.print("Quantos valores sua lista irá conter: ");
            totalValores = userInput.nextInt();
        } while (totalValores <= 0);

        int[] valores = new int[totalValores];

        int maiorNumero = 0;
        for (int i = 0; i < totalValores; i++)
        {
            System.out.println("Digite o valor do " + (i+1) + "º elemento");
            valores[i] = userInput.nextInt();

            if (valores[i] > maiorNumero)
            {
                maiorNumero = valores[i];
            }
        }

        System.out.println("O maior número da lista é: " + maiorNumero);

    }
}