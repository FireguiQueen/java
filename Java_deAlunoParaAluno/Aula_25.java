import java.util.*; 

public class Aula_25{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Random randomNumber = new Random(); 
        byte tentativas = 3;

        int randomValue = randomNumber.nextInt();
        System.out.println(randomValue);


        int usuarioChute;
        do {
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite seu chute: ");
            usuarioChute = userInput.nextInt(); 
            tentativas--; 
            
        } while ((usuarioChute != randomValue) && tentativas != 0);
    }
}