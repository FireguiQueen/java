// ARRAY II: valores padrões
/*
    Quando criamos um array VAZIO de determinado tipo, ele irá armazenar um valor padrão de acordo com o seu tipo de dado.

    - byte, short, int e long: 0
    - float e double: 0.0
    - char: '\u0000' (é o caracter nulo)
    - boolean: false
*/
package introducao.Array;

public class Aula_020___array_II
{
    public static void main(String[] args)
    {
        // array vazio de inteiros.
        int[] arrayDeInteiros = new int[1];
        System.out.println(arrayDeInteiros[0]); // 0

        // array vazio de caracteres
        char[] arrayDeChars = new char[1];
        System.out.println(arrayDeChars[0]); // ' '

        // array vazio de booleanos
        boolean[] arrayDeBooleans = new boolean[3];
        System.out.println(arrayDeBooleans[0]); // false
        System.out.println(arrayDeBooleans[1]); // false
        System.out.println(arrayDeBooleans[2]); // false

        // QUANDO O TIPO DO ARRAY É UM OBJETO, É RETORNADO 'null' (nulo)
        String[] arrayDeString = new String[1];
        System.out.println(arrayDeString[0]); // null



    }
}
