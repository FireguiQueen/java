package javacore.A_orientacaoAObjetos.Sobrecarga.Metodos;

public class Main
{
    public static void main(String[] args)
    {
        Anime anime001 = new Anime();

        // Utiliza o método init() "original".
        anime001.init("Steins;Gate", 26, "Ficção científica");

        // Utiliza o método init() modificado, criado para ser o mesmo método original, porém, com mais parâmetros.
        anime001.init("Steins;Gate", 26, "Ficção científica", 2011, "Um grupo de amigos cria uma máquina do tempo para mandar mensagens para o passado");

        anime001.printInf();
    }
}
