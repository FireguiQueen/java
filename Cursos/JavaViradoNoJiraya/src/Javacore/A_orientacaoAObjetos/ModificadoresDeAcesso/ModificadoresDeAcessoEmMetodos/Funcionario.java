// MODIFICADORES DE ACESSO EM MÉTODOS
/*
    A utilização do modificador de acesso "private" ao definir um método implica que somente o próprio
    objeto ao qual o método pertence terá permissão para chamá-lo. Isso significa que outras partes do
    programa não terão acesso direto a esse método.

    Resumidamente, um método private só pode acessado pelo seu próprio objeto.
    Outras classes não terão acesso a este método diretamente.
*/

package Javacore.A_orientacaoAObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmMetodos;

public class Funcionario
{
    // MÉTODO PÚBLICO. Quando um objeto for criado a partir desta classe, podemos acessar este método.
    // Exemplo: funcionario.mensagemBoasVindas();   <--- é possível.
    public void mensagemBoasVindas()
    {
        System.out.println("Olá, seja muito bem-vindo!");
    }

    // MÉTODO PRIVADO. Apenas instruções dentro desta classe têm acesso a este método.
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
