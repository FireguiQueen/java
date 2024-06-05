public class FullTable
{
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
        {
            if (i != 0) System.out.println("------------");
            System.out.println("Tabuada de " + i);

            for (int j = 0; j <= 10; j++) {
                System.out.println("" + i + " * " + j + " = " + (i*j));
            }

        }
    }
}