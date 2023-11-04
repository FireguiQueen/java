import java.util.Scanner; 

public class NegativoPositivoZero{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        final long NUMBER = userInput.nextLong();

        if (NUMBER > 0){
            System.out.println("Número positivo.");
        } else if (NUMBER < 0){
            System.out.println("Número negativo.");
        } else {
            System.out.println("Zero. Não é negativo e nem positivo.");
        }

    }
}