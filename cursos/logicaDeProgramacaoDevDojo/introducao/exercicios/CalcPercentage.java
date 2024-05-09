package exercicios;
import java.util.Scanner;

public class CalcPercentage
{
    public static void main(String[] args)
    {
        System.out.print("Digite seu salário: ");
        double salary = new Scanner(System.in).nextDouble();

        System.out.print("Digite a porcentagem que deseja calcular em relação ao valor fornecido: ");
        float percentage = new Scanner(System.in).nextFloat() / 100;

        System.out.println(percentage * salary);
    }
}