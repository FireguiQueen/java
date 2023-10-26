// BREAK e CONTINUE
/*
    O 'break' e o 'continue' são palavras chaves, e são usadas dentro de lações de repetição. 
    O 'break' significa "quebrar", quando ele é ativado, nosso laço de repetição é finalizado.

    O 'continue' significa continue, então, quando ele é encontrado, o nosso laço de repetição é
    realizado novamente, independentemente se há mais coisas a serem feitas no bloco "for" por exemplo.

    Mas onde usar o 'break' já que ele finaliza nosso laço de repetição? Qual a vantagem?
    Para ter a resposta, observa o código abaixo: 
*/

import java.util.Scanner; 

public class Aula_26{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int usarioNumero = userInput.nextInt(); // variável 'Usuarionumero' receberá o número digitado pelo usuário.

        for (int i = 0; i <= 10; i++) // variável 'i' recebe 0; Enquanto i for MENOR ou IGUAL a 10. Execute o bloco.
        {
            if (usuarioNumero == i)
            {
                System.out.println("Seu número é: " + i);
            }
            else {
                System.out.println("Seu número não é: " + i);
            }
        }
        
    }
}