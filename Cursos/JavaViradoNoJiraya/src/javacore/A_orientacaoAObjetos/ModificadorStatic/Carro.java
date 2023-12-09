// STATIC
/*

*/
package javacore.A_orientacaoAObjetos.ModificadorStatic;

public class Carro
{
    private String nome;
    private int ano;

    public static int qntCarrosCriados;

    Carro(String nome, int ano)
    {
        this.nome = nome;
        this.ano = ano; 
    }
}
