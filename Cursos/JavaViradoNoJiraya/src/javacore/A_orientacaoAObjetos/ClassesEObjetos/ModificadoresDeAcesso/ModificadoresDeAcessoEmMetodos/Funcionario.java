// MODIFICADORES DE ACESSO EM MÉTODOS
/*
    Quando definimos que um método é "private", significa que apenas as instruções do objeto terão acesso
    a ele.

*/
package javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmMetodos;

public class Funcionario
{
    public void mensagemBoasVindas()
    {
        System.out.println("Olá, seja muito bem vindo!");
    }

    private void historiaEmpresa()
    {
        System.out.println("Somos a &-Company, e contratamos apenas os mais qualificados do mercado. Nossa empresa surgiu em meados de 70, com o objetivo de.. .. ");
    }

    public void exibirHistoriaEmpresa()
    {
        historiaEmpresa();
    }
}
