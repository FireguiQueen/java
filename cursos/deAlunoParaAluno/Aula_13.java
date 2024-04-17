// CONSTANTES
/* 
    Em Java, podemos transformar nossas variáveis em constantes (ou seja, o valor NÃO poderá ser alterado);
    Basta utilizar a palavra-chave 'final' antes do tipo de dado.

    Utilizaremos constantes quando sabemos que o valor sempre será fixo e não precisa sofrer alterações.
    >> É uma boa prática que os nomes das variáveis constantes sejam escritos em letras maiúsculas.
*/

public class Aula_13{
    public static void main(String[] args)
    {
        final long CPF = 02133122750; // define uma constante do tipo 'long'.
        System.out.println("CPF: " + CPF);


        // Tentar fazer isso retornará erros. Variáveis constantes não podem ter seus valores alterados.
        /*
            CPF = 24324;
        */
    }
}
