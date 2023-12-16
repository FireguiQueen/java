package Javacore.A_orientacaoAObjetos.Associacao.ObjetosEmArrays;

public class Personagem
{
    private String nome;
    private String classe;

    Personagem(String nome, String classe)
    {
        this.nome = nome;
        this.classe = classe;
    }

    public void information()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
    }
}
