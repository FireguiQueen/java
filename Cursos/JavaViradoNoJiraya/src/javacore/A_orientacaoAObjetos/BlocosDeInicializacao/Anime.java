// BLOCOS DE INICIALIZAÇÃO
/*
    Blocos de inicialização são blocos de alta prioridade. Ao criarmos um objeto,
    podemos pensar na seguinte ordem:
       1. É alocado espaço em memória para este objeto;
       2. As propriedades são inicializadas com valores default (0, null..) ou valores definidos;
       3. O bloco de inicialização é executado (caso haja um);
       4. O constructor é executado. Podendo reescrever os valores das propriedades.
*/

package javacore.A_orientacaoAObjetos.BlocosDeInicializacao;

public class Anime
{
    private String nome;

    // bloco de inicialização:
    {
        /*
            Sempre que um objeto for criado, será printado "NULL".
            -> O bloco de inicialização é sempre executado antes do constructor.
            -> A propriedade "nome" ainda não possui um valor, apenas o valor definido por default (NULL)
        */
        System.out.println(this.nome);
    }

    Anime(String nome)
    {
        this.nome = nome;
    }




}
