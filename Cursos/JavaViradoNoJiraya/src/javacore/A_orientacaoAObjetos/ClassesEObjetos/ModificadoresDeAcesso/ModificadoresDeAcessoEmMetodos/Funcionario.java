// MODIFICADORES DE ACESSO EM MÉTODOS
/*
    Quando definimos um método como "private", significa que apenas as instruções dentro da
    própria classe terão acesso a este método.
*/

package javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmMetodos;

public class Funcionario
{
    // Método público. Quando um objeto for criado a partir desta classe, podemos acessar este método.
    // Exemplo: funcionario.mensagemBoasVindas();     <--- é possível.
    public void mensagemBoasVindas()
    {
        System.out.println("Olá, seja muito bem-vindo!");
    }

    // Método privado. Apenas instruções dentro desta classe têm acesso a este método.
    // Exemplo: funcionario.historiaEmpresa();     <--- não é possível.
    private void historiaEmpresa()
    {
        System.out.println("Somos a &-Company e contratamos apenas os profissionais mais qualificados do mercado. Nossa empresa surgiu em meados dos anos 70 com o objetivo de...");
    }

    // Método público. Quando um objeto for criado a partir desta classe, podemos acessá-lo.
    // Este método faz uma chamada ao método privado "historiaEmpresa()".
    // Ele pode invocar este método privado pois ele pertence ao mesmo bloco onde o método privado foi criado.
    public void exibirHistoriaEmpresa()
    {
        historiaEmpresa();
    }

}
