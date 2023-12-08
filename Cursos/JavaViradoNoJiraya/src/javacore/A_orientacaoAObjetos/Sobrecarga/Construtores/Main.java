package javacore.A_orientacaoAObjetos.Sobrecarga.Construtores;

public class Main
{
    public static void main(String[] args)
    {
        // Este objeto foi criado a partir do construtor "original". Ele pede apenas dois argumentos.
        Anime anime001 = new Anime("Shingeki no Kyojin", 2009);

        // Este objeto foi criado a partir do segundo constructor. Ele pede mais um argumento: categoria, do tipo String.
        Anime anime002 = new Anime("Shingeki no Kyojin", 2009, "Ação/Drama");

    }
}
