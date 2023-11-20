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

    }



}
