// ARRAYS MULTIDIMENSIONAIS: tipos de inicialização
package introducao.g_Array;

public class Aula_025___array_VI
{
    public static void main(String[] args)
    {
        // PODEMOS INICIALIZAR UM ARRAY MULTIDIMENSIONAL DE ALGUMS MANEIRAS.

        // Aqui estamos criando um array que pode receber outros arrays.
        // Mas como não passamos a quantidade de elementos que os arrays secundarios irão conter, eles terão o valor 'null'
        int[][] arrVazio = new int[2][];

        // Agora podemos criar referencias a os arrays do array principal
        arrVazio[0] = new int[2]; // posição 0 do array principal ira fazer referencia a um array de 2 elementos
        arrVazio[1] = new int[5]; // posição 1 do array principal ira fazer referencia a um array de 5 elementos

    }
}
