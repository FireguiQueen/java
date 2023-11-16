// ESTRUTURA CONDICIONAL: OPERADOR CONDICIONAL/TERNÁRIO
/*
    O operador ternário é utilizado para substituir uma estrutura condicional simples,
    que envolva apenas um "if" e um "else".


*/
package introducao;


public class Aula_011_estruturaCondicional_III
{
    public static String oi()
    {
        System.out.println("oi");
        return;
    }

    public static void main(String[] args)
    {
        // Começaremos com uma expressão e uma interrogação.
        // Caso ela seja avaliada como "true", a primeira parte é executada, caso ela seja false, a segunda parte será.

        double contaBancaria = 8000;
        String vouSairHoje = contaBancaria >= 3000? "Vou comprar o PS5" : "Não vou comprar o PS5";

        // Primeiro foi definido uma variável do tipo double, e ela representa nosso saldo.
        // Depois é temos a expressão "contaBancaria >= 3000".
        // >> Se for 'true', será retornado "Vou comprar o PS5"
        // >> Se for 'false' seŕa retornado "Não vou comprar o PS5"

        System.out.println(5==5? oi() : "cu");
        /*
            Vale lembrar que este operador RETORNA
        */
    }
}
