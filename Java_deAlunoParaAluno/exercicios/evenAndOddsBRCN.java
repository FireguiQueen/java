import java.util.Scanner;

public class evenAndOddsBRCN{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        int numero;
        do {
            System.out.print("Digite um número inteiro positivo: "); 
            numero = userInput.nextInt();
        } while (numero <= 0);

        // Irá imprimir apenas números pares. Excluindo números multiplos de 7. 

        for (int i = 1; i <= numero; i++)
        {
            if (i % 10 == 0)
            {
                break;
            }

            else if ( (i % 2 == 0) && (i % 7 != 0) )
            {
                System.out.println(i);
                continue;
            } 

        }


    }
}