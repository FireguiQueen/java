package javacore.A_orientacaoAObjetos.exercicios.dominios;

public class EmpresaRelatorio
{


    public void dadosDoFuncionario(Funcionario funcionario)
    {
        int totalSalarios = funcionario.salary.length;

        System.out.println("Nome: " + funcionario.name);
        System.out.println("Idade: " + funcionario.age);

        for (int i = 0; i < totalSalarios; i++)
        {
            System.out.println("Salário: " + funcionario.salary[i]);

        }
    }

    public double mediaSalarial(Funcionario funcionario)
    {
        int totalSalarios = funcionario.salary.length;
        double valorTotal = 0;
        for (int i = 0; i < totalSalarios; i++)
        {
            valorTotal += funcionario.salary[i];
        }
        return valorTotal / totalSalarios;
    }
}
