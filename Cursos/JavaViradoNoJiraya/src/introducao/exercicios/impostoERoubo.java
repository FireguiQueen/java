package introducao.exercicios;

public class impostoERoubo
{
    public static void main(String[] args)
    {
        double salary = 80000;
        double totalTaxes;

        if (salary >= 0 && salary <= 34712)
        {
            totalTaxes = 9.70;
        }
        else if (salary >= 34713 && salary <= 68507)
        {
            totalTaxes = 37.35;
        } else
        {
            totalTaxes = 49.50;
        }
        salary -= salary * (totalTaxes / 100);
        System.out.println("Valor liq.: " + salary + "\nTotal taxes: " + totalTaxes + "%");
    }
}
