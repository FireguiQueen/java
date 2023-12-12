package javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmBlocosDeInicializacao;

public class Main
{
    public static void main(String[] args)
    {
        // 1. Bloco de inicialização estático será executado pois a classe foi invocada.
        // 2. O método "melhorAnime()" é executado.
        Anime.melhorAnime();

        // Este mesmo bloco de inicialização não será mais executado, pois ele foi executado assim que a
        // JVM teve que carregar a classe "Anime".
        Anime.melhorAnime();
        Anime.melhorAnime();
        Anime.melhorAnime();
    }
}
