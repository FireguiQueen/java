public class MatrizDiagonalPrincipal
{
    public static void main(String[] args)
    {
        int[][] tabela =
        {
            {10, 20, 30, 50},
            {40, 50, 60, 50},
            {70, 80, 90, 50},
            {70, 80, 90, 50}
        };

        int diagonal1 = 1;
        int diagonal2 = 1;

        for (int i = 0; i < tabela.length; i++)
        {
                diagonal1 = diagonal1 * tabela[i][i];
        }

        for (int i = 0; i < tabela.length; i++)
        {
            if (i == 0)
            {
                diagonal2 = diagonal2 * tabela[i][(tabela.length - i) -1];
                continue;
            }

            diagonal2 = diagonal2 * tabela[i][tabela.length - i];
        }

        System.out.println(diagonal1);
        System.out.println(diagonal2);

    }
}