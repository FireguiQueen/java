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


    // ELIMINANDO REDUNDANCIA.
    /*
        Observe que este segundo constructor utiliza o mesmos "this" do constructor
        original, a diferença é que ele está utilizando um "this" a mais, afinal, ele
        possui um parametro a mais.

        Para eleminar esta redundancia, podemos fazer da seguinte forma:
        - this()

        Lembre-se, o this se refere ao contexto atual. Então utilizar "this()"
        seria a mesma coisa que "Anime()".
        Porém, fazendo: "Anime()" poderia ser um problema.
        Pois caso a gente crie um objeto com um nome diferente de "Anime()", estariamos
        tentando acessar um constructor que nao existe.

        --> Se um objeto é criado com o nome de "Anime00", então, seu constructor se chamará
        "Anime00". Por isso, o "this()" é super importante, ele vai se referir ao contexto
        onde está.  
    */
    public Anime(String nome, int anoDeLancamento, String categoria, int idadeRecomendada)
    {
        this(nome, anoDeLancamento, categoria);
        this.idadeRecomendada = idadeRecomendada;
    }
}
