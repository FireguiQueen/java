package Javacore.A_orientacaoAObjetos.Associacao.ObjetosEmArrays;

public class Main
{
    public static void main(String[] args)
    {
        Personagem p1 = new Personagem("Joewl", "Arqueiro");
        Personagem p2 = new Personagem("Gerald", "Bruxo");

        // Para armazenar números inteiros dentro de um array, o array precisa ser do tipo 'int'.
        // Para armazenar objetos instanciados da classe "Personagem", o array precisa ser do tipo "Personagem".

        // Ambas as variáveis: p1 e p2 salvam as referências dos objetos criados, logo,
        // este array nada mais é do que uma lista de referências para objetos da classe "Personagem".
        Personagem[] personagens = new Personagem[]{p1, p2};

        for (int i = 0; i < personagens.length; i++)
        {
            System.out.println("p" + (i + 1));
            personagens[i].information();
        }



    }
}
