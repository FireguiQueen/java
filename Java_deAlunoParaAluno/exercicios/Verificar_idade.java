import java.util.Scanner;

public class Verificar_idade{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        final byte IDADE = userInput.nextByte();

        if (IDADE >= 18)
        {
            System.out.println("Você é de maior. Vocẽ pode dirigir, beber whisky, gin e vodka :). O que eu não recomendo.");
        } else{
            System.out.println("Você é de menor. Aproveite enquanto seu tempo livre, estude mais.");
            System.out.println("Escola é overrated, não estude na escola. Estude em casa, melhore seu inglês.");
        }  
    }
}