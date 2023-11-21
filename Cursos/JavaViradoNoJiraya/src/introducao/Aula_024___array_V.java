package introducao;

public class Aula_024___array_V
{
    public static void main(String[] args)
    {
        int[][] lista = { {50, 20}, {10, 20}};


        for (int arrayElement[] : lista)
        {
            for (int num : arrayElement){
                System.out.println(num);
            }
        }


    }
}
