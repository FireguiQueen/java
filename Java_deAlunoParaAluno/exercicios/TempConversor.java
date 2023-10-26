import java.util.Scanner; 

public class TempConversor{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Qual das opções abaixo você deseja.: "); 
        System.out.println("1. Converter de Celsius para Fahrenheit;)"); 
        System.out.println("2. Converter de Fahrenheit para Celcius.");
    
        do {
        System.out.print("-> ");
        byte conversor = userInput.nextByte();
        } 
        while (conversor >= 3 && conversor <= 0 )


        if (conversor == 1)
        {
            System.out.print("Digite a temperatura em Celcius: ");
            int temperatura = userInput.nextInt(); 
            System.out.println(((temperatura * 9) / 5) + 32 );
        } else {
            // ( °F − 32) × 5/9 
            System.out.print("Digite a temperatura em Fahrenheit: ");
            int temperatura = userInput.nextInt(); 
            System.out.println(((temperatura - 32) * 5) / 9);
        }
  

    }
}