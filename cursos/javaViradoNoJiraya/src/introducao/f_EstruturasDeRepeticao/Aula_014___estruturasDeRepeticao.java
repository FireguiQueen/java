// ESTRUTURAS DE REPETIÇÃO: While, do while & for
/*
    As estruturas de repetição são utilizadas para repetir determinada instrução/bloco de instruções.
    Elas são de importância para um código limpo e dinâmico.
*/
package introducao.f_EstruturasDeRepeticao;

public class Aula_014___estruturasDeRepeticao
{
    public static void main(String[] args)
    {
        // WHILE
        /*
            Colocaremos a palavra-chave "while" com parênteses abertos e fechados ao seu lado.
            Dentro deles, colocaremos uma expressão booleana.
            "while" significa "enquanto". Enquanto a expressão for verdadeira, execute o bloco de código.
        */

        // Por exemplo (isto causaria uma repetição infinita):
        //>     while (true)
        //>     {
        //>         System.out.println();
        //>     }

        // Para fazer uma estrutura que funcione corretamente, utilize variáveis.
        int g = 0;
        while (g < 10)
        {
            System.out.println("Olá");
            g++;
        }
        /*
            Na primeira vez que o 'while' for executado, será avaliado:
            i < 10 (a variável 'g' (0) é menor do que 10?)
            -> Esta expressão resulta em 'true', pois 'g' é menor do que 10. E então, nosso bloco de código é executado.
            -> Nas instruções deste bloco, dizemos para imprimir "Olá" e incrementar '+1' à variável 'g' (0).

            Agora, na segunda vez, o valor de 'g' foi alterado devido a execução anterior, então será avaliado:
            g < 10 (a variável 'g' (1) é menor do que 10?)
            -> Esta expressão resulta em 'true', pois 'g' é menor do que 10. E então, nosso bloco de código é executado.
            -> Nas instruções deste bloco, dizemos para imprimir "Olá" e incrementar '+1' à variável 'g' (1).

            Isso irá acontecer até chegar ao ponto em que 'g' vale '9', e será perguntado:
            g (9) < 10 (true). O bloco de código é executado e nele há instrução de incrementar '+1' à variável 'g'.
            Agora, 'g' vale 10. E será perguntado:
            g (10) < 10 (false), o loop 'while' é encerrado.
        */


        // ** *** ******* ** *** ******* ** *** ******* ** *** ******* ** *** *******


        // DO WHILE
        /*
            O do-while é bem parecido com o while, mas há uma pequena diferença.
            No while, primeiro nossa expressão é avaliada, se ela for 'true' o bloco é executado, se for 'false',
            o while é encerrado.

            no do-while, primeiro o nosso bloco é executado, e depois nossa expressão é avaliada. Isto é, nosso
            bloco de instruções sempre será executado ao menos uma vez.

            "Atirar primeiro, perguntar depois" ~ do while, 2007
        */
        do
        {
            System.out.println("Esta mensagem será printada só uma vez");
        } while (false);

        // 1. Nosso bloco será executado.
        // 2. Nossa condição é avaliada, se ela for 'false', o do-while é encerrado, se ela for 'true', o bloco 'do' é executado novamente.

        // EXEMPLO PRÁTICO
        int j = 0;
        do
        {
            System.out.println("O valor é: " + j);
            j++;
        } while (j < 3);
        // OUTPUT:
        /*
           * O valor é: 0
           * O valor é: 1
           * O valor é: 2
        */

        // EXPLICANDO CADA CICLO
        /*
            Definimos uma variável chamada 'j', seu valor é 0.

            O bloco 'do' será executado, fazendo com que seja printado:
            "O valor é: 0"
            E depois incrementado '+1' ao valor de 'j'.

            -->> Nossa condição é avaliada: j (1) é menor do que 3? TRUE
            O bloco 'do' será executado, fazendo com que seja printado:
            "O valor é: 1"
            E depois incrementado '+1' ao valor de 'j'.

            -->> Nossa condição é avaliada: j (2) é menor do que 3? TRUE
            O bloco 'do' será executado, fazendo com que seja printado:
            "O valor é: 2"
            E depois incrementado '+1' ao valor de 'j'.

            -->> Nossa condição é avaliada: j (3) é menor do que 3? FALSE. Laço finalizado.
        */

        // ** *** ******* ** *** ******* ** *** ******* ** *** ******* ** *** *******

        // FOR
        // 1. Definimos uma variável de controle
        // 2. Colocamos uma expressão: se ela for true o bloco é executado, do contrário, o loop é encerrado
        // 3. Colocamos um "modificador" para alterar o valor da nossa variável.

        // Em geral, a variável de controle se chamará 'i' (iterador).
        // Iterador se refere ao verbo 'iterar', ou seja, percorrer.
        for (int i = 0; i < 10; i++)
        {
            System.out.println("O valor de 'i' é: " + i);
        }

        // Será definido: i = 0;
        // Será perguntado: i < 10 (0 é menor que 10?)
        // O bloco será executado, e será printado valor de 'i': 0
        // E por fim, será incrementado '+1' a variável 'i'.

        // Agora 'i' vale '1'.
        // Será perguntado: i < 10 (1 é menor que 10?): TRUE
        // O bloco será executado, e será printado valor de 'i': 1
        // E por fim, será incrementado '+1' a variável 'i'.

        // E ISSO VAI ATÉ CHEGAR EM 9.
        // Será perguntado: i < 10 (9 é menor que 10?): TRUE
        // O bloco será executado, e será printado valor de 'i': 9
        // E por fim, será incrementado '+1' a variável 'i'.

        // Agora 'i' vale '10'.
        // Será perguntado: i < 10 (10 é menor que 10?): FALSE. Loop encerrado.

        // AO FIM DE TUDO, O LOOP FOI EXECUTADO 10 VEZES: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 (totaliza 10 vezes)
        // Por convenção, a variável 'i' tende a começar com o valor de '0'.

    }
}
