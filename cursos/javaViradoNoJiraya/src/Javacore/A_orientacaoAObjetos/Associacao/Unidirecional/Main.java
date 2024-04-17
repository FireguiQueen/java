// ASSOCIAÇÃO UNIDIRECIONAL
/*
    Há uma associação unidirecional entre jogadores e equipes.

    O jogador conhece a equipe à qual pertence, mas uma equipe não precisa conhecer os jogadores.
    Em outras palavras, um objeto da classe "jogador" sempre irá possuir um time, e ele terá
    acesso a esse time.
    Já um objeto da classe "time" não sabe da existência de nenhum outro objeto.

     "Se há uma associação unidirecional entre A (jogador) e B (time), isso significa que A está relacionado
     com B, mas B não está automaticamente relacionado com A na mesma forma.
*/

package Javacore.A_orientacaoAObjetos.Associacao.Unidirecional;

public class Main
{
    public static void main(String[] args)
    {
        Team BR = new Team("Seleção Brasileira");
        Team AR = new Team("Seleção Argentina");

        Player neymar = new Player("Neymar", BR);
        neymar.printInf();
    }
}
