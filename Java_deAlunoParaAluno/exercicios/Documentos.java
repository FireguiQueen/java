import java.util.Scanner;

public class Documentos{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu CPF: ");
        final long CPF = input.nextLong();

        System.out.print("Sua idade: ");
        final int IDADE = input.nextInt();

        System.out.println(CPF + ", " + IDADE);

    }
}