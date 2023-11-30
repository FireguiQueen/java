package javacore.A_orientacaoAObjetos.exercicios.Funcionarios;

import javacore.A_orientacaoAObjetos.exercicios.Funcionarios.Funcionario;

public class EmpresaRelatorio
{
    public void dadosDoFuncionario(Funcionario funcionario)
    {
        int totalSalarios = funcionario.salary.length;

        System.out.println("Nome: " + funcionario.name);
        System.out.println("Idade: " + funcionario.age);

        for (int i = 0; i < totalSalarios; i++)
        {
            System.out.println("Salário -" + (i+1) + funcionario.salary[i]);

        }
    }

    public void mediaSalarial(Funcionario funcionario)
    {
        int totalSalarios = funcionario.salary.length;
        double valorTotal = 0;
        for (int i = 0; i < totalSalarios; i++)
        {
            valorTotal += funcionario.salary[i];
        }
        System.out.println(valorTotal / totalSalarios);
    }
}
