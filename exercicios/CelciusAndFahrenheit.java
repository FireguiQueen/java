// O usuário deve escolher uma das opções abaixo:
// Celcius -> Fahrenheit = .. 
// Fahrenheit -> Celcius = .. 

import java.util.Scanner;

public class CelciusAndFahrenheit
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in); 

        byte escolhaUsuario; 
        do 
        {
            System.out.println("Escolha umas das opções abaixo: ");
            System.out.println("1. Celcius para Fahrenheit; ");
            System.out.println("2. Fahrenheit para Celcius; ");

            escolhaUsuario = userInput.nextByte();  
        } while (escolhaUsuario != 1 && escolhaUsuario != 2);

        if (escolhaUsuario == 1)
        {
            // (0°C × 9/5) + 32 = 32°F
            System.out.print("Digite a temperatura em Celcius: "); 
            final double TEMPERATURA = userInput.nextDouble();
            final double FAHRENHEIT = ( (TEMPERATURA * 9) / 5) + 32;
            System.out.println("Fahrenheit: " + FAHRENHEIT); 
        } else {
            // (32°F − 32) × 5/9 = 0°C
            System.out.print("Digite a temperatura em Fahrenheit: "); 
            final double TEMPERATURA = userInput.nextDouble();
            final double CELCIUS = ((TEMPERATURA - 32) * 5) / 9;
            System.out.println("Celcius: " + CELCIUS);
        }
    }
}