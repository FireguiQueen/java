// classe-de-domínio do JOGADOR
/*
    Esta classe é responsável por criar objetos que irão representar um jogador.
    Este classe POSSUI uma ligação com a classe "team".

    Podemos observar que no constructor dessa classe, o nosso segundo argumento deve ser um objeto
    instanciado da classe "time".
*/

package Javacore.A_orientacaoAObjetos.Associacao.Unidirecional;

public class Player
{
    private String name;
    private Team team;

    public Player(String name, Team team)
    {
        this.name = name;
        this.team = team;
    }

    public void printInf()
    {
        System.out.println("Nome do jogador: " + name);
        System.out.println("Time: " + team.getName());
    }
}
