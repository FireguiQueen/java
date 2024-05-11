public class Taxes
{
    public static void main(String[] args)
    {
        double salary = 540000;

        if (salary >= 4500)
        {
            System.out.println("Taxes you must pay: " + (salary * 0.30));
        } else
        {
            System.out.println("Taxes you must pay: " + (salary * 0.15));
        }
    }
}