//
/*

*/

package Javacore.A_orientacaoAObjetos.Associacao.Unidirecional;

public class Player
{
    private String name;
    private Team teamName;

    public Player(String name, Team teamName)
    {
        this.name = name;
        this.teamName = teamName;
    }

    public void printInf()
    {
        System.out.println("Nome do jogador: " + name);
        System.out.println("Time: " + teamName);
    }
}
