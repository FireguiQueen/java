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
        int usuarioNumero = userInput.nextInt(); // variável 'Usuarionumero' receberá o número digitado pelo usuário.

        for (int i = 0; i <= 10; i++) // variável 'i' recebe 0; Enquanto i for MENOR ou IGUAL a 10. Execute o bloco.
        {
            if (usuarioNumero == i)
            {
                System.out.println("Seu número é: " + i);
                break;
            }
            else {
                System.out.println("Seu número não é: " + i);
            }
        }

        /*
            O usuário precisa digitar um número, então vamos supor que o usuário digite o número 1. 
            Logo em seguida temos um 'for loop'.

            Na primeira vez do loop, a sua variável de controle vale '0'.
            Então temos a condição: i (0) é menor ou igual a 10? 
            A condição é verdadeira, pois i (0) é menor do que 10, então nosso bloco é executado.

            No bloco temos uma condicional perguntando:
                "O número digitado pelo usuário é igual a i (0)"? 
                    > este bloco não será executado, pois o número digitado pelo usuário não é igual a i (0).

                Sendo assim, o bloco "else" será executado, printando a seguinte string no terminal:
                "Seu número não é: i", ou seja, o número digitado pelo usuário não é zero.
                
                Por fim, é adicionado +1 a nossa variável de controle.


            Agora estamos na segunda repetição do laço. A nossa variável de controle (i) vale 1 (devido ao incremento).
            Então temos a condição do "for": a variável i (1) é menor ou igual a 10? 
            A condição é verdadeira, pois i (1) é menor do que 10, então nosso bloco é executado.

            No bloco temos uma condicional perguntando:
                "O número digitado pelo usuário é igual a i (1)"? 
                    > este bloco será executado, pois o número digitado pelo usuário (1) é igual a i (1).
                    Logo em seguida, vemos a palavra "break", ou seja, FINALIZE o laço de repetição.
                    Então teremos o laço finalizado. O 'for' não irá se repetir mais, mesmo que sua condição
                    seja verdadeira.

            
            Conclusão: 
                Se não houvesse o "break" neste código, nosso "for" iria se repetir novamente, pois a condição:
                "i <= 10" é VERDADEIRA. 

                Mas o break finalizou o 'for'. 
            */ 

            // SEM O BREAK. Considere que o usuário tenha digitado o número 7. : 
            /*
                Seu número não é: 0
                Seu número não é: 1
                Seu número não é: 2
                Seu número não é: 3
                Seu número não é: 4
                Seu número não é: 5
                Seu número não é: 6
                Seu número é: 7
                Seu número não é: 8
                Seu número não é: 9
                Seu número não é: 10
            */

            // COM O BREAK. 
            /*
                Seu número não é: 0
                Seu número não é: 1
                Seu número não é: 2
                Seu número não é: 3
                Seu número não é: 4
                Seu número não é: 5
                Seu número não é: 6
                Seu número é: 7
            */

    }
}