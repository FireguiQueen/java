// CONSTANTES
/* 
    Em java, podemos transformar nossas variáveis em constantes (ou seja, o valor NÃO poderá ser alterado);
    Basta utilizar a palavra-chave 'final' antes do tipo de dado.

    Utilizaremos constantes quando vejos que o valor sempre será fixo, e que não precisa sofrer alterações.
    >> É uma boa prática os nomes das variáveis constantes serem em letras maiúsculas.   
*/ 

public class Aula_13{
    public static void main(String[] args)
    {
        final long CPF = 02133122750; // define uma constante do tipo 'long'.
        System.out.println("CPF: " + CPF);


        // Tentar fazer isto retornará erros. Pois variáveis constantes não podem ter seus valores alterados.
        /*
            CPF = 24324;
        */
    }
}