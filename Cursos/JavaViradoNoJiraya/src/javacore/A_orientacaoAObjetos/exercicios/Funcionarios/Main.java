package javacore.A_orientacaoAObjetos.exercicios.Funcionarios;

import javacore.A_orientacaoAObjetos.exercicios.Funcionarios.dominions.Funcionario;
import javacore.A_orientacaoAObjetos.exercicios.Funcionarios.dominions.EmpresaRelatorio;

public class Main
{
    public static void main(String[] args)
    {
        EmpresaRelatorio relatorio = new EmpresaRelatorio();


        Funcionario funcionario_001 = new Funcionario();

        funcionario_001.name = "Joaquim";
        funcionario_001.age = 32;
        funcionario_001.salary = new double[]{500, 200, 300};

        relatorio.imprimirDadosDoFuncionario(funcionario_001);


    }
}
