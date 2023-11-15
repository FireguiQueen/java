// OPERADORES LÓGICOS
/*
    São eles:
    and: &&
    or: ||
    negative: !

    Quando usados em expressões, eles fazem com que a expressão retorne 'TRUE' ou 'FALSE'.

    O operador 'and' (&&) requer que duas expressões sejam verdadeiras para retornar 'TRUE'.
    O operador 'or' (||) requer que apenas uma das duas expressões seja verdadeira para retornar 'TRUE'.
*/
package introducao;

public class Aula_007_operadoresLogicos
{
    public static void main(String[] args)
    {
        // Abaixo, podemos ver o que seria uma expressão "normal".
        int num = (50 + 50) * 2;
        // Nossa expressão retorna o valor de 200.

        // Aqui, podemos ver uma expressão que utiliza um operador de COMPARAÇÃO.
        // Por estamos usando este operador, ela deve retornar 'TRUE' ou 'FALSE'.
        boolean y = 20 > 10;

        // Mas como poderíamos colocar os operadores lógicos em expressões?
        // É bem simples, observe o exemplo abaixo:
        /*
            Estamos construindo um sistema onde avalia a condição financeira da pessoa como "ruim" ou "boa".
            Nosso sistema é bem idiota, mas serve como exemplo.
            Para você ter uma condição financeira boa, você deve atingir os seguintes requisitos, isto é
            AMBAS as perguntas precisam ser respondidas com 'true' para você estar bom financeiramente:
            - Tem uma casa?
            - Tem mais de 30.000 no banco?
        */
        boolean temCasa = true;
        boolean temTrintaMil = true;
        boolean condicaoFinanceiraBoa = temCasa == true  &&  temTrintaMil == true;

        // EXPRESSÃO COMPLETA. Ela é responsável por dizer 'true' ou 'false':
        //  temCasa == true  &&  temTrintaMil == true

        // EXPRESSÕES DENTRO DA NOSSA EXPRESSÃO. Elas são responsáveis por perguntar se as respostas foram respondidas com 'true':
        //  temCasa == true
        //  temTrintaMil == true

        // Primeiro é perguntado se a variável 'temCasa' é igual a 'TRUE'.
        // Depois é perguntado se a variável 'temTrintaMil' é igual a 'TRUE'.
        // E entre essas duas expressões, temos o operador lógico AND.
        // Ele será responsável por capturar as duas respostas, e com base nelas, fazer com que a expressão retorna true ou false.
        // Como as duas são 'true', o and fará com que a expressão retorne 'true'.
    }
}
