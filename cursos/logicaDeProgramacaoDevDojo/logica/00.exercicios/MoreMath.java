public class MoreMath
{
    public static void main(String[] args)
    {
        int endRange = 10;

        int somaQuanto = 50;

        int soma = 0;
        System.out.println("Soma: " + soma);

        if (endRange >= 0)
        {
            for (int i = 0; i <= endRange; i++)
            {
                soma += somaQuanto;
                System.out.println(i + "º iteração: " + soma);
            }
        }


    }
}