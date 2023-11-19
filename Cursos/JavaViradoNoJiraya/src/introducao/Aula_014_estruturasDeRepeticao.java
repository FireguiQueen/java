// ESTRUTURAS DE REPETIÇÃO: While, do while & for
/*
    As estruturas de repetição são utilizadas para repetir determinada instrução/bloco de instruções.
    Elas são de importância para um código limpo e dinâmico.
*/
package introducao;

public class Aula_014_estruturasDeRepeticao
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
        int i = 0;
        while (i < 10)
        {
            System.out.println("Olá");
            i++;
        }
        /*
            Na primeira vez que o 'while' for executado, será avaliado:
            i < 10 (a variável 'i' (0) é menor do que 10?)
            -> Esta expressão resulta em 'true', pois 'i' é menor do que 10. E então, nosso bloco de código é executado.
            -> Nas instruções deste bloco, dizemos para imprimir "Olá" e incrementar '+1' à variável 'i' (0).

            Agora, na segunda vez, o valor de 'i' foi alterado devido a execução anterior, então será avaliado:
            i < 10 (a variável 'i' (1) é menor do que 10?)
            -> Esta expressão resulta em 'true', pois 'i' é menor do que 10. E então, nosso bloco de código é executado.
            -> Nas instruções deste bloco, dizemos para imprimir "Olá" e incrementar '+1' à variável 'i' (1).

            Isso irá acontecer até chegar ao ponto em que 'i' vale '9', e será perguntado:
            i (9) < 10 (true). O bloco de código é executado e nele há instrução de incrementar '+1' à variável 'i'.
            Agora, 'i' vale 10. E será perguntado:
            i (10) < 10 (false), o loop 'while' é encerrado.
        */


        
    }
}
