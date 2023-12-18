// Classes-de-domínio do TIME.
/*
    Esta classe é responsável por criar objetos que irão representar um time de futebol.
    Este classe não possui nenhuma ligação com a classe "Player" (cuja representa um jogador de futebol)
*/
package Javacore.A_orientacaoAObjetos.Associacao.Unidirecional;

public class Team
{
    private String name;

    public Team(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
