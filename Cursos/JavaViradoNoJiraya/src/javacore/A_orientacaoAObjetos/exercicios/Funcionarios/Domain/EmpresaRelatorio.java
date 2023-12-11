package javacore.A_orientacaoAObjetos.exercicios.Funcionarios.Domain;

public class EmpresaRelatorio
{
    public void imprimirDadosDoFuncionario(Funcionario funcionario)
    {
        if (funcionario.getSalary() == null || funcionario.getName() == null) return;

        int totalSalarios = funcionario.getSalary().length;

        System.out.println("Nome: " + funcionario.getName());
        System.out.println("Idade: " + funcionario.getAge());

        for (int i = 0; i < totalSalarios; i++)
        {
            System.out.println(("Salário - " + (i+1) )+ ": " + funcionario.getSalary()[i]);

        }
        imprimirMediaSalarial(funcionario);
    }

    public void imprimirMediaSalarial(Funcionario funcionario)
    {
        if (funcionario.getSalary() == null || funcionario.getName() == null) return;

        int totalSalarios = funcionario.getSalary().length;
        double valorTotal = 0;
        for (int i = 0; i < totalSalarios; i++)
        {
            valorTotal += funcionario.getSalary()[i];
        }
        System.out.println("Média salarial: " + (valorTotal / totalSalarios));
    }
}
