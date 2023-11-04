import java.util.Random;
import java.util.Scanner; 

public class Aula_25{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Random randomNumber = new Random(); 
        byte tentativas = 3;

        int randomValue = randomNumber.nextInt(10);
        System.out.println(randomValue); // linha pra gente poder colar na hora de responder haha :) 


        int usuarioChute;
        do {
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite seu chute: ");
            usuarioChute = userInput.nextInt(); 
            tentativas--; 
            
        } while ((usuarioChute != randomValue) && (tentativas != 0));


        if (usuarioChute == randomValue){
            System.out.println("Você acertou, parabéns!");
        } else{
            System.out.println("Você não acertou.");
        }
    }
}