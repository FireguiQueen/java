// OPERADORES DE ATRIBUIÇÃO (Syntactic sugar)
/*
    São eles:
    atribuir um valor: =
    valor da variavel mais outro valor: +=
    valor da variavel menos outro valor: -=
    valor da variavel vezes outro valor: *=
    valro da variável dividido por outro valro: /=

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
        */ // Em código, ficaria assim:
        double saldoContaBancaria = 10000;
        double precoDoProduto = 300;

        // Ao realizar a compra:
        saldoContaBancaria = saldoContaBancaria - precoDoProduto;
        // Isto é: quero que a variavel "saldo da conta" receba o valor dela (10.000) menos o precoDoProduto (300);



    }
}
