public class Taxes
{
    public static void main(String[] args) {
        double salary = 2400;

        if (salary >= 4500) {
            System.out.println((salary * 0.30) + " 30%");
        } else {
            System.out.println((salary * 0.10) + " 10%");
        }
    }
}