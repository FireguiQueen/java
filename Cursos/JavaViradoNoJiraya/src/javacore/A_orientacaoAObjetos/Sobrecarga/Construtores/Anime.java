package javacore.A_orientacaoAObjetos.Sobrecarga.Construtores;

public class Anime
{
    private String nome;
    private int anoDeLancamento;
    private String categoria;
    private int idadeRecomendada;


    // CONSTRUTOR ORIGINAL.
    public Anime(String nome, int anoDeLancamento)
    {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // NOVO CONSTRUTOR COM MAIS PARÂMETROS (requer mais argumentos)
    /*
     * Caso você precise adicionar mais parâmetros ao seu construtor, você pode
     * manter o original e criar este mesmo construtor, porém, com mais parâmetros.

     * Assim, caso haja alguma linha na classe principal usando o construtor
     * passando apenas dois argumentos, aquela linha ainda vai funcionar. Sendo que
     * se este construtor fosse o único, esta mesma linha quebraria, pois estaria
     * passando apenas dois argumentos, e este requer 3 argumentos.
    */
    public Anime(String nome, int anoDeLancamento, String categoria)
    {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.categoria = categoria;
    }


    // ELIMINANDO REDUNDÂNCIA.
    /*
        Para eliminar essa redundância, podemos fazer da seguinte forma:
        - this()

        Lembre-se, o "this" se refere ao contexto atual. Então, utilizar "this()"
        seria o mesmo que chamar o construtor padrão da classe.

        Não usar o "this()" poderia ser um problema.
        Pois, caso criemos um objeto com um nome diferente de "Anime", estaríamos
        tentando acessar um construtor que não existe ao tentar fazer
        "Anime()".

        --> Se um objeto é criado com o nome de "Anime00", então, seu construtor se chamará
        "Anime00". Por isso, o "this()" é super importante, ele se refere ao contexto
        onde está sendo utilizado.
    */

    public Anime(String nome, int anoDeLancamento, String categoria, int idadeRecomendada)
    {
        this(nome, anoDeLancamento, categoria);
        this.idadeRecomendada = idadeRecomendada;
    }
}
