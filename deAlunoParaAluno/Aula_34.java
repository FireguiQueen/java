// VETORES II: vetores multidimensionais
/*
    Um vetor multidimensional nada mais é do que um vetor que armazena outros vetores.
    Ou seja, o elemento de um vetor multidimensional é um vetor. 
*/

public class Aula_32
{
    public static void main(String[] args)
    {

        // >>> DEFININDO E ACESSANDO VALORES DE UM VETOR NORMAL.

        // 1º - Definimos um array e colocamos seus elementos diretamente.
        int[] lista = {100, 200, 300}; 

        // 2° - Definimos um array e não colocamos seus elementos, apenas definimos quantos elemenetos podem haver
        int[] lista_0 = new int[3];

        // Acessando seus valores:
        System.out.println(lista[0]);  // retorna 100. 
        System.out.println(lista[2]);  // retorna 300. 


        // >>> DEFININDO E ACESSANDO VALORES DE UM VETOR MULTIDIMENSIONAL.

        // 1° - Definimos um array multidimensional colocando seus elementos diretamente.
        int[][] list = { {200, 100}, {400, 2, 4}, {0} };

        // Acessando seus valores:

        // Retorna 200.
        // Entramos no array 'list'. Entramos no primeiro elemento dele (um vetor). Entramos no primeiro elemento deste vetor.
        System.out.println(list[0][0]); 

        // Retorna 4.
        // Entramos no array 'list'. Entramos no segimdp elemento dele (um vetor). Entramos no terceiro elemento deste vetor.
        System.out.println(list[1][2]); 



        // OUTRA FORMA DE CRIAR UM ARRAY MULTIDIMENSIONAL SEM DECLARAR SEUS ELEMENTOS.:

        // Definimos que nosso array principal poderá conter até dois elementos. 
        // Definimos também que os arrays dentro do array principal irão conterão até 5 elementos.
        int[][] listaa = new int[2][5];

        // FOI CRIADO BASICAMENTE ISTO: 
        // int[][] lista = { {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0} };

        // Acessando o primeiro array do nosso array principal.
        // Dizendo que o indice 1 deste array terá o número 50. 
        listaa[0][1] = 50; 

        // Acessando valores
        System.out.println(listaa[0][1]);
    }
}   