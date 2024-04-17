// OPERADORES DE COMPARAÇÃO
/*
    São eles:
    maior: >
    maior-ou-igual: >=
    menor: <
    menor-ou-igual: <=
    diferente: !=
    igual: ==

    Os operadores de comparação SEMPRE irão retornar um valor booleano.
    Ou seja, quando colocados em expressões, será sempre retornado 'TRUE' ou 'FALSE'.
*/
package introducao.d_Operadores;

public class Aula_006___operadoresDeComparacao
{
    public static void main(String[] args)
    {
        // Variáveis do tipo boolean só podem armazenar 'TRUE' ou 'FALSE'.
        // Mas como os operadores de comparação retornam sempre true ou false
        // Podemos colocar expressoes com numeros usando este tipo de dado (contanto que haja um operador de comparação)
        boolean num1MaiorQueNum2 = 10 > 20;
        System.out.println(num1MaiorQueNum2); // retorna 'false'. Pois 10 é maior que 20.

        // UTILIZANDO OS OPERADORES DE COMPARAÇÃO:

        // Perguntando se CINCO é maior que VINTE
        System.out.println(5 > 20); // false

        // Perguntando se CINCO é maior que CINCO
        System.out.println(5 > 50); // false

        // Perguntanso se CINCO é maior ou igual a CINCO
        System.out.println(5 >= 5); // true. Por mais que cinco não seja maior que cinco; cinco é igual a cinco.

        // Perguntando se DOIS é menor que DEZ
        System.out.println(2 < 10); // true

        // Perguntando se DOIS é maior que DEZ
        System.out.println(2 > 10); // false

        // Perguntando se TRÊS é igual a TRÊS
        System.out.println(3 == 3); // true

        // Perguntando se TRÊS é diferente de TRÊS
        System.out.println(3 != 3); // false



    }
}
