package javacore.A_orientacaoAObjetos.exercicios.Anime;
import javacore.A_orientacaoAObjetos.exercicios.Anime.Domain.Anime;

public class Main
{
    public static void main(String[] args)
    {
        Anime anime001 = new Anime
        (
        "Steins;gate", "Ação/drama", "5pb",
        "A group of friends create a time machine that can send messages to the past and alter their present timeline.",
        2011,
        new String[][]{ {"Poggers", "coggers"}, {"punners", "kronners"}, {"pronners"}}
        );

        anime001.getAllInformation();
    }
}
