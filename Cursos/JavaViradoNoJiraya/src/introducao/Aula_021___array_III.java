// ARRAY: iterando (percorrendo)
/*
    "Iterar um array" é a mesma coisa que "percorrer um array", isto é, acessar cada um dos elementos do array.
    Para iterar, podemos usar o for loop.
*/
package introducao;

public class Aula_021___array_III
{
    public static void main(String[] args)
    {
        // define um array de números inteiros. O array pode conter no máximo 2 elementos.
        int[] numerosInteiros = new int[3];

        /*
            Também poderia ser feito assim:
            > int[] numerosInteiros;
            > numerosInteiros = new int[3];
        */

        // definindo valores para o nosso array:
        numerosInteiros[0] = 100;
        numerosInteiros[1] = 500;
        numerosInteiros[2] = 1000;

        // 'length' é a propriedade do objeto 'array'. Ele retorna a quantidade de elementos que o array possui.
        int quantidadeElementos = numerosInteiros.length; // retorna 3

        // irá printar todos os elementos do array: 100, 500, 1000
        for (int i = 0; i < quantidadeElementos; i++)
        {
            System.out.println(numerosInteiros[i]);
        }

        // EXPLICANDO
        /*
            A condição precisa ser "MENOR" pois para acessar um valor de um array, usamos seu indice.
            Então por exemplo, se o array possui 3 elementos, ele possui 2 indices: 0, 1 e 2.

            Primeiro é definido uma variável 'i' e seu valor é '0'.
            > Temos a condição: 0 < quantidadeElementos (3)?
            A condição é verdadeira, então a instrução é executada:
            > System.out.println(numerosInteiros[0]); // printa o valor da posição 0. (primeiro elemento do array)
            > i++

            Agora 'i' vale '1'
            > condição: 1 < quantidadeElementos (3)?
            A condição é verdadeira, então a instrução é executada:
            > System.out.println(numerosInteiros[1]); // printa o valor da posição 1. (segundo elemento do array)
            > i++

            Agora 'i' vale '2'
            > condição: 2 < quantidadeElementos (3)?
            A condição é verdadeira, então a instrução é executada:
            > System.out.println(numerosInteiros[2]); // printa o valor da posição 2. (terceiro elemento do array)
            > i++

            Agora 'i' vale '3'
            > condição: 3 < quantidadeElementos (3)?
            A condição é falsa. O loop é encerrado.


            *** SE A GENTE COLOCASSE 'MAIOR IGUAL': i <= quantidadeElementos
            Quando 'i' valesse '3', a condição seria:
            3 <= quantidadeElementos (3)?
            Verdade, pois mesmo que três não seja menor que três.. três é igual a três.
            O bloco seria executado.
            > System.out.println(numerosInteiros[3]); // printa o valor da posição 3 (mas ele não existe. Retorna erro.)

        */

        // ***** ****** ****** * ****** ****** * * * ***** ****** * ****** ****** ******

        // Bem, talvez agora você tenha entendido o porque a variável 'i' do 'for loop' começa sempre com o valor 0.
        // Todo array começa pela posição zero, isto é, o primeor valor de um array terá a posição 0.
        // Se o nosso 'for loop' começar com o valor de '1', estaremos ignorando o primeiro valor do array.

        int[] centenas = {500, 200, 300};

        for (int i = 1; i < centenas.length; i++)
        {
            System.out.println( centenas[i] );
        }
        // output: 200, 300
    }
}
