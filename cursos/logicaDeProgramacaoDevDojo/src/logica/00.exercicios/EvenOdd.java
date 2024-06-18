public class EvenOdd
{
    public static void main(String[] args)
    {
        int num = 50;
        String evenOdd = "";

        if (num % 2 == 0)
        {
            evenOdd = "Par.";
        } else {
            evenOdd = "Impar";
        }

        System.out.println("" + num + ": " + evenOdd);
    }
}