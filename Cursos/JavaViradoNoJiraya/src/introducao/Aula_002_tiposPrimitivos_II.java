// TIPOS PRIMITIVOS: declaração e tamanho em memória
/*
    Cada tipo PRIMITIVO ocupa uma quantidade fixa de bits na memória RAM.
    Isto é, o tipo 'int' utiliza 4bytes (32 bits) para armazenar números inteiros.

    Isto é, um espaço em memória criado a partir de uma variável do tipo 'int', só consegue armazenar
    valores entre -2.100.000.000 até +2.100.000.000
    Isto ocorre justamente porque o int utiliza apenas 4bytes para armazenar números.
    Se ultrapassarmos, por exemplo, do número '2.100.000.000' precisaremos de mais bits para representar esta quantia.

    Para armazenar valores mais altos, utilize o tipo 'long'. O tipo 'long' utiliza 8bytes (64bits) para armazenar
    valores.

    Então, podemos penar que, quando criamos uma variável, por exemplo:
    int x = 50;

    A primeira coisa a ser feita é, criar um espaço em memória, onde sua capacidade de armzenato se baseia
    no tipo de dado definido.
    Como o tipo de dado definido na declaração foi 'int', então, é de se esperar que um espaço na memória RAM
    seja criado com uma capacidade de armazenaot de 4bytes.
*/

package introducao;

public class Aula_002_tiposPrimitivos_II
{
    public static void main(String[] args)
    {
        // Criando uma variável do tipo 'byte' (ela utiliza 1byte para armazenar números)
        byte x = 120;

        // Criando uma variável do tipo 'short' (ela utiliza 3bytes para armazenar números
    }
}
