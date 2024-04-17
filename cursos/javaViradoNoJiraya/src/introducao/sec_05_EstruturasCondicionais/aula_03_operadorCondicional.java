// ESTRUTURA CONDICIONAL: OPERADOR CONDICIONAL/TERNÁRIO
/*
    O operador ternário é utilizado para substituir uma estrutura condicional simples,
    que envolva apenas um "if" e um "else".
*/
package introducao.e_EstruturasCondicionais;


public class Aula_011___estruturaCondicional_III
{
    public static void main(String[] args)
    {
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
            System.out.println(contaBancaria >= 3000 ? "Vou comprar o PS5" : "Não vou comprar o PS5");
        */


        // OPERADOR CONDICIONAL PODE SUBSTITUIR: IF   ELSE IF   E   ELSE?
        /*
            Sim, ele pode, mas você JAMAIS deve fazer isso.
        */
        int idade = 19;
        String categoriaFutebol = (idade <= 15) ? "Infantil" : (idade >= 16 && idade <= 18) ? "Juvenil" : "Adulta";

        // Primeiro, avaliamos a expressão: idade <= 15 (a variável idade é MENOR ou IGUAL a 15?).
        // Se for "TRUE", será retornado "Infantil"; se for "FALSE", uma expressão diferente será analisada.

        // A expressão a ser analisada é: (idade >= 16 && idade <= 18) (a variável idade é MAIOR ou IGUAL a 16 E MENOR ou IGUAL a 18?).
        // Se for "TRUE", será retornado "Juvenil"; se for "FALSE", será retornado "Adulta".
    }
}
