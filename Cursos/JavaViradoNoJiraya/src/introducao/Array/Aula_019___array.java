// ARRAYS: o que é; declaração; enderaçamento, elementos..
/*
    Um array é variável capaz de armazenar uma coleção de dados, isto é, um conjunto de elementos do mesmo tipo.. Ou
    em outras palavras, um array é uma estrutura que armazena diversos valores do mesmo tipo.
    > int[] arrayDeInteiros = {1, 2, 3, 4, 5};


    Uma variável normal é capaz de armazenar somente um valor, como por exemplo:
    > int x = 50;
    E esta variável é do tipo primitivo. Os tipos primitivos são tipos de dados básicos que representam valores simples, como
    números inteiros, números de ponto flutuante e caracteres.
    Quando chamamos uma variável do tipo primitivo, é criado uma cópia do valor dela.
    --> Colocar 'System.out.println(x)' seria a mesma coisa que colocar 'System.out.println(50)'.

    Um array é uma variável especial capaz de armazenar um ou mais valores.
    E esta variável é do tipo de referência. Ss tipos de referência são variáveis que contêm uma referência ou
    endereço de memória que aponta para um objeto.
*/
package introducao.Array;


public class Aula_019___array
{
    public static void main(String[] args)
    {
        // Neste casso, o objeto é o nosso array em si, o objeto é a nossa estrutura que está armazenando diversos valores do mesmo tipo de dado.
        int[] listaDeNumeros = {10, 20, 30};  // um array de números inteiros

        // Printa o nosso array dessa forma nos informa, na verdade, o endereço do objeto.
        // Pois como foi dito anteriormente, a variável salva o endereço de onde nossos valores estão armazenados.
        System.out.println(listaDeNumeros);    // [I@3fee733d

        // Para printar um elemento (valor) de um array, você deve utilizar os colchetes.
        // Fazer isso, é equivalente a chegar numa rua e acessar uma casa.
        // A rua é o nosso array, e ela contem diversas casas (valores).
        System.out.println(listaDeNumeros[0]);  // 10


        // Também podemos criar um array vazio. Aqui será criado um array que pode conter no máximo 3 elementos (valores)
        int[] arrayVazio = new int[3];

        // Agora, podemos definir seus valores.
        // É como entrar numa rua (arrayVazio) e entrar nas casas (valores). Começamos pela "casa 0".
        // E após isso, podemos atribuir valores a essas casas. 
        arrayVazio[0] = 30; // posição 0: 30
        arrayVazio[1] = 40; // posição 1: 40
        arrayVazio[2] = 50; // posição 2: 50

        // NÃO PODEMOS FAZER ISTO, POIS A POSIÇÃO '3' NÃO EXISTE
        // > arrayVazio[3] = 60;

        // LEMBRÊ-SE, CRIAR UM ARRAY DE 3 ELEMENTOS GERA TRÊS INDICES (POSIÇÕES).
        // indice 0
        // indice 1
        // indice 2

    }
}
