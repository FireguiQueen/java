// ARRAYS MULTIDIMENSIONAIS
/*
    Arrays multidimensionais são arrays que contêm outros arrays.
*/

package introducao.g_Array;

public class Aula_023___array_IV
{
    public static void main(String[] args)
    {
        // Nosso array principal representa uma escola.
        // Os arrays dentro dele são os andares, e os valores são as salas.
        int[][] andaresEscola = { {1000, 1001, 1002}, {2000, 2001, 2002}, {3000, 3001, 3002} };

        // Acessando o primeiro array do array principal e seu primeiro valor (posição 0):
        System.out.println(andaresEscola[0][0]); // 1000

        // Acessando o primeiro array do array principal e seu segundo valor (posição 1):
        System.out.println(andaresEscola[0][1]); // 1001

        // ACESSANDO O ÚLTIMO ARRAY DO ARRAY PRINCIPAL E SEU ÚLTIMO ELEMENTO.
        System.out.println(andaresEscola[2][2]); // 3002

        // ITERANDO

        // Criando o nosso array:
        int[][] salasPorAndar = { {1000, 1001, 1002}, {2000, 2001, 2002} };

        // Primeiro, definimos um 'for loop' para iterar sobre o array principal.
        for (int i = 0; i < salasPorAndar.length; i++) {
            // Agora, definimos um 'for loop' para iterar sobre os elementos do array secundário.
            for (int j = 0; j < salasPorAndar[i].length; j++) {
                System.out.println(salasPorAndar[i][j]);
            }
        }

        // EXPLICANDO:
        /*
            O 'for' principal é encontrado.
            Ele define uma variável de controle que recebe 0.
            Condição: i < salasPorAndar.length ou 0 < salasPorAndar.length (2)
            --> como a condição é 'true', o bloco é executado.
            Dentro do bloco, temos um 'for' que itera sobre cada elemento do array[i] (array[0]).

            Em seguida, o 'for' principal começa seu ciclo novamente.
            Condição: i < salasPorAndar.length ou 1 < salasPorAndar.length (2)
            --> como a condição é 'true', o bloco é executado.
            Dentro do bloco, temos um 'for' que itera sobre cada elemento do array[i] (array[1]).

            Depois, o 'for' principal começa seu ciclo novamente.
            Condição: i < salasPorAndar.length ou 2 < salasPorAndar.length (2)
            - FALSE
        */
    }
}
