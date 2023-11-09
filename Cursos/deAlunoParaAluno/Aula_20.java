// OPERADORES LÓGICOS E OPERADORES DE COMPARAÇÃO
/*
    && - Operador lógico "and". Ele requer que duas ou mais expressões booleanas sejam TRUE para retornar TRUE.
    || - Operador lógico "or". Ele quer que APENAS UMA das expressões booleanas seja TRUE. para retornar TRUE.

    Os operadores lógicos '&&' e '||' são usados entre duas ou mais expressões.
    Utilizamos eles para fazer muitas coisas, como por exemplo, validações.

    Vamos pensar em um sistema de login.
    Ele requer duas coisas para te dar acesso a sua conta:
    - Você precisa digitar o nome de usuário corretamente
    - Você precisa digitar a senha do usuário corretamente

    Como esta validação requer que AMBAS as expressões sejam VERDADEIRAS,
    podemos usar o operador lógico '&&'.
*/

public class Aula_20 {
    public static void main(String[] args) {

        // EXEMPLOS COM: &&
        int num01 = 50;
        int num02 = 20;

        // "A variável num01 é maior do que 30 E (and) a variável num02 é maior do que 10?"
        // Esta expressão retorna 'TRUE' se AMBAS as condições forem verdadeiras.

        // Utilizando o operador '&&', ambas as expressões precisam ser verdadeiras para resultar em 'TRUE'.
        // Expressão 1: num01 > 30 (true)
        // Expressão 2: num02 > 10 (true)
        // Como ambas são verdadeiras, a expressão completa nos retornar o valor 'true'.
        // Este valor fica armazenado em nosso IF, logo, o bloco é executado.
        if (num01 > 30 && num02 > 10) {
            System.out.println(" :) ");
        }


        // Este bloco será executado pois ambas as expressões são verdadeiras.
        // Dez é maior que zero  AND  trinta é maior que zero.
        if (10 > 0 && 30 > 0) {
            System.out.println(" :) ");
        }

        // Este bloco não será executado pois APENAS UMA expressão é verdadeira.
        // -->> Para que ele seja executado, ambas precisam ser verdades.
        if (20 > 10 && 40 > 50) {
            System.out.println(" :( ");
        }


        // EXEMPLOS COM: ||
        int num03 = 20;
        int num04 = 10;

        // "num03 é maior do que 5" OR "num04 é maior do que 100?"
        // Para ser retornado o valor de 'true', apenas uma das expressões precisam ser verdadeiras.

        // A variável 'num04' não é maior do que 100, mas a variável 'num03' é maior do que 5.
        // Como o "||" exige que apenas uma expressão seja verdadeira, nossa expressão completa retorna o valor 'true'.
        // Agora, o 'if' armazena o valor 'true' entre parentêsis, e o bloco é executado.
        if (num03 > 5 || num04 > 100) {
            System.out.println(" :) ");
        }

        // Este bloco não será executado pois nenhuma única expressão é verdadeira.
        if (0 > 5 || 50 > 100)
        {
            System.out.println(" :( ");
        }


        /*  OPERADORES DE COMPARAÇÃO */
        // Em teoria, variáveis booleanas só podem conter dois valores: TRUE ou FALSE.
        boolean y = true;
        boolean z = false;

        // Os operadores de comparação comparação valores, e retornam 'true' ou 'false'.
        // Os números, quando combinados com esses operadores, irão resultar em 'true' ou 'false.'
        /*
            Por exemplo, o operador ">", compara se um valor é maior que o outro.
            ->> Se o valor01 for maior que o valor02, ele retorna 'true'; caso contrário, retorna 'false'.

            Temos também o operador ">=", que compara se um valor é MAIOR ou IGUAL ao outro.
            Ele requerer que o número seja MAIOR ou IGUAL ao outro valor.
            ->> Se for maior, retorna 'true'; se for igual, retorna 'true', se for menor, retorna 'false'.
        */

        // Retorna ERRO (estamos tentando armazenar um número numa variável booleana).
        // boolean x = 5;

        // Não retorna erro. Pois agora a variável 'x' irá valer FALSE devido ao OPERADOR DE COMPARAÇÃO.
        // Isto é, nossa expressão  "5>5" será analisada e irá retornar um valor boolean. Este valor será salvo na variável. 
        boolean x = 5 > 5;


        // Retorna 'true' pois 4 é menor do que cinco
        // 4 < 5

        // Retorna 'true'. 3 não é maior que 3, mas ele é igual a 3.
        // 3 >= 3
    }
}
