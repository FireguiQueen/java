package javacore.A_orientacaoAObjetos.Sobrecarga.Construtores;

public class Anime
{
    private String nome;
    private int anoDeLancamento;
    private String categoria;


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
}
