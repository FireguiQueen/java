// TIPOS PRIMITIVOS: declaração e tamanho em memória
/*
    Cada tipo primitivo ocupa uma quantidade fixa de bits na memória RAM.
    Por exemplo, o tipo 'int' utiliza 4 bytes (32 bits) para armazenar números inteiros.

    Isso significa que um espaço em memória criado a partir de uma  variável do tipo 'int' pode armazenar valores entre
    aproximadamente -2.100.000.000 e +2.100.000.000.
    Para ultrapassar o valor de 2.100.000.000 seria necessário de mais bits para representar a quantia.
    Para armazenar valores maiores, podemos utilizar o tipo 'long', que utiliza 8 bytes (64 bits) para armazenar números.

    ** ** * * ** * * * * * * * * * * ** * * * * * * * * ** * * ** * *  **  * * ** * *

    Quando declaramos uma variável, como no exemplo:
    int x = 50;

    A primeira etapa é criar um espaço na memória, cuja capacidade de armazenamento é baseada no tipo de dado definido.
    No caso da declaração 'int', espera-se que seja criado um espaço na memória RAM com capacidade para armazenar 4 bytes.

    ** RESUMINDO:
    Entre os tipos primitivos numéricos inteiros (byte, short, int e long), a quantidade de bits utilizada para criar
    espaços na memória RAM varia. Quanto maior a quantidade de bits, maior a capacidade de armazenamento desses espaços na memória.
    E quanto maior a capacidade, maiores números podem ser armazenados
*/


package introducao;

public class Aula_002___tiposPrimitivos_II
{
    public static void main(String[] args)
    {
        // Criando uma variável do tipo 'byte'. Utiliza 1byte para armazenar números
        // -128 até 127
        byte x = 120;

        // Criando uma variável do tipo 'short'. utiliza 2bytes para armazenar números
        // -32768 até 32767
        short y = 30000;


        // O tipo 'char' é usado para armazenar caracteres e utiliza apenas 2 byte na memória.
        char letra = 'a';

        // Podemos fazer variáveis do tipo 'char' receber números:
        char ll = 65; // 'A'
        /*
            E é isso mesmo, você não leu errado: NÚMEROS. A realidade, é que todo caracter, é na realidade, um número.
            No fim das contas, a memória RAM só consegue armazenar bits (zeros e uns), então para armazenar caracteres,
            eles são convertidos em números decimais, que por sua vez são convertidos em números binários.
        */
        // Um exemplo prático disso é:
        char lra = 'a'; // 'a'
        char lra0 = 97; // 'a'
    }
}
