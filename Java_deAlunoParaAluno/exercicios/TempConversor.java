import java.util.Scanner; 

public class TempConversor{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Qual das opções abaixo você deseja.: "); 
        System.out.println("1. Converter de Celsius para Fahrenheit;)"); 
        System.out.println("2. Converter de Fahrenheit para Celcius.");
    

        byte conversor;
        do {
        System.out.print("-> ");
        conversor = userInput.nextByte();
        } 
        while (conversor != 1 && conversor != 0 );


        if (conversor == 1)
        {
            System.out.print("Digite a temperatura em Celcius: ");
            final double temperatura = userInput.nextDouble(); 
            final double FAHRENHEIT = temperatura * 9 / 5 + 32;

            System.out.println("Fahrenheit: " + FAHRENHEIT);
        } 
        else 
        {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            final double temperatura = userInput.nextDouble(); 
            final double CELCIUS = ((temperatura - 32) * 5) / 9;

            System.out.println("Celcius: " + CELCIUS);
        }
  
    }
}