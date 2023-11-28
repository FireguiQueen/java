package javacore.A_orientacaoAObjetos.exercicios.dominios;

public class EmpresaRelatorio
{
    public void imprimirDados(Funcionario funcionario)
    {
        System.out.println("Nome: " + funcionario.name);
        System.out.println("Idade: " + funcionario.age);
        System.out.println("Salário: " + funcionario.salary);
    }
}
