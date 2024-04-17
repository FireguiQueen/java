// OPERADORES DE ATRIBUIÇÃO - Syntactic sugar
/*
    "Syntactic sugar" é uma forma de sintaxe projetada para tornar as coisas mais fáceis de serem
    lidas ou expressadas. Torna a linguagem "mais doce" para o uso humano.

    Na "syntatatic sugar" temos algumas formas de realizar reatribuições de valores.
    ** São eles:
    variável recebe ela mesma MAIS outro valor: +=
    variável recebe ela mesma MENOS outro valor: -=
    variável recebe ela mesma VEZES outro valor: *=
    variável recebe ela mesma DIVIDA por outro valor: /=

    >> A ideia é utilizar esses operadores quando a variável for receber o valor dela mesma.
*/

package introducao.sec_04_Operadores;

public class aula_04
{
    public static void main(String[] args)
    {
        // EXEMPLO
        /*
            -> Você tem uma conta no banco com R$10.000;
            ->  Você deseja comprar Y produto.
            Ao realizar a compra, é de se esperar que o saldo da sua conta seja diminuido de acordo com o preço do produto.
        */

        // 1. Jeito "padrão":
        double saldoContaBancaria = 10000;
        double precoDoProduto = 300;
        saldoContaBancaria = saldoContaBancaria - precoDoProduto;
        // Isto é: quero que a variavel "saldoContaBancaria" receba a variável  'saldoContaBancaria' menos o 'precoDoProduto' (300);

        // 2. Syntatic sugar:
        double saldoContaBancaria0 = 10000;
        double precoProduto = 300;
        saldoContaBancaria0 -= precoProduto;
        // isto é: a variável "saldoContaBancaria" receberá ela mesma MENOS (-) a variável 'precoProduto'.


        // ** OUTROS EXEMPLOS:
        int num = 10;
        num *= 2;  // mesma coisa que fazer: num = num * 2;

        int numero = 100;
        numero *= 2; // mesma coisa que: numero = numero * 2;
        // VALE LEMBRAR QUE, A VARIÁVEL JÁ DEVE POSSUIR UM VALOR. FAZER ISSO RETORNARÁ ERRO.
        //> int numeroInteiro;
        //> numeroInteiro = numeroInteiro * 2;
        // >>>>      ou     <<<<
        // int numeroInteiro;
        // numeroInteiro *= 2;

        // ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** *****

        // INCREMENTO E DECREMENTO
        /*
            Incrementar é simplesmente adicionar 1 ao valor da nossa variável.
            E decrementar significa subtrair 1 do valor da nossa variável.
        */
        double carteira = 2.0;
        carteira++; // Adiciona "+1" ao valor da variável 'carteira'.
        System.out.println(carteira); // 3

        carteira--; // Subtrai "-1" do valor da nossa variável.
        System.out.println(carteira); // 2

        // PÓS e PRÉ INCREMENTO
        // pós:
        carteira++;

        // pré:
        ++carteira;

        /*
            Mas há alguma diferença? Sim, uma pequena diferença. No entanto, vamos ter algo em mente antes.
            Lembre-se, tanto o operador de decremento quanto o de incremento são, na verdade, equivalentes a:
            carteira = carteira + 1;

            Portanto, independentemente de onde o "carteira++" seja colocado, a variável carteira sempre terá seu valor
            incrementado em 1.
        */
        // POR EXEMPLO:
        int numeroInt = 10;
        System.out.println(numeroInt++); // 10  (aqui é printado o valor de 'numeroInt'. Depois é feita a expressão: numeroInt = numeroInt + 1)
        System.out.println(numeroInt);   // 11  (a linha acima incrementou +1 à variável numeroInt (10))

        // NESTE CASO:
        int numeroInteiro = 0;
        System.out.println(numeroInteiro++); // 0
        // primeiro a nossa variável é impressa  e DEPOIS (pós) a nossa variável terá +1 ao seu valor

        // NESTE CASO:
        int numInteiro = 0;
        System.out.println(++numInteiro); // 1
        // primeiro é adicionado +1 à nossa variável, e aí SIM o valor é impresso.

    }
}
