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
        // >>>>      ou     <<<<
        // int numeroInteiro;
        // numeroInteiro *= 2;


        // INCREMENTO E DECREMENTO
        /*
            Incrementar é simplesmente adicionar 1 ao valor da nossa variável,
            enquanto decrementar significa subtrair 1 do valor da nossa variável.
        */
        double carteira = 2.0;
        carteira++; // Adiciona "+1" ao valor da variável 'carteira'.
        System.out.println(carteira); // 3

        carteira--; // Subtrai "-1" do valor da nossa variável.
        System.out.println(carteira); // 2

        // PÓS e PRÉ INCREMENTO
        // pós
        carteira++;

        // pré
        ++carteira;

        /*
            Mas há alguma diferença? Sim, uma pequena diferença. No entanto, vamos ter algo em mente antes.
            Lembre-se, tanto o operador de decremento quanto o de incremento são, na verdade, equivalentes a:
            carteira = carteira + 1;

            Portanto, independentemente de onde o "carteira++" seja colocado, a variável carteira sempre terá seu valor
            incrementado em 1.
        */
        // EXEMPLO:
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
