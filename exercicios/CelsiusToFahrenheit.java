import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {   
        Scanner userInput = new Scanner(System.in); 

        byte escolha; 
        do {
            System.out.println("Escolha uma das opções abaixo: "); 

            System.out.println("1. Celsius para Fahrenheit;");
            System.out.println("2. Fahrenheit para Celsius. ");
    
            escolha = userInput.nextByte(); 
        } while (escolha != 1 && escolha != 2);

        if (escolha == 1)
        { 
            System.out.print("Digite a temperatura em Celsius: ");
            final double TEMPERATURA = userInput.nextDouble();
            final double RESULTADO = ( (TEMPERATURA * 9) / 5) + 32;
            System.out.println("Resultado: " + RESULTADO);   
        } 
        else
        {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            final double TEMPERATURA = userInput.nextDouble();
            final double RESULTADO = ( (TEMPERATURA - 32) * 5) / 9;
            System.out.println("Resultado: " + RESULTADO);     
        }
    }
}