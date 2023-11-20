package introducao.exercicios;

public class range
{
    public static void main(String[] args)
    {
        int start = 63;
        int end = 61;

        if (start > end)
        {
            System.out.println("O range de inicio não pode ser menor que o range final");
        } else
        {
            for (int i = start; i <= end; i++)
            {
                System.out.println(i);
            }
        }


    }
}
