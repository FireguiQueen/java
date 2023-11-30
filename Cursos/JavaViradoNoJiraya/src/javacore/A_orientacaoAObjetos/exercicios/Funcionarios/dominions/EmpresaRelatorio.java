package javacore.A_orientacaoAObjetos.exercicios.Funcionarios.dominions;

public class EmpresaRelatorio
{
    public void imprimirDadosDoFuncionario(Funcionario funcionario)
    {
        if (funcionario.salary == null || funcionario.name == null) return;

        int totalSalarios = funcionario.salary.length;

        System.out.println("Nome: " + funcionario.name);
        System.out.println("Idade: " + funcionario.age);

        for (int i = 0; i < totalSalarios; i++)
        {
            System.out.println(("Salário - " + (i+1) )+ ": " + funcionario.salary[i]);

        }
        imprimirMediaSalarial(funcionario);
    }

    public void imprimirMediaSalarial(Funcionario funcionario)
    {
        if (funcionario.salary == null || funcionario.name == null) return;

        int totalSalarios = funcionario.salary.length;
        double valorTotal = 0;
        for (int i = 0; i < totalSalarios; i++)
        {
            valorTotal += funcionario.salary[i];
        }
        System.out.println("Média salarial: " + (valorTotal / totalSalarios));
    }
}
