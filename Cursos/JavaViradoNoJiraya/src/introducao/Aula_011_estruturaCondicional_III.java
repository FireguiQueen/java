// ESTRUTURA CONDICIONAL: OPERADOR CONDICIONAL/TERNÁRIO
/*
    O operador ternário é utilizado para substituir uma estrutura condicional simples,
    que envolva apenas um "if" e um "else".
*/
package introducao;


public class Aula_011_estruturaCondicional_III
{
    public static void main(String[] args) {
        // Começaremos com uma expressão e uma interrogação.
        // Caso ela seja avaliada como "true", a primeira parte é retornada, caso seja false, a segunda parte será.

        double contaBancaria = 8000;
        String resultado = (contaBancaria >= 3000) ? "Vou comprar o PS5" : "Não vou comprar o PS5";
        System.out.println(resultado);

        // Primeiro, foi definida uma variável do tipo double, representando o nosso saldo do banco.
        // Depois, temos a expressão "contaBancaria >= 3000".
        // >> Se for 'true', será retornado "Vou comprar o PS5" a variável 'resultado'.
        // >> Se for 'false', será retornado "Não vou comprar o PS5" a variável 'resultado'.

        // ** A nossa expressão é TRUE, assim, é retornado "Vou comprar o PS5" para a variável 'resultado'.

        /*
            Vale lembrar que este operador RETORNA algum valor, e por isso, ele deve ser colocado como o valor de uma variável
            ou passado como argumento para um método.

            Então NÃO podemos simplesmente tacá-lo em nosso código assim:
            > contaBancaria >= 3000 ? "Vou comprar o PS5" : "Não vou comprar o PS5";

            Como a expressão é verdadeira, pois contaBancaria (8000) é maior que 3000, seria a mesma
            coisa que colocar a string no código dessa forma:
            > "Vou comprar o PS5";


            Ele deve estar assim:

            // dando o retorno para uma variável:
            resultado = contaBancaria >= 3000 ? "Vou comprar o PS5" : "Não vou comprar o PS5";

            ou assim

            // dando o retorno para um método:
            System.out.println(contaBancaria >= 3000 ? "Vou comprar o PS5" : "Não vou comprar o PS5";)
        */
    }
}
