// OPERADORES DE ATRIBUIÇÃO - Syntactic sugar
/*
    "Syntactic sugar" é uma forma de sintaxe projetada para tornar as coisas mais fáceis de serem
    lidas ou expressadas. Torna a linguagem "mais doce" para o uso humano.

    ** São eles:
    valor da variavel mais outro valor: +=
    valor da variavel menos outro valor: -=
    valor da variavel vezes outro valor: *=
    valro da variável dividido por outro valor: /=

    A ideia por trás deles é que você possa usar o valor da variável
    juntamente com um operador para realizar a operação desejada.
*/

package introducao;
public class Aula_008___operadoresDeAtribuicao
{
    public static void main(String[] args)
    {
        // EXEMPLOS
        /*
            -> Você tem uma conta no banco com R$10.000;
            ->  Você deseja comprar Y produto.
            Ao realizar a compra, é de se esperar que o saldo da sua conta seja diminuido de acordo com o preço do produto.
        */

        // 1. Jeito "padrão":
        double saldoContaBancaria = 10000;
        double precoDoProduto = 300;
        saldoContaBancaria = saldoContaBancaria - precoDoProduto;
        // Isto é: quero que a variavel "saldoContaBancaria" receba o valor dela (10.000) menos o 'precoDoProduto' (300);

        // 2. Syntatic sugar:
        double saldoContaBancaria0 = 10000;
        double precoProduto = 300;
        saldoContaBancaria0 -= precoProduto;
        // isto é: a variável "saldoContaBancaria" receberá ela mesma MENOS (-) a variável 'precoProduto'.


        // Outros exemplos:
        int num = 10;
        num *= 2;  // seria a mesma coisa que fazer: num = num * 2;

        // VALE LEMBRAR QUE, A VARIAVEL JA DEVE POSSUIR UM VALOR. FAZER ISSO RETORNARÁ ERRO.
        // int numeroInteiro;
        // numeroInteiro = numeroInteiro * 2;
        // >>>>      ou
        // int numeroInteiro;
        // numeroInteiro *= 2;







    }
}
