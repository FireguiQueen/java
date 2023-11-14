// OPERADORES ARITMÉTICOS
/*
    >> São eles:
    soma: +
    subtração: -
    multiplicação: *
    divisão: /

    É importante lembrar que o operador de soma (+) não apenas realiza operações aritméticas, mas também é usado para
    concatenar valores. Isso significa unir strings a outras strings ou até mesmo a outros tipos de valores,
    como números e booleanos, resultando em uma nova string que combina todos esses elementos.
*/
package introducao;

public class Aula_005__operadoresAritmeticos
{
    public static void main(String[] args)
    {
        // CONCATENAÇÃO VS SOMA
        /* A concatenação une valores, não realiza operações matemáticas */

        // Por exemplo:
        String nome = "Flora";
        System.out.println("Olá " + nome);
        // Aqui, estamos juntando a string "Olá " com a variável 'nome' (que armazena outra string).
        // No final, estamos concatenando (juntando) duas strings.
        // "Olá Flora"

        // Podemos concatenar DIFERENTES tipos de valores (desde que haja uma string):
        System.out.println("Idade: " + 55);
        // Neste exemplo, estamos unindo a string "Idade: " com um valor inteiro (55).
        // O sinal de soma concatena a string com o valor inteiro, resultando em uma string que contém ambos.
        // "Idade: 55"


        // Quando somamos, estamos fazendo uma operação matemática
        System.out.println(50 + 50); // 100

        // *** ** * * * * ** ** * * ***** * * * * * ** * * * * * * * * ***

        // UTILIZANDO OS OPERADORES ARITMÉTICOS:

        System.out.println(50 + 10 ); // 60
        System.out.println(50 - 10);  // 40
        System.out.println(50 * 10);  // 500
        System.out.println(50 / 10);  // 5

        // Também podemos salvar em variáveis.
        int soma = 50 + 10;
        System.out.println(soma); // 60


        /* ! IMPORTANTE */
        // >> NÚMEROS INTEIROS DIVIDIDOS/MULTIPLICADOS POR OUTROS INTEIROS, SEMPRE RESULTARAM EM INTEIROS.
        // >> DEFINIR O TIPO DE DADO DE UMA VARIÁVEL SÓ INFORMA A ELA SE ELA PODE OU NAO ACEITAR DETERMINADO TIPO DE DADO.

        // EXEMPLOS:

        // Vamos realizar a conta de 30 dividido para 8. O resultado correto é: 3.75
        System.out.println(30 / 8); // retorna: 3
        // O '3' foi retornado porque justamente, inteiros divididos por interiros, sempre resultaram em inteiros.

        // Mesmo que a variável seja double:
        double numero = 30 / 8;
        // As coisas vão da direita para a esquerda.
        // Primeiro é realizado a nossa expressão: '30/8'. Como ambos são inteiros, o resultado será um inteiro.
        // Ao final dela, será resultado em um número inteiro, e este número será salvo na variável.

        // Para que obtenhamos o resultado correto, ao menos um valores precisa ser um numero de ponto flutuante.
        double num = 30 / 8.0; // 3.75

        // Quando definimos uma variável do tipo double, seu valor automaticamente receberá um '.0' mesmo que não seja definido.
        double numQuebrado = 30;
        System.out.println(numQuebrado); // 30.0

        // Por isso, se fizermos a seguinte conta, o resultado será correto:
        double numQ = 30;
        int numI = 7;
        System.out.println(numQ / numI); // seria o mesmo que fazer: 30.0 / 7;

        // CASTING
        /*
            Também podemos usar o casting nesta situação.
            Isto é, temos duas variáveis do tipo 'int', mas na hora do calculo, podemos forçar o valor a virar um double.
        */
        System.out.println( 30 / (double)7 ); // seria o mesmo que fazer: 30 / 7.0;
    }
}
