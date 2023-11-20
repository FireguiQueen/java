// ARRAYS MULTDIMENSIONAIS
/*
    Nada mais é do que um array que contem outros arrays.
*/

package introducao;

public class Aula_023___array_IV
{
    public static void main(String[] args)
    {
        // nosso array principal é a nossa escola
        // os arrays dentro dele são os andares, e os valores dele, são as salas.
        int[][] andaresEscola = { {1000, 1001, 1002}, {2000, 2001, 2002}, {3000, 3001, 3002} };

        // Acessando o primeiro array do array principal e acessando seu primeiro valor (posição 0):
        System.out.println(andaresEscola[0][0]); // 1000

        // Acessando o primeiro array do array principal; e acessando seu segundo valor (posição 1)
        System.out.println(andaresEscola[0][1]); // 1001

        // ACESSANDO O ÚLTIMO ARRAY DO NOSSO ARRAY PRINCIPAL; E ACESSANDO O ULTIMO ELEMENTO.
        System.out.println(andaresEscola[2][2]); // 3002


        // ITERANDO

        // criando o nosso array:
        int[][] salasPorAndar = { {1000, 1001, 1002}, {2000, 2001, 2002} };

        // Primeiro definimos um 'for loop' para iterar sobre o array principal.
        for (int i = 0; i < salasPorAndar.length; i++)
        {
            // Agora definimos um 'for loop' para iterar sobre os elementos do array secundario;
            for (int j = 0; j < salasPorAndar[i].length; j++)
            {
                System.out.println(salasPorAndar[i][j]);
            }
        }

        // EXPLICANDO:
        /*
            O 'for' principal será encontrado.
            Ele define uma variável de controle, ela recebe 0.
            Condição: i < salasPorAndar.length    ou   0 < salasPorAndar.length (2)
            --> como a condição é 'true', o bloco é executado.
            Dentro do bloco temos um 'for' que iterará sobre cada elemento do array[i] (array[0]

            Depois o for principal começa seu ciclo novamente.
            Condição: i < salasPorAndar.length    ou   1 < salasPorAndar.length (2)
            --> como a condição é 'true', o bloco é executado.
            Dentro do bloco temos um 'for' que iterará sobre cada elemento do array[i] (array[1])

            Depois o for principal começa seu ciclo novamente.
            Condição: i < salasPorAndar.length    ou   2 < salasPorAndar.length (2)
            - FALSE
        */

    }
}
