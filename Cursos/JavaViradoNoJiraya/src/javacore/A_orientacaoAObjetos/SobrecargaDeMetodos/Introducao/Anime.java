/*
    Vamos supor que você esteja trabalhando para uma empresa de streaming de animes.

    Para criar um novo anime, usaremos uma classe de domínio e instanciaremos objetos
    a partir dela, e cada objeto representará um anime diferente.

    Para isso, você cria duas classes: "Main" e "Anime"
    A classe 'Main' será o nosso programa principal.
    A classe 'Anime' será nossa classe de domínio. A classe responsável por criar novos animes.

    Este projeto se iniciou com apenas 3 propriedades:
    - Nome
    - Gênero
    - N. episodios

    Na classe 'Main', quando um objeto for criado a partir desta classe, ele herdará essas propriedades vázias.
    E para darmos valores a essas propriedades, usaremos o método "init()" deste objeto.

    O método 'init()' conterá três parâmetros: String nome, String genero, int numeroEpisodios
    Até aqui não há nenhum problema. Basta acessar o objeto, acessar este método e passar os argumentos para esses parâmetros.

    ! Porém, frequentemente seu chefe pede a você para que faça alterações, adicionando novas propriedades.
    ->> Ao longo do tempo as propriedades abaixo foram adicionadas a classe:
    - ano de lançamento
    - descrição

    E claro, para sermos capazes de dar valores a essas propriedades, novos parâmetros irão precisar existir
    no nosos método 'init()'.

    Então um problema pode surgir:
    Na nossa classe 'Main', o método 'init()' recebe apenas três argumentos, pois no inicio do projeto, havia apenas
    três parâmetros.
    Mas agora, nosso método requer mais argumentos, e isto quebraria totalmente nosso código na classe "Main".

    Como solução, temos a sobrecarga de métodos.
    Ela consiste em você criar, por exemplo, dois métodos com o mesmo nome. Porém, o outro método criado, conterá
    os mesmo parâmetros porém com alguns novos.

    Isto faz com que a nossa classe principal não seja quebrada. Pois mesmo passando apenas 3 argumentos ao método
    ainda irá funcionar.

*/
package javacore.A_orientacaoAObjetos.SobrecargaDeMetodos.Introducao;

public class Anime
{
    /* propriedades padrões */
    private String nome;
    private int numeroEpisodios;
    private String genero;

    /* propriedades adicionadas */
    private int anoDeLancamento;
    private String descricao;


    public void init(String nome, int numeroEpisodios, String genero)
    {
        this.nome = nome;
        this.numeroEpisodios = numeroEpisodios;
        this.genero = genero;
    }
}
