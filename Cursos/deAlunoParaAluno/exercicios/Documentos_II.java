import java.util.Scanner; 


public class Documentos_II
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
    
        System.out.print("Digite seu nome: ");
        final String NOME = userInput.next();
        
        System.out.print("Digite seu CPF: ");
        final long CPF = userInput.nextLong();

        System.out.print("Digite sua idade: ");
        final byte IDADE = userInput.nextByte();

        System.out.println("Nome: " + NOME); 
        System.out.println("Idade: " + IDADE); 
        System.out.println("CPF: " + CPF); 

    }
}