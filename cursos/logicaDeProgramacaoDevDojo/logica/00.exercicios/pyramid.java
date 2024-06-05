public class pyramid
{
    public static void main(String[] args)
    {
//     ---*
//     --* *
//     -* * *
//     * * * *

        final int alturaPiramide = 4;

        for (int blocoPiramide = 0, criarBlocos = blocoPiramide+1; blocoPiramide < alturaPiramide; blocoPiramide++)
        {
            System.out.println('#');

            if (blocoPiramide != 0)
            {
                while (blocoPiramide < criarBlocos)
                {
                    System.out.print('#');
                    blocoPiramide = blocoPiramide -1;
                }
            }


        }


    }
}