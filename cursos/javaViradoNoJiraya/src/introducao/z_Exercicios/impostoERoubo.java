package introducao.z_Exercicios;
import java.util.Scanner;

public class impostoERoubo
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Digite seu salário anual: ");
        double annualSalary = userInput.nextDouble();
        double liqSalary = annualSalary;
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
            totalTaxes = 49.5;
        }
        liqSalary -= liqSalary * (totalTaxes/100);
        System.out.println("Salário anual: " + annualSalary);
        System.out.println("Valor liq.: " + liqSalary);
        System.out.printf("Valor pago de imposto: £%.2f (%.2f%c)", annualSalary * (totalTaxes/100), totalTaxes, '%');
    }
}
