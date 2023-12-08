// BLOCOS DE INICIALIZAÇÃO
/*
    Blocos de inicialização são blocos de alta prioridade.

    Podemos pensar na ordem desta forma:
    1. Alocar espaço em memória para este objeto
    2. As propriedades são iniciadas com valores padrão ou valores definidos da classe
    3. O bloco de inicialização é executado (caso haja um)
    4. O constructor é executado
*/

package javacore.A_orientacaoAObjetos.BlocosDeInicializacao;

public class Anime
{
    private String nome;

    Anime(String nome)
    {
        this.nome = nome;
    }
    
    // Isto é um bloco de inicialização.
    {
        /*
            Isto sempre retornará "null". Pois como o bloco de inicialização é sempre executado antes do
            constructor, a propriedade "nome" ainda não possui um valor, apenas o valor definido por padrão (null)
        */
        System.out.println(this.nome);
    }


}
