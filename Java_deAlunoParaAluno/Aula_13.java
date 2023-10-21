// CONSTANTES
/* 
    Em java, podemos transformar nossas variáveis em constantes (ou seja, o valor NÃO pode ser alterado)
    utilizando a palavra-chave 'final' antes do tipo de dado.

    Utilizaremos constantes quando vejos que o valor sempre será fixo, e que não precisa sofrer alterações.
    É uma boa prática os nomes das variáveis constantes serem em letras maiúsculas.   
*/ 

public class Aula_13{
    public static void main(String[] args)
    {
        final int CPF = 04133624780;

        System.out.println("CPF: " + CPF);
    }
}