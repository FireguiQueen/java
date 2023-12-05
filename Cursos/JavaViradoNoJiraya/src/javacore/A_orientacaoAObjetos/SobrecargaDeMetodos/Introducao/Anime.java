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

    Porém, frequentemente seu chefe pede a você para que faça alterações, adicionando
    novas propriedades.
    E ao longo do tempo as propriedades abaixo foram adicionadas a classe:
    - ano de lançamento
    - descrição



*/
package javacore.A_orientacaoAObjetos.SobrecargaDeMetodos.Introducao;

public class Anime
{
    private String nome;
    private int numeroEpisodios;
    private String genero;

    private int anoDeLancamento;
}
