package introducao.exercicios;

public class impostoERoubo
{
    public static void main(String[] args)
    {
        double salary = 5000;
        double totalTaxes;

        if (salary >= 0 && salary <= 34712)
        {
            totalTaxes = 9.70;
            salary *= totalTaxes / 100;
        } else if (salary >= 34713 && salario <= 68507)
        {
            totalTaxes = 37.35;
            salary *= totalTaxes / 100;
        }

        System.out.println("Valor liq.: " + salario + ". Total texes: " + taxe);
    }
}
