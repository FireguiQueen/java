// MODIFICADORES DE ACESSO EM MÉTODOS
/*
    Quando definimos que um método é "private", significa que apenas as instruções dentro do
    objeto terão acesso a este método.

*/
package javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmMetodos;

public class Funcionario
{
    // Método público. Assim que um objeto for criado a partir desta classe, podemos acessar este método.
    // > funcionario.mensagemBoasVindas();     <--- é possível.
    public void mensagemBoasVindas()
    {
        System.out.println("Olá, seja muito bem vindo!");
    }

    // Método privado. Assim que um objeto for criado a partir desta classe, NÃO teremos acesso a este método:
    // > funcionario.historiaEmpresa();     <--- não é possível.
    private void historiaEmpresa()
    {
        System.out.println("Somos a &-Company, e contratamos apenas os mais qualificados do mercado. Nossa empresa surgiu em meados de 70, com o objetivo de.. .. ");
    }

    // Método público. Assim que um objeto for criado a partir desta classe, podemos acessá-lo.
    // Este método faz uma chamada ao método privado "historiaEmpresa()".
    public void exibirHistoriaEmpresa()
    {
        historiaEmpresa();
    }
}
