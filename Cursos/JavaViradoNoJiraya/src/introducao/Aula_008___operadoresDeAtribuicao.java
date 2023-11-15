// OPERADORES DE ATRIBUIÇÃO - Syntactic sugar
/*
    "Syntatic sugar" é uma forma sintaxe que é designada para fazer as coisas serem mais fáceis de serem
    lidas ou expressadas. Faz a linguagem "mais doce" para o uso humano.

    ** São eles:
    valor da variavel mais outro valor: +=
    valor da variavel menos outro valor: -=
    valor da variavel vezes outro valor: *=
    valro da variável dividido por outro valor: /=

    A ideia deles é que você sempre utilize o valor da variável
    juntamente a um operador
*/

package introducao;

public class Aula_008___operadoresDeAtribuicao
{
    public static void main(String[] args)
    {
        // EXEMPLOS
        /*
            Você tem uma conta no banco com R$10.000;
            - Você deseja comprar Y produto.
            Ao realizar a compra, é de se esperar que o saldo da sua conta seja diminuido de acordo com o preço do produto.
        */ // Em código, podemos fazer isso de duas maneiras:

        // 1. Jeito "padrão":
        double saldoContaBancaria = 10000;
        double precoDoProduto = 300;
        saldoContaBancaria = saldoContaBancaria - precoDoProduto;
        // Isto é: quero que a variavel "saldoConta.." receba o valor dela (10.000) menos o precoDoProduto (300);

        // 2. Syntatic sugar:
        double saldoContaBancaria0 = 10000;
        double precoProduto = 300;
        saldoContaBancaria0 -= precoProduto;
        // isto é: a variável "saldoContaBancaria" terá seu valor como ela mesma MENOS (-) a variável preço produto.



        

    }
}
