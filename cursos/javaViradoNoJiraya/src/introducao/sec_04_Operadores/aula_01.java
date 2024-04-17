// OPERADORES ARITMÉTICOS
/*
    >> São eles:
    soma: +
    subtração: -
    multiplicação: *
    divisão: /
    resto da divisão: %

    É importante lembrar que o operador de soma (+) não apenas realiza operações aritméticas, mas também é usado para
    concatenar valores. Isso significa unir strings a outras strings ou até mesmo a outros tipos de valores,
    como números e booleanos, resultando em uma nova string que combina todos esses elementos.
*/
package introducao.sec_04_Operadores;

public class aula_01
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

        // Da mesma forma que na matemática, os parênteses definem a ordem das operações:
        System.out.println("Sua idade é: " + (50 + 50));
        // Os cálculos dentro dos parênteses ocorrem primeiro, e então a string é concatenada ao valor resultante.
        // Sua idade é: 100

        // Sem os parênteses, o resultado seria:
        // "Sua idade é: 5050"
        // Isso acontece porque a string se une ao valor de '50', formando uma "nova" string, e essa "nova" string se junta ao outro valor de 50.



        // *** ** * * * * ** ** * * ***** * * * * * ** * * * * * * * * ***




        // UTILIZANDO OS OPERADORES ARITMÉTICOS:

        System.out.println(50 + 10 );  //>  60
        System.out.println(50 - 10);   //>  40
        System.out.println(50 * 10);   //>  500
        System.out.println(50 / 10);   //>  5

        System.out.println(50 % 10);  // Divide 50 por 10 e retorna o resto dessa divisão. > 0

        // Também podemos salvar em variáveis.
        int soma = 50 + 10;
        System.out.println(soma); // 60


        /* ! IMPORTANTE */
        // >> DIVISÃO E MULTIPLICAÇÃO DE NÚMEROS INTEIROS SEMPRE RESULTAM EM INTEIROS.
        // >> DEFINIR O TIPO DE DADO DE UMA VARIÁVEL APENAS DETERMINA SE ELA PODE OU NÃO ACEITAR DETERMINADO TIPO DE DADO.

        // EXEMPLOS:

        // Ao dividir 30 por 8, o resultado correto é 3.75.
        System.out.println(30 / 8); // retorna: 3
        // O '3' foi retornado porque, ao dividir inteiros, o resultado é sempre um inteiro.

        // Mesmo se a variável for do tipo double:
        double numero = 30 / 8;
        // A computação ocorre da direita para a esquerda.
        // Primeiramente, a expressão '30/8' é calculada, e como ambos são inteiros, o resultado é inteiro.
        // Esse número inteiro é então atribuído à variável.

        // Para obter o resultado correto, pelo menos um valor precisa ser um número de ponto flutuante.
        double num = 30 / 8.0; // 3.75

        // Ao definir uma variável double, o valor é automaticamente tratado como decimal, mesmo que não explicitamente definido.
        double numQuebrado = 30;
        System.out.println(numQuebrado); // 30.0

        // Portanto, ao realizar o seguinte cálculo, o resultado será correto:
        double numQ = 30;
        int numI = 7;
        System.out.println(numQ / numI); // equivalente a: 30.0 / 7;



        // CASTING
        /*
            O casting pode ser utilizado nessa situação.
            Ou seja, com duas variáveis do tipo 'int', podemos forçar o cálculo a resultar em um double.
        */
        System.out.println(30 / (double)7); // equivalente a: 30 / 7.0;
    }
}
