// Arrays e laços de repetição

import java.util.Scanner; // IGNORAR


public class Aula_31{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // IGNORAR


        // Na aula 30 vimos que é possivel declarar um array e só depois atribuir valorea a ele.
        // Bem, isso na verdade, é bem útil em alguns casos.


        // Mas vamos começar do básico. 
        // Como podemos imprimir todos os elementos de um array usando um laço de repetição? 

        // Aqui temos nosso array. Nossa variável especial.
        // Ela armazena diversas strings. Diversos nomes. 
        String[] personagens = {"Walter W.", "Gus Fring", "Mike"};

        // Podemos usar o "for loop" para iterar sobre este array.
        // O que é "iterar"? Iterar significa percorrer, ou seja, iremos percorrer o nosso array.
        // Indo de elemento por elemento. 

        // Com uma contagem rápida, sabemos que há 3 elementos no nosso array "personagens".
        // Sendo assim, nossa condição irá se basear nisso.

        for (int i = 0; i < 3; i++)
        {
            System.out.println(personagens[i]);
        }

        // Vamos entender um pouco melhor o código.
        /*
            Primeiro é definido nossa variável de controle. Ela recebe o valor de 0.

            Agora temos a condição, para saber se o 'for loop' deve ser executado ou não.

            É perguntado "i é menor do que 3".
                - Por que razão usamos o número '3'? 
                o '3' é a quantidade de elementos do nosso array. Há 3 nomes. 

                - Por que motivo usamos o sinal de "menor" e não "menor igual" (<=);
                Não se esqueça, o primeiro elemento tem o indice 0. Por este motivo, se criarmos um array
                de 4 elementos, significa que haverá 3 indices (0, 1, 2 e 3).

                Então se usassemos o "menor igual (<=)", quando a variável 'i' chegasse ao valor 3, 
                seria perguntado:
                i (3) é menor ou igual a 3? TRUE.
                Por mais que i (3) não seja menor do que 3, i (3) é igual a 3. 
                Logo, nosso bloco é executado, e na hora de escolher o indice do array, o indice 3 será
                escolhido, mas o indice 3 se refere ao quarto elemento, que inclusive, não existe.
        */


        // Onde mais pode ser útil usar laços de repetição com arrays?
        /*
            Vamos criar um programa que pede fixamente 3 notas.
            O primeiro valor que o usuário digitar, irá para o nosso array. Será o primeiro elemento, índice 0.
            O segundo valor, também irá ir pro array. Será o segundo elemento, índice 1. 
            O terceiro será o terceiro elemento, índice 2.
        */

        int[] notas = new int[3]; // define um array que pode conter 3 elementos. 

        for (int i = 0; i < 3; i++)
        {
            notas[i] = input.nextInt();
        }

        // ENTENDENDO LINHA POR LINHA.
        /*
            Quando o nosso 'for loop' for executado pela primeira vez, ocorrerá o seguinte:

            i (0) é menor do que 3? TRUE.
                notas[i], será, na verdade, notas[0].
                Sendo assim, teremos: 
                    notas[0] = valorDigitadoPeloUsuário.

                Por fim, será adiciona +1 a variável 'i'.



            Na segunda vez, ocorrerá o seguinte:

            i (1) é menor do que 3? TRUE.
                notas[i], será, na verdade, notas[1]. 
                Sendo assim, teremos:
                    notas[1] = valorDigitadoPeloUsuário.
                
                    Por fim, será adiciona +1 a variável 'i'.



            Na terceira vez, ocorrerá o seguinte:

            i (2) é menor do que 3? TRUE.
                notas[i], será, na verdade, notas[2]. 
                Sendo assim, teremos:
                    notas[2] = valorDigitadoPeloUsuário.
                
                    Por fim, será adiciona +1 a variável 'i'.



            
            Na terceira vez, ocorrerá o seguinte:

            i (3) é menor do que 3? FALSE (pois 3 não é menor do que 3).

            -->> O problema seria se a gente tivesse usado o menor igual (<=).
            Então esta condição seria true, logo, seria:
                notas[i], será, na verdade, notas[3]. 
                Sendo assim, teremos:
                    notas[3] = valorDigitadoPeloUsuário.
                
                    O PROBLEMA É QUE o INDICE 3 NÃO EXISTE, POIS ELE SE REFERE AO QUARTO ELEMENTO. 
                    E O QUARTO ELEMENTO NÃO EXISTE.
        */


    }
}