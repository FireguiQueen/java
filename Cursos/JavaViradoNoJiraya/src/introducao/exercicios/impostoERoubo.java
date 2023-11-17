package introducao.exercicios;

public class impostoERoubo
{
    public static void main(String[] args)
    {
        double annualSalary = 60000;
        double totalTaxes;

        if (annualSalary >= 0 && annualSalary <= 34712)
        {
            totalTaxes = 9.70;
        }
        else if (annualSalary >= 34713 && annualSalary <= 68507)
        {
            totalTaxes = 37.35;
        } else
        {
            totalTaxes = 49.50;
        }
        annualSalary -= annualSalary * (totalTaxes / 100);
        System.out.println("Valor liq.: " + annualSalary + "\nTotal taxes: " + totalTaxes + "%");
    }
}
